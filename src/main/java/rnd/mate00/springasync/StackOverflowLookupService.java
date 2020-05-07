package rnd.mate00.springasync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class StackOverflowLookupService {

    private static final String SO_API_URL = "https://api.stackexchange.com/2.2/users/%s?order=desc&sort=reputation&site=stackoverflow";

    @Autowired
    private RestTemplate restTemplate;

    @Async
    public CompletableFuture<StackOverflowUser> findUserBy(String id) {
        String apiUrl = String.format(SO_API_URL, id);
        StackOverflowUser result = restTemplate.getForObject(apiUrl, StackOverflowUser.class);

        return CompletableFuture.completedFuture(result);
    }
}
