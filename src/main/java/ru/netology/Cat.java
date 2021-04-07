package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private Status status;
    private String type;
    private boolean deleted;
    private String id;
    private String user;
    private String text;
    private int v;
    private String source;
    private String updatedAt;
    private String createdAt;
    private boolean used;


    public Cat(@JsonProperty("status") Status status,
               @JsonProperty("type") String type,
               @JsonProperty("deleted") Boolean deleted,
               @JsonProperty("_id") String id,
               @JsonProperty("user") String user,
               @JsonProperty("text") String text,
               @JsonProperty("__v") int v,
               @JsonProperty("source") String source,
               @JsonProperty("updatedAt") String updatedAt,
               @JsonProperty("createdAt") String createdAt,
               @JsonProperty("used") Boolean used) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this.id = id;
        this.user = user;
        this.text = text;
        this.v = v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    public Status getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cat{" + "\n" +
                "status=" + status + "\n" +
                "type=" + type + "\n" +
                "deleted=" + deleted + "\n" +
                "id=" + id + "\n" +
                "user=" + user + "\n" +
                "text=" + text + "\n" +
                "v=" + v +
                "source=" + source + "\n" +
                "updatedAt=" + updatedAt + "\n" +
                "createdAt=" + createdAt + "\n" +
                "used=" + used + "\n" +
                "}" + "\n" + "\n";
    }
}


