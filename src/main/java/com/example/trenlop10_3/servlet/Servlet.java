package com.example.trenlop10_3.servlet;

import com.example.trenlop10_3.entity.BaiHat;
import com.example.trenlop10_3.repository.BaiHatRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "servlet", urlPatterns = {
        "/bh/hien-thi",
        "/bh/detail"
})
public class Servlet extends HttpServlet{
    private BaiHatRepo bhr= new BaiHatRepo();

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String uri = req.getRequestURI();
        if(uri.contains("/bh/hien-thi")){
            this.hienThiBaiHat(req,res);
        }else if(uri.contains("/bh/detail")){
            this.detailBaiHat(req,res);
        }
    }

    private void detailBaiHat(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        BaiHat bh = bhr.getOne(id);
        req.setAttribute("bh",bh);
        this.hienThiBaiHat(req,res);
    }

    private void hienThiBaiHat(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<BaiHat> listBh = bhr.getAll();
        req.setAttribute("listBh",listBh);
        req.getRequestDispatcher("/bai-hat.jsp").forward(req,res);
    }
}
