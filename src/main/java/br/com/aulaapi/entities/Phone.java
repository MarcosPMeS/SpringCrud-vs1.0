package br.com.aulaapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "telefone")
public class Phone {

    @Id
    @Column(name = "IDCONTATO")
    private Integer idContato;

    @Basic
    @Column(name = "TELEFONE")
    private String tel;

    @ManyToOne
    @JoinColumn(name = "ID")
    @JsonBackReference
    private User user;

}