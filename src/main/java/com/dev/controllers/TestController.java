package com.dev.controllers;

import com.dev.objects.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
public class TestController {
    List<User> userList = new ArrayList<>();


    @PostConstruct
    private void init() {

    }

    @RequestMapping("/get-users")
    public List<User> getUserList(){
        return this.userList;
    }

    @RequestMapping("/add-user")
    public boolean addUser(String first,String last){
        User user=new User(first,last,true);
        this.userList.add(user);
        return true;

    }



}
//    public List<User> getUserList(){
//        return this.userList;
//    }
//
//    @RequestMapping("/get-all-users")
//    public List<User> returnUser(){
//        return this.userList;
//    }
//    @RequestMapping("add-user")
//    public boolean addUser(String name,String password){
//        boolean success=false;
//        if (name!=null && password!=null){
//            User u =new User(name,password);
//            this.userList.add(u);
//            success=true;
//        }
//
//        return success;
//    }
//    @RequestMapping("/search")
//    public List<User>search(String toFind){
//        List<User> result=new ArrayList<>();
//        if (toFind!=null){
//            for (User u:this.userList) {
//                if (u.getUsername().contains(toFind)){
//                    result.add(u);
//                }
//            }
//        }
//
//        return result;
//    }
//
//
///*
//    @RequestMapping("get-users")
//    public List<User> getUsers () {
//      return this.userList;
//    }
//
//    @RequestMapping("add-user")
//    public boolean addUser (String firstName, String lastName) {
//       User newUser=new User(firstName,lastName);
//       this.userList.add(newUser);
//       return true;
//    }
//    @RequestMapping("/echo")
//        public String echo (String text) {
//
//        return text +"!";
//    }
//
// */
//
//
//}
