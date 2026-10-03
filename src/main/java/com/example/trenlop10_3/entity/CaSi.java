package com.example.trenlop10_3.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ca_si")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CaSi {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ten_ca_si")
    private String tenCaSi;
    @Column(name = "que_quan")
    private String queQuan;
    private int tuoi;
    private String congTy;
    private int sdt;
    private boolean gioiTinh;
}
