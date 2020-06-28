package com.ums.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Event {

    @JsonProperty("id")
    private int id;
    @JsonProperty("user_id")
    private int userId;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("resource_name")
    private String resourceName;
    @JsonProperty("resource_id")
    private int resourceId;
    @JsonProperty("project_id")
    private int projectId;
    @JsonProperty("event_type")
    private String eventType;
    @JsonProperty("company_id")
    private int companyId;
    @JsonProperty("api_version")
    private String apiVersion;
    @JsonProperty("metadata")
    private Metadata metadata;

}
