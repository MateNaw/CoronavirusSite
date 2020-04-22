package com.coronavirus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Country {
    private Integer id;
    private String name;
    private Integer cases;
    private Integer deaths;
    private Integer recovered;
    
    public Country() {
    }
    
    public Country(Integer id, String name, Integer cases, Integer deaths, Integer recovered) {
        this.id = id;
        this.name = name;
        this.cases = cases;
        this.deaths = deaths;
        this.recovered = recovered;
    }
    
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="idcountries")
    public Integer getId() {
        return id;
    }
    
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="country")
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="cases")
    public Integer getCases() {
        return cases;
    }
    
    public void setCases(Integer cases) {
            this.cases = cases;
    }
    
    @Column(name="deaths")
    public Integer getDeaths() {
        return deaths;
    }
    
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }
    
    @Column(name="recovered")
    public Integer getRecovered() {
        return recovered;
    }
    
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }
}
