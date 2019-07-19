package com.wu.service;

import com.wu.mapper.UsersMapper;
import com.wu.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
  @Autowired
    private UsersMapper userMapper;
//    @Transactional()
    public List<Users> findAll(){
        return userMapper.selectByExample(null);
    }
}
