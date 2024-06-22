package com.Rrdesh07.CarPooling.Models;

import com.Rrdesh07.CarPooling.Enum.RequestType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long id;
    private String source;
    private String destination;
    private Long seatsBooked;
    private Long totalCost;
    private Long userCost;
    private LocalTime time;
    private LocalDate date;
    private RequestType reqType;
    @ManToOne
    @JoinColumn(name = "user_id")
    private User userId;y
}
