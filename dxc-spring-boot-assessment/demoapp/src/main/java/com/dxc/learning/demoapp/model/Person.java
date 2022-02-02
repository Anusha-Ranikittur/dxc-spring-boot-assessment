package com.dxc.learning.demoapp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="person")
public class Person {
    @Id
    private Integer id;
    private String name;
    private LocalDate dob;
    private String address;
    private String email;

    
}
