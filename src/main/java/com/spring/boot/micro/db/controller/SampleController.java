package com.spring.boot.micro.db.controller;

import com.spring.boot.micro.db.constant.QueryConstants;
import com.spring.boot.micro.db.entity.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.
                                            getLogger(SampleController.class);

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/getUserByUsername/{username}")
    public Users checkUserByName(@PathVariable("username") String username){
        LOGGER.info("<<<<<<< LoadUserByUsername Configuration >>>>>>>" + username);
        Users user = entityManager.createQuery(QueryConstants.USER_LOGIN_QUERY, Users.class)
                .setParameter("username", username).getSingleResult();
        return user;
    }

}
