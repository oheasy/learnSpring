package com.hxy.serviceImpl;

import com.hxy.dao.UserDao;
import com.hxy.pojo.User;
import com.hxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hxy-pc on 2016/7/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User queryByName(String name) {
        return userDao.queryByName(name);
    }
}
