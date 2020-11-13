package entities;

import java.io.Serializable;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class Rick_Morty implements Serializable {

    private static final long serialVersionUID = 1L;
   // @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String species;
    private String type;
    private String gender;
    private String URL;

    public Rick_Morty(String id, String name, String species, String type, String gender, String URL) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.URL = URL;
    }

    public Rick_Morty() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    

    @Override
    public String toString() {
        return "Rick_Morty{" + "id=" + id + ", name=" + name + ", species=" + species + ", type=" + type + ", gender=" + gender + '}';
    }

    
}
