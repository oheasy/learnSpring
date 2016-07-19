package com.hxy.service;

import com.hxy.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by hxy-pc on 2016/7/19.
 */
public interface UserService {
    User queryByName(String name);
}
