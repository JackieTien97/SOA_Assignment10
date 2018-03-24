package cn.edu.nju.soa.controller;

import cn.edu.nju.soa.dao.UserDao;
import cn.edu.nju.soa.definition.MyAuth;
import cn.edu.nju.soa.entity.UserEntity;
import edu.nju.soa.model.tns.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Jackie Tien on 2018-03-24.
 * Auth Service impl
 */
@WebService(name = "MyAuth", targetNamespace = "http://jw.nju.edu.cn/model")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Component
public class AuthController implements MyAuth {

    @Resource
    private UserDao userDao;

    /**
     * Auth controller
     *
     * @param parameters {@link AuthVerifyType}
     * @return returns cn.edu.nju.jw.model.VerifyType
     * @throws IdNotFoundException {@link IdNotFoundException} cannot find id
     * @throws PswErrorException   {@link PswErrorException} password error
     */
    @Override
    public VerifyType verify(AuthVerifyType parameters) throws IdNotFoundException, PswErrorException {
        UserEntity userEntity = userDao.findByEmail(parameters.getEmail());
        if (userEntity == null) {
            throw new IdNotFoundException(NotFoundReasonType.学号不存在,parameters.getEmail(),"cannot find email");
        }
        if (!userEntity.getPassword().equals(parameters.getPassword())) {
            throw new PswErrorException("Error password",parameters.getEmail(),"Error password");
        }
        return new VerifyType(userEntity);
    }
}
