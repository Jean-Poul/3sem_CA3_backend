
package rest;

import com.google.gson.Gson;
import dto.Rick_MortyDTO;

import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utils.HttpUtils;

@Path("cartoon")
public class CartoonResource {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() throws IOException {
        Gson gson = new Gson();
        String cartoon = HttpUtils.fetchData("https://rickandmortyapi.com/api/character/1");
        System.out.println(cartoon + " CARTOON");
        
        Rick_MortyDTO cartoonDTO = gson.fromJson(cartoon, Rick_MortyDTO.class);
        System.out.println(cartoonDTO.toString() + " DTO");
        
        String cartoonJSON = gson.toJson(cartoonDTO);
        System.out.println(cartoonJSON + " JSON");
        
        return cartoonJSON;
    }
    
}