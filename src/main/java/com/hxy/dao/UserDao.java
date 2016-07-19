package com.hxy.dao;

import com.hxy.pojo.User;

/**
 * Created by hxy-pc on 2016/7/19.
 */
public interface UserDao {
    User queryByName(String name);
}
