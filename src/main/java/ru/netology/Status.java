package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
        private boolean verified;
        private int sentCount;

        public Status(
                @JsonProperty("verified") Boolean verified,
                @JsonProperty("sentCount") int sentCount) {
            this.verified = verified;
            this.sentCount = sentCount;
        }
        public int getSentCount(){
            return sentCount;
        }
    @Override
    public String toString() {
        return "{" + "\n" +
                "verified=" + verified + "\n" +
                "sentCount=" + sentCount + "\n" +
                '}';
    }

}
