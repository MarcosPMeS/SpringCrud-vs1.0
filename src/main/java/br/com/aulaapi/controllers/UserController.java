package br.com.aulaapi.controllers;

import br.com.aulaapi.entities.User;
import br.com.aulaapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import br.com.aulaapi.services.DepartamentService;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService userService;


    //read operation
    @GetMapping("/users")
    @ResponseBody
    public List<User> searchUser(){
        return userService.searchUser();
    }

    //save operation
    @PostMapping("/users")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Integer deparmentId){
        userService.deleteDepartamentById(deparmentId);
        return "Deletado com sucesso";
    }

    @PutMapping("/users/{id}")
    public User updateDepartment(@RequestBody User user,
                                 @PathVariable("id") Integer userId){
        return userService.updateDepartment(user, userId);
    }
}
