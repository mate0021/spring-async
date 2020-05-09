package rnd.mate00.springasync.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "badge_counts",
        "account_id",
        "is_employee",
        "last_modified_date",
        "last_access_date",
        "reputation_change_year",
        "reputation_change_quarter",
        "reputation_change_month",
        "reputation_change_week",
        "reputation_change_day",
        "reputation",
        "creation_date",
        "user_type",
        "user_id",
        "location",
        "website_url",
        "link",
        "profile_image",
        "display_name"
})
public class StackOverflowUser {

    @JsonProperty("badge_counts")
    public BadgeCounts badgeCounts;
    @JsonProperty("account_id")
    public Integer accountId;
    @JsonProperty("is_employee")
    public Boolean isEmployee;
    @JsonProperty("last_modified_date")
    public Integer lastModifiedDate;
    @JsonProperty("last_access_date")
    public Integer lastAccessDate;
    @JsonProperty("reputation_change_year")
    public Integer reputationChangeYear;
    @JsonProperty("reputation_change_quarter")
    public Integer reputationChangeQuarter;
    @JsonProperty("reputation_change_month")
    public Integer reputationChangeMonth;
    @JsonProperty("reputation_change_week")
    public Integer reputationChangeWeek;
    @JsonProperty("reputation_change_day")
    public Integer reputationChangeDay;
    @JsonProperty("reputation")
    public Integer reputation;
    @JsonProperty("creation_date")
    public Integer creationDate;
    @JsonProperty("user_type")
    public String userType;
    @JsonProperty("user_id")
    public Integer userId;
    @JsonProperty("location")
    public String location;
    @JsonProperty("website_url")
    public String websiteUrl;
    @JsonProperty("link")
    public String link;
    @JsonProperty("profile_image")
    public String profileImage;
    @JsonProperty("display_name")
    public String displayName;

    @Override
    public String toString() {
        return "StackOverflowUser{" +
                "badgeCounts=" + badgeCounts +
                ", accountId=" + accountId +
                ", isEmployee=" + isEmployee +
                ", reputationChangeYear=" + reputationChangeYear +
                ", reputationChangeQuarter=" + reputationChangeQuarter +
                ", reputationChangeMonth=" + reputationChangeMonth +
                ", reputationChangeWeek=" + reputationChangeWeek +
                ", reputationChangeDay=" + reputationChangeDay +
                ", reputation=" + reputation +
                ", userType='" + userType + '\'' +
                ", userId=" + userId +
                ", location='" + location + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", link='" + link + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}