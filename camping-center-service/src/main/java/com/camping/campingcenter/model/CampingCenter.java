package com.camping.campingcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "camping_centers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String address;
    private String description;
    private Double pricePerNight;
    private Integer capacity;
} 