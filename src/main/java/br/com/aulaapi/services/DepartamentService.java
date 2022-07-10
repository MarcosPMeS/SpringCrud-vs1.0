package br.com.aulaapi.services;

import java.util.List;
import br.com.aulaapi.entities.User;

public interface DepartamentService {

    //Save oparation
    User saveUser(User user);

    //delete operation
    void deleteDepartamentById(Long departamentId);

    //Update operation
    User updateDepartment(User user, Long departmentId);


}
