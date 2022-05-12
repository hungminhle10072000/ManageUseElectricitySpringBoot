package com.hdh.manageuseelectricityspringboot.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class NoteBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private Double indexElectric;

    @Column(nullable = false)
    private Date dateWrite;

    @ManyToOne
    @JoinColumn(name = "electric_id", nullable = false)
    private ElectricMeter electricMeter;

}
