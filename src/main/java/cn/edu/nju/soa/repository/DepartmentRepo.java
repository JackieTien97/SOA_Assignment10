package cn.edu.nju.soa.repository;

import cn.edu.nju.soa.entity.TDepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jackie Tien on 2018-03-24.
 *
 */
public interface DepartmentRepo extends JpaRepository<TDepartmentEntity,String> {
}
