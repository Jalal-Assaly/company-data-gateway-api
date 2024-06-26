package org.pacs.companydatagatewayapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.pacs.companydatagatewayapi.entities.TimeSchedule;

@Data
@AllArgsConstructor
public class EmployeeAttributesModel {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("RL")
    private String role;
    @JsonProperty("DP")
    private String department;
    @JsonProperty("TS")
    private TimeSchedule timeSchedule;
    @JsonProperty("CL")
    private String clearanceLevel;
    @JsonProperty("ES")
    private String employmentStatus;
}
