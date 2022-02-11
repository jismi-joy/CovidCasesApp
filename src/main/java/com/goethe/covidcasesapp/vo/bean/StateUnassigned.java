
package com.goethe.covidcasesapp.vo.bean;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "districtData",
    "statecode"
})
@Generated("jsonschema2pojo")
public class StateUnassigned {

    @JsonProperty("districtData")
    private DistrictData districtData;
    @JsonProperty("statecode")
    private String statecode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("districtData")
    public DistrictData getDistrictData() {
        return districtData;
    }

    @JsonProperty("districtData")
    public void setDistrictData(DistrictData districtData) {
        this.districtData = districtData;
    }

    @JsonProperty("statecode")
    public String getStatecode() {
        return statecode;
    }

    @JsonProperty("statecode")
    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
