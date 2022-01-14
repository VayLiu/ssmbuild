package com.vayliu.service;

import com.vayliu.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface UserService {

    public User login(User user, String rememberMe, HttpServletResponse response);

    public void register(User user);

    public User getUserById(int id);

    public int updateUser(int id, String gender, String name, String province,
                          String city, String area, String cellphone, String zipCode, String address, String email);

    public User loginByCookie(HttpServletRequest request, HttpServletResponse response);

    public void logout(HttpSession session, HttpServletRequest request, HttpServletResponse response);


}
