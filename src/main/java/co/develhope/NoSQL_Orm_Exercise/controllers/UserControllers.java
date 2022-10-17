package co.develhope.NoSQL_Orm_Exercise.controllers;

import co.develhope.NoSQL_Orm_Exercise.entities.User;
import co.develhope.NoSQL_Orm_Exercise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserControllers {

    @Autowired
    private UserRepository userRepository;

    //Operazioni CRUD (Create, Read, Update, Delete)
    @PostMapping("")
    public User createUser(@RequestBody User user) {
        user.setId(null);
        return userRepository.save(user);
    }

    @GetMapping("/readAllUser")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/readUserById/{id}")
    public User getUserById(@PathVariable String id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            throw new Exception("User is not found");
        }
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user) throws Exception {
        if (!userRepository.existsById(id)) throw new Exception("User is not found");
        user.setId(id);
        return userRepository.save(user);

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}
