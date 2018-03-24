package cn.edu.nju.soa.dao;

import cn.edu.nju.soa.entity.UserEntity;

/**
 * Created by Jackie Tien on 2018-03-24.
 * user dao
 */
public interface UserDao {

    UserEntity findById(int id);

    UserEntity findByEmail(String email);

    void delete(int id);

    UserEntity save(UserEntity userEntity);
}
