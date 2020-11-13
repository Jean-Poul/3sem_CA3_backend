
package dto;

import entities.Origin;
import entities.Rick_Morty;


public class Rick_MortyDTO {
    
    private String name;
    private String species;
    private String type;
    private String gender;
    private Origin origin;
    private Rick_Morty cartoon;

    public Rick_MortyDTO(Rick_Morty cartoon, Origin origin) {
        this.name = cartoon.getName();
        this.species = cartoon.getSpecies();
        this.type = cartoon.getType();
        this.gender = cartoon.getGender();
    }    

    public Rick_MortyDTO() {
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

//    public Rick_Morty getCartoon() {
//        return cartoon;
//    }
//
//    public void setCartoon(Rick_Morty cartoon) {
//        this.cartoon = cartoon;
//    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }


    @Override
    public String toString() {
        return "Rick_MortyDTO{" + "name=" + name + ", species=" + species + ", type=" + type + ", gender=" + gender + ", cartoon=" + cartoon + '}';
    }   
    
}
