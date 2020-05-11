package rnd.mate00.springasync;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rnd.mate00.springasync.model.ApiResponse;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class SpringAsyncApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringAsyncApplication.class);

    @Autowired
    private StackOverflowLookupService stackOverflowLookupService;


    public static void main(String[] args) {
        SpringApplication.run(SpringAsyncApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CompletableFuture<ApiResponse> user1 = stackOverflowLookupService.findUserBy("1534211");
        CompletableFuture<ApiResponse> user2 = stackOverflowLookupService.findUserBy("1534212");
        CompletableFuture<ApiResponse> user3 = stackOverflowLookupService.findUserBy("1534214");
        CompletableFuture<ApiResponse> user4 = stackOverflowLookupService.findUserBy("1534215");

        CompletableFuture.allOf(user1, user2, user3, user4).join();

        log.info(user1.get().toString());
        log.info(user2.get().toString());
        log.info(user3.get().toString());
        log.info(user4.get().toString());

        stackOverflowLookupService.voidMethodThrowingException();
    }
}
