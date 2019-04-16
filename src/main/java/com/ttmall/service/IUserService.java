package com.ttmall.service;

import com.ttmall.common.ServerResponse;
import com.ttmall.pojo.User;

/**
 * Created by zfb
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
