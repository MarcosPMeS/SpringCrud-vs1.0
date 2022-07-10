package br.com.aulaapi.services;

import br.com.aulaapi.entities.User;
import br.com.aulaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //read oparation
    public List<User> searchUser(){
        return userRepository.findAll();
    }

    //Save operation

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteDepartamentById(Integer departmentId){
        userRepository.deleteById(departmentId);
    }

    public User updateDepartment(User user, Integer userId){
        User usDB = userRepository.findById(userId).get();

        if(Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())){
            usDB.setName(user.getName());
        }

        if(Objects.nonNull(user.getAge())){
            usDB.setAge(user.getAge());
        }

        return userRepository.save(usDB);
    }
}
