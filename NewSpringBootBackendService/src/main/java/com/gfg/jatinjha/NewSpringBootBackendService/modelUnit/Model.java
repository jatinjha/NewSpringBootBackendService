package com.gfg.jatinjha.NewSpringBootBackendService.modelUnit;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Model{


    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter @Setter
    private String firstname;
    @Getter @Setter
    private String lastname;

    public Model(String firstname , String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
}











