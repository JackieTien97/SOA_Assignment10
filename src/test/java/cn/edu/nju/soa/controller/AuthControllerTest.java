package cn.edu.nju.soa.controller;

import cn.edu.nju.soa.BaseTest;
import edu.nju.soa.model.tns.AuthVerifyType;
import edu.nju.soa.model.tns.VerifyType;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by cuihao on 2017-06-14.
 *
 */
public class AuthControllerTest extends BaseTest {

    @Resource
    private AuthController authController;

    @Test
    public void verify() throws Exception {
        AuthVerifyType type = new AuthVerifyType();
        type.setEmail("141250019@smail.nju.edu.cn");
        type.setPassword("141250019");
        VerifyType verifyType = authController.verify(type);
        System.out.println(verifyType.getAuthType());
    }

}