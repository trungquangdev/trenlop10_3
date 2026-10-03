package com.example.trenlop10_3.repository;

import com.example.trenlop10_3.entity.BaiHat;

import com.example.trenlop10_3.util.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class BaiHatRepo {
    public List<BaiHat> getAll(){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.createQuery("from BaiHat ",BaiHat.class).list();
        }
    }

    public BaiHat getOne(Long id){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.find(BaiHat.class,id);
        }
    }


    public static void main(String[] args) {
        System.out.println(new CaSiRepository().getAll());
    }
}
