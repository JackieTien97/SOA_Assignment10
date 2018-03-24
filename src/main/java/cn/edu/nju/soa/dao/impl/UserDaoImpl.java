package cn.edu.nju.soa.dao.impl;

import cn.edu.nju.soa.dao.UserDao;
import cn.edu.nju.soa.entity.UserEntity;
import cn.edu.nju.soa.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Jackie Tien on 2018-03-24.
 * user dao impl
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserEntity findById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
