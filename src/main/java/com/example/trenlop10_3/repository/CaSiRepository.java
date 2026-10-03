package com.example.trenlop10_3.repository;

import com.example.trenlop10_3.entity.CaSi;
import com.example.trenlop10_3.util.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class CaSiRepository {
    List<CaSi> getAll(){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.createQuery("form CaSi", CaSi.class).list();
        }
    }

    public static void main(String[] args) {
        System.out.println(new CaSiRepository().getAll());
    }
}
