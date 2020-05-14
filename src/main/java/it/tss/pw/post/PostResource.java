/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.post;

import it.tss.pw.users.User;
import it.tss.pw.users.UserStore;
import java.util.Collection;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author andre
 */
@Path("/post")
public class PostResource {
    
@Inject
PostStore store;

@GET
@Produces(MediaType.APPLICATION_JSON)
public Collection <User> all (){
    return store.all();
}

}

