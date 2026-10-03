package com.example.trenlop10_3.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "bai_hat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaiHat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ten_bai_hat")
    private String tenBaiHat;
    @Column(name = "ten_tac_gia")
    private String tenTacGia;
    @Column(name = "thoi_luong")
    private Integer thoiLuong;
    @Column(name = "ngay_san_xuat")
    private Date ngaySanXuat;
    @Column
    private Float gia;
    @Column(name = "phat_hanh_dia")
    private Boolean phatHanhDia;
    @Column(name = "ngay_ra_mat")
    private Date ngayRaMat;

    @ManyToOne
    @JoinColumn(name="ca_si_id",referencedColumnName = "id")
    private CaSi caSiId;
}
