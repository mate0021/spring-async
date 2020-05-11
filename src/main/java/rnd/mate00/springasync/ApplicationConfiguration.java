package rnd.mate00.springasync;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executor;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // need to specify accepted encoding as StackOverflow API always sends compressed response:
        // https://api.stackexchange.com/docs/compression
        RestTemplate template = builder.build();
//        template.getInterceptors().add((httpRequest, bytes, clientHttpRequestExecution) -> {
//            httpRequest.getHeaders().set(HttpHeaders.ACCEPT_ENCODING, "gzip");
//            return clientHttpRequestExecution.execute(httpRequest, bytes);
//        });

        return template;
    }

//    @Bean
    /*
    Config of this bean moved to SpringAsyncConfig
     */
    public Executor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("SO-Lookup-");
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.initialize();

        return executor;
    }

//    @Bean
    /*
    Config of this bean moved to SpringAsyncConfig
     */
    public AsyncUncaughtExceptionHandler getAsyncExceptionHandler() {
         return new AsyncExceptionHandler();
    }
}
