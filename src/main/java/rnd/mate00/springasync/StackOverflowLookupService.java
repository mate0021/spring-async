package rnd.mate00.springasync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rnd.mate00.springasync.model.ApiResponse;

import java.util.concurrent.CompletableFuture;

@Service
public class StackOverflowLookupService {

    private static final String SO_API_URL = "https://api.stackexchange.com/2.2/users/%s?order=desc&sort=reputation&site=stackoverflow";

    @Autowired
    private RestTemplate restTemplate;

    @Async
    public CompletableFuture<ApiResponse> findUserBy(String id) {
        String apiUrl = String.format(SO_API_URL, id);
        System.out.println("Accessing url " + apiUrl);
        ApiResponse result = restTemplate.getForObject(apiUrl, ApiResponse.class);

        return CompletableFuture.completedFuture(result);
    }
}
