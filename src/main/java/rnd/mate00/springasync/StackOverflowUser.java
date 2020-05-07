package rnd.mate00.springasync;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StackOverflowUser {

    private String displayName;
    private int reputation;
    private String link;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "StackOverflowUser{" +
                "displayName='" + displayName + '\'' +
                ", reputation=" + reputation +
                ", link='" + link + '\'' +
                '}';
    }
}
