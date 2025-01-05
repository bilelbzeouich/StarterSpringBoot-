package com.camping.employee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "group_leaders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupLeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String experienceLevel;
    private Long campingCenterId;
} 