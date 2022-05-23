package io.codekaffee.schemas;

import org.eclipse.microprofile.graphql.Input;

import java.io.Serializable;

@Input
public class TouristPointInput implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String city;
    private String description;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
