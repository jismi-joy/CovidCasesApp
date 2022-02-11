
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
    "notes",
    "active",
    "confirmed",
    "migratedother",
    "deceased",
    "recovered",
    "delta"
})
@Generated("jsonschema2pojo")
public class Kollam {

    @JsonProperty("notes")
    private String notes;
    @JsonProperty("active")
    private Integer active;
    @JsonProperty("confirmed")
    private Integer confirmed;
    @JsonProperty("migratedother")
    private Integer migratedother;
    @JsonProperty("deceased")
    private Integer deceased;
    @JsonProperty("recovered")
    private Integer recovered;
    @JsonProperty("delta")
    private Delta__7 delta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    @JsonProperty("confirmed")
    public Integer getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("migratedother")
    public Integer getMigratedother() {
        return migratedother;
    }

    @JsonProperty("migratedother")
    public void setMigratedother(Integer migratedother) {
        this.migratedother = migratedother;
    }

    @JsonProperty("deceased")
    public Integer getDeceased() {
        return deceased;
    }

    @JsonProperty("deceased")
    public void setDeceased(Integer deceased) {
        this.deceased = deceased;
    }

    @JsonProperty("recovered")
    public Integer getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("delta")
    public Delta__7 getDelta() {
        return delta;
    }

    @JsonProperty("delta")
    public void setDelta(Delta__7 delta) {
        this.delta = delta;
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
