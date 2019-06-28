package com.gfg.jatinjha.NewSpringBootBackendService.controllerUnit;

import com.gfg.jatinjha.NewSpringBootBackendService.modelUnit.Model;
import com.gfg.jatinjha.NewSpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/users")
    public List<Model> getAllUsers(){

        return userDaoService.findAllUsers();

    }


    @GetMapping("/users/{id}")
    public Model getUserById(@PathVariable("id") Long id){
        return userDaoService.getUserById(id);
    }


    @PostMapping("/user")
    public Model createUser(@RequestBody Model user){
        userDaoService.createUser(user);
        return user;
    }

    @PutMapping("/user")
    public Model updateUser(@RequestBody Model user){
        userDaoService.updateUser(user);
        return userDaoService.getUserById(user.getId());
    }

    @DeleteMapping("/user/{id}")
    public Model deleteUser(@PathVariable("id") Long id){
        Model user = userDaoService.getUserById(id);
        userDaoService.deleteUser(id);
        return user;
    }

}
