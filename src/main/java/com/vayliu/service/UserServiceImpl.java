package com.vayliu.service;

import com.vayliu.dao.UserMapper;
import com.vayliu.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserServiceImpl implements UserService{

    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(User user, String rememberMe, HttpServletResponse response) {
        return null;
    }

    @Override
    public void register(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public int updateUser(int id, String gender, String name, String province, String city, String area, String cellphone, String zipCode, String address, String email) {
        return 0;
    }

    @Override
    public User loginByCookie(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public void logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {

    }
}
