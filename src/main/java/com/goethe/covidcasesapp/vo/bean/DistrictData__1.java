
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
    "Other State",
    "Alappuzha",
    "Ernakulam",
    "Idukki",
    "Kannur",
    "Kasaragod",
    "Kollam",
    "Kottayam",
    "Kozhikode",
    "Malappuram",
    "Palakkad",
    "Pathanamthitta",
    "Thiruvananthapuram",
    "Thrissur",
    "Wayanad"
})
@Generated("jsonschema2pojo")
public class DistrictData__1 {

    @JsonProperty("Other State")
    private OtherState otherState;
    @JsonProperty("Alappuzha")
    private Alappuzha alappuzha;
    @JsonProperty("Ernakulam")
    private Ernakulam ernakulam;
    @JsonProperty("Idukki")
    private Idukki idukki;
    @JsonProperty("Kannur")
    private Kannur kannur;
    @JsonProperty("Kasaragod")
    private Kasaragod kasaragod;
    @JsonProperty("Kollam")
    private Kollam kollam;
    @JsonProperty("Kottayam")
    private Kottayam kottayam;
    @JsonProperty("Kozhikode")
    private Kozhikode kozhikode;
    @JsonProperty("Malappuram")
    private Malappuram malappuram;
    @JsonProperty("Palakkad")
    private Palakkad palakkad;
    @JsonProperty("Pathanamthitta")
    private Pathanamthitta pathanamthitta;
    @JsonProperty("Thiruvananthapuram")
    private Thiruvananthapuram thiruvananthapuram;
    @JsonProperty("Thrissur")
    private Thrissur thrissur;
    @JsonProperty("Wayanad")
    private Wayanad wayanad;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Other State")
    public OtherState getOtherState() {
        return otherState;
    }

    @JsonProperty("Other State")
    public void setOtherState(OtherState otherState) {
        this.otherState = otherState;
    }

    @JsonProperty("Alappuzha")
    public Alappuzha getAlappuzha() {
        return alappuzha;
    }

    @JsonProperty("Alappuzha")
    public void setAlappuzha(Alappuzha alappuzha) {
        this.alappuzha = alappuzha;
    }

    @JsonProperty("Ernakulam")
    public Ernakulam getErnakulam() {
        return ernakulam;
    }

    @JsonProperty("Ernakulam")
    public void setErnakulam(Ernakulam ernakulam) {
        this.ernakulam = ernakulam;
    }

    @JsonProperty("Idukki")
    public Idukki getIdukki() {
        return idukki;
    }

    @JsonProperty("Idukki")
    public void setIdukki(Idukki idukki) {
        this.idukki = idukki;
    }

    @JsonProperty("Kannur")
    public Kannur getKannur() {
        return kannur;
    }

    @JsonProperty("Kannur")
    public void setKannur(Kannur kannur) {
        this.kannur = kannur;
    }

    @JsonProperty("Kasaragod")
    public Kasaragod getKasaragod() {
        return kasaragod;
    }

    @JsonProperty("Kasaragod")
    public void setKasaragod(Kasaragod kasaragod) {
        this.kasaragod = kasaragod;
    }

    @JsonProperty("Kollam")
    public Kollam getKollam() {
        return kollam;
    }

    @JsonProperty("Kollam")
    public void setKollam(Kollam kollam) {
        this.kollam = kollam;
    }

    @JsonProperty("Kottayam")
    public Kottayam getKottayam() {
        return kottayam;
    }

    @JsonProperty("Kottayam")
    public void setKottayam(Kottayam kottayam) {
        this.kottayam = kottayam;
    }

    @JsonProperty("Kozhikode")
    public Kozhikode getKozhikode() {
        return kozhikode;
    }

    @JsonProperty("Kozhikode")
    public void setKozhikode(Kozhikode kozhikode) {
        this.kozhikode = kozhikode;
    }

    @JsonProperty("Malappuram")
    public Malappuram getMalappuram() {
        return malappuram;
    }

    @JsonProperty("Malappuram")
    public void setMalappuram(Malappuram malappuram) {
        this.malappuram = malappuram;
    }

    @JsonProperty("Palakkad")
    public Palakkad getPalakkad() {
        return palakkad;
    }

    @JsonProperty("Palakkad")
    public void setPalakkad(Palakkad palakkad) {
        this.palakkad = palakkad;
    }

    @JsonProperty("Pathanamthitta")
    public Pathanamthitta getPathanamthitta() {
        return pathanamthitta;
    }

    @JsonProperty("Pathanamthitta")
    public void setPathanamthitta(Pathanamthitta pathanamthitta) {
        this.pathanamthitta = pathanamthitta;
    }

    @JsonProperty("Thiruvananthapuram")
    public Thiruvananthapuram getThiruvananthapuram() {
        return thiruvananthapuram;
    }

    @JsonProperty("Thiruvananthapuram")
    public void setThiruvananthapuram(Thiruvananthapuram thiruvananthapuram) {
        this.thiruvananthapuram = thiruvananthapuram;
    }

    @JsonProperty("Thrissur")
    public Thrissur getThrissur() {
        return thrissur;
    }

    @JsonProperty("Thrissur")
    public void setThrissur(Thrissur thrissur) {
        this.thrissur = thrissur;
    }

    @JsonProperty("Wayanad")
    public Wayanad getWayanad() {
        return wayanad;
    }

    @JsonProperty("Wayanad")
    public void setWayanad(Wayanad wayanad) {
        this.wayanad = wayanad;
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
