package com.vayliu.dao;

import com.vayliu.pojo.User;

public interface UserMapper {

    public long insertUser(User user);

    public User findUserById(long id);

    public User findUserByUserName(String username);

    public int updateUser(User user);

    public String getTokenById(long id);

    public String getTokenByUsername(String username);

    public int updateTokenById(long id, String token);

}
