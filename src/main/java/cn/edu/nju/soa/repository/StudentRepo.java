package cn.edu.nju.soa.repository;

import cn.edu.nju.soa.entity.TStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jackie Tien on 2018-03-24.
 * student repo
 */
public interface StudentRepo extends JpaRepository<TStudentEntity,String> {
}
