package cn.edu.nju.soa.dao;

import cn.edu.nju.soa.entity.TStudentEntity;

/**
 * Created by Jackie Tien on 2018-03-24.
 *
 */
public interface StudentDao {
    TStudentEntity findBySid(String sid);
    TStudentEntity save(TStudentEntity studentEntity);
    void deleteBySid(String sid);
    void delete(TStudentEntity studentEntity);
}
