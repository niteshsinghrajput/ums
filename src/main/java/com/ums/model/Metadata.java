package com.ums.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Metadata {

    @JsonProperty("source_user_id")
    private int sourceUserId;
    @JsonProperty("source_company_id")
    private int sourceCompanyId;
    @JsonProperty("source_project_id")
    private int sourceProjectId;
    @JsonProperty("source_application_id")
    private String sourceApplicationId;
    @JsonProperty("source_operation_id")
    private String sourceOperationId;


}
