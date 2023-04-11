package com.example.JPA_Practcie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String  addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
    @GetMapping("/getAllUsers")
    public List<User> allUsers()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/getUserById/{Id}")
    public User getUserById(@PathVariable("Id") Integer id)
    {
        return userService.getUserById(id);
    }
    @DeleteMapping("/deleteAllUsers")
    public String deleteAllUsers()
    {
        return userService.deleteAll();
    }

    @DeleteMapping("/deleteUserById")
    public String deleteUserById(@RequestParam("Id") Integer uid)
    {
        return userService.deleteUserById(uid);
    }

    @PutMapping("/updateNameById")
    public String updateNameById(@RequestParam("Id") Integer id,@RequestParam("name") String name)
    {
        return userService.updateNameById(id,name);
    }
}
