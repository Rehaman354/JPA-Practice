package com.example.JPA_Practcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return "User added Successfully";
    }

    public List<User> getAllUsers() {
       return  userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    public String deleteAll() {
        userRepository.deleteAll();
        return "All records of users are deleted";
    }

    public String deleteUserById(Integer uid) {
        userRepository.deleteById(uid);
        return "User with "+uid+" deleted successfully";
    }

    public String updateNameById(Integer id,String name) {
        User user=userRepository.findById(id).get();
        user.setName(name);
        userRepository.save(user);
        return "user name updated successfully";
    }
}
