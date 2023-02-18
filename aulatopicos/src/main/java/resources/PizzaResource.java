package resources;


import br.unitins.model.Pizza;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.transaction.Transactional;

@Path("/pizza")
public class PizzaResource {

    @GET
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
    public Pizza test(){
    
        Pizza p = new Pizza();

        p.setSabor("Calabresa");
        p.setTamanho("G");
        p.setValor(50.0);
        p.setBorda(false);
        p.setSaborBorda(null);

        return p;
    }

    @GET
    @Path("/test")
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
    
    public List<Pizza> getMenu(){

        List<Pizza> menu = new ArrayList<Pizza>();
        Pizza m = new Pizza();

        m.setSabor("Portuguesa");
        m.setTamanho("G");
        m.setBorda(true);
        m.setSaborBorda("Mussarela");
        m.setValor(65.0);

        menu.add(m);

        return menu;
    }

    @POST
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional

    @Path("/addPizza")
    public Pizza insert(Pizza random){

        return random;
    }
    @GET
    @Path("/menu")
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)

    public List<Pizza> getPizzas(){

        return Pizza.findAll().list();

    }
}