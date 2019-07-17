package com.my61.mybatis.mybatisplus.mapper;

import com.my61.mybatis.mybatisplus.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: UserMapper
 * @description:
 * @author: Caffeine61
 * @create: 2019-07-18 02:05
 **/

@Repository
public interface UserMapper {
    List<User> getAll();

    int insert(User user);
}
