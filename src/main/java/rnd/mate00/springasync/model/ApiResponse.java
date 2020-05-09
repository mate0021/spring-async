package rnd.mate00.springasync.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "items",
        "has_more",
        "quota_max",
        "quota_remaining"
})
public class ApiResponse {

    @JsonProperty("items")
    public List<StackOverflowUser> items = null;
    @JsonProperty("has_more")
    public Boolean hasMore;
    @JsonProperty("quota_max")
    public Integer quotaMax;
    @JsonProperty("quota_remaining")
    public Integer quotaRemaining;

    public List<StackOverflowUser> getItems() {
        return items;
    }

    public void setItems(List<StackOverflowUser> items) {
        this.items = items;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "items=" + items +
                ", hasMore=" + hasMore +
                ", quotaMax=" + quotaMax +
                ", quotaRemaining=" + quotaRemaining +
                '}';
    }
}