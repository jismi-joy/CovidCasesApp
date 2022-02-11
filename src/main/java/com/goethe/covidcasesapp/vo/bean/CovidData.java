
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
    "State Unassigned",
    "Kerala"
})
@Generated("jsonschema2pojo")
public class CovidData {

    @JsonProperty("State Unassigned")
    private StateUnassigned stateUnassigned;
    @JsonProperty("Kerala")
    private Kerala kerala;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("State Unassigned")
    public StateUnassigned getStateUnassigned() {
        return stateUnassigned;
    }

    @JsonProperty("State Unassigned")
    public void setStateUnassigned(StateUnassigned stateUnassigned) {
        this.stateUnassigned = stateUnassigned;
    }

    @JsonProperty("Kerala")
    public Kerala getKerala() {
        return kerala;
    }

    @JsonProperty("Kerala")
    public void setKerala(Kerala kerala) {
        this.kerala = kerala;
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
