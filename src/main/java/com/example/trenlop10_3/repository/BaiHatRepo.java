package com.example.trenlop10_3.repository;

import com.example.trenlop10_3.entity.BaiHat;

import com.example.trenlop10_3.util.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BaiHatRepo {
    public List<BaiHat> getAll(){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.createQuery("from BaiHat ",BaiHat.class).list();
        }
    }

    public BaiHat getOne(Integer id){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.find(BaiHat.class,id);
        }
    }

    public void add(BaiHat bh){
        try(Session s = Hibernate.getFactory().openSession()){
            Transaction tx = s.getTransaction();
            try{
                tx.begin();
                s.persist(bh);
                tx.commit();
            }catch (Exception e){
                if (tx.isActive()){
                    tx.rollback();
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(new CaSiRepository().getAll());
    }
}
