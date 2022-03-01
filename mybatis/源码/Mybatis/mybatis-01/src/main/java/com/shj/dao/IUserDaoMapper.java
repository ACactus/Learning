package com.shj.dao;

import com.shj.domain.User;

import java.util.List;

/**
 * @ClassName: IUserDao
 * @Description:
 * @Author: ShangJin
 * @Create: 2020-02-17 19:07
 **/
public interface IUserDaoMapper {
    public List<User> getAllUserList();
    public User getUserById(Integer id);
    public boolean addUser(User user);
    public boolean delUserById(Integer id);
    public boolean updateUser(User user);
}
