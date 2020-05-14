/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.post;

import it.tss.pw.users.User;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PostStore {
        @PersistenceContext(name = "pw")
    EntityManager em;

    @PostConstruct
    public void init() {

    }

    public Collection<User> all() {
        return em.createNamedQuery(User.FIND_ALL)
                .getResultList();
    }
}
