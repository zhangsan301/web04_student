package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.model.StudentModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 查询信息的Servlet
 */
@WebServlet(name = "/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {
           //1.使用Java类处理数据
           StudentModel studentModel = new StudentModel();
           List<Student> list = studentModel.findAll();
           request.setAttribute("list",list);
           request.getRequestDispatcher("/jsp/list.jsp").forward(request,response);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
