/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.users;

import java.util.Collection;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author andre
 */
@Path("/utenti")
public class UserResources {
    
@Inject
UserStore store;
    
@GET
@Produces(MediaType.APPLICATION_JSON)
public Collection <User> all (){
    return store.allUsers();
}

}