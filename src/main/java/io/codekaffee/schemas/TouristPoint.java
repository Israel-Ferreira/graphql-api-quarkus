package io.codekaffee.schemas;

import java.io.Serializable;

import org.eclipse.microprofile.graphql.Type;

import io.codekaffee.models.PontoTuristico;

@Type
public class TouristPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    
    private String name;
    private String city;
    private String description;


    public TouristPoint(PontoTuristico touristPoint){
        this.id = touristPoint.getId();
        this.city = touristPoint.getCidade();
        this.name = touristPoint.getNome();
        this.description = touristPoint.getDescricao();
    }
    


    /**
     * 
     */
    public TouristPoint() {
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}

