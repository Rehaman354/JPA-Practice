package com.example.JPA_Practcie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="User_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @Column(name="User_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobile;
    private int age;
    //parent to child mapping
    @OneToOne(mappedBy = "user")//here user fk written in child class
    private Card card;
}
