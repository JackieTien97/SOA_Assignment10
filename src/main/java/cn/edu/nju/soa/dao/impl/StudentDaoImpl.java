package cn.edu.nju.soa.dao.impl;

import cn.edu.nju.soa.dao.StudentDao;
import cn.edu.nju.soa.repository.StudentRepo;
import cn.edu.nju.soa.entity.TDepartmentEntity;
import cn.edu.nju.soa.entity.TStudentEntity;
import cn.edu.nju.soa.repository.DepartmentRepo;
import cn.edu.nju.soa.repository.ScoreRepo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by Jackie Tien on 2018-03-24.
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Resource
    private StudentRepo studentRepo;

    @Resource
    private DepartmentRepo departmentRepo;

    @Resource
    private ScoreRepo scoreRepo;

    @Override
    public TStudentEntity findBySid(String sid) {
        return studentRepo.findOne(sid);
    }

    @Override
    @Transactional
    public TStudentEntity save(TStudentEntity studentEntity) {
        TDepartmentEntity departmentEntity = departmentRepo.findOne(studentEntity.getDepartmentEntity().getDid());
        if (departmentEntity == null) {
            studentEntity.setDepartmentEntity(departmentRepo.save(studentEntity.getDepartmentEntity()));
        }
        studentRepo.save(studentEntity);
        return studentEntity;
    }

    @Override
    public void deleteBySid(String sid) {
        delete(findBySid(sid));
    }

    @Override
    public void delete(TStudentEntity studentEntity) {
        studentRepo.delete(studentEntity);
    }

}
