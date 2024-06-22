package com.Rrdesh07.CarPooling.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String email;
    private String phoneNo;
    @OneToMany(mappedBy = "userId")
    private List<Request> requests;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "userId")
    private List<Car> cars;
}
