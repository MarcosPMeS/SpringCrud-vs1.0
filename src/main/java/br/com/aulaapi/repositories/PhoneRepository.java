package br.com.aulaapi.repositories;

import br.com.aulaapi.entities.Phone;
import br.com.aulaapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}

