package com.example.delivery_service.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayLoad implements Serializable {

    private Long id;

    private String event;

    @JsonProperty("event_id")
    private Long eventId;

    private String payload;

    @JsonProperty("created_at")
    private String createdAt;
}
