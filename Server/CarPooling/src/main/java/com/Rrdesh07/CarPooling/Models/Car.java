package com.Rrdesh07.CarPooling.Models;

import com.Rrdesh07.CarPooling.Enum.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;
    private String name;
    private Long totalNoOfSeats;
    private Long noOfBookedSeats;
    private Long NoPlate;
    private Type type;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User userId;
}
