package com.hdh.manageuseelectricityspringboot.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class ElectricMeter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String typeElectricMeter;

    @OneToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "electricMeter", cascade = CascadeType.ALL)
    private List<NoteBook> noteBookList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "electricMeter", cascade = CascadeType.ALL)
    private List<Invoice> invoiceList;

}
