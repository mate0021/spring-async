package rnd.mate00.springasync;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import rnd.mate00.springasync.model.ApiResponse;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
@EnableAsync
public class SpringAsyncApplication implements CommandLineRunner {

    @Autowired
    private StackOverflowLookupService stackOverflowLookupService;


    public static void main(String[] args) {
        SpringApplication.run(SpringAsyncApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CompletableFuture<ApiResponse> user1 = stackOverflowLookupService.findUserBy("1534211");

        CompletableFuture.allOf(user1).join();

        System.out.println(user1.get());
    }
}
