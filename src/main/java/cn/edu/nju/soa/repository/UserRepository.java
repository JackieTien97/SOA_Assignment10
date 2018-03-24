package cn.edu.nju.soa.repository;

import cn.edu.nju.soa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jackie Tien on 2018-03-24.
 * Auth repo definition
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity findByEmail(String email);

}
