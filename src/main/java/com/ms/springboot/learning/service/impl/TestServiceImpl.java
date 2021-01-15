package com.ms.springboot.learning.service.impl;

import com.ms.springboot.learning.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/14 10:41
 * @version: v1.0
 */
@Service
public class TestServiceImpl implements TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String info() {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("info");
        }
        return "info";
    }

    @Override
    public String debugger() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("debug");
        }
        return "debug";
    }

    @Override
    public String warn() {
        if (LOGGER.isWarnEnabled()) {
            LOGGER.warn("warn");
        }
        return "warn";
    }

    @Override
    public String error() {
        if (LOGGER.isErrorEnabled()) {
            LOGGER.error("error");
        }
        return "error";
    }

    @Override
    public String throwException() {
        throw new RuntimeException("throw new runtime exception");
    }
    /**
     * logger.debug("开始获取员工[{}] [{}]年基本薪资",employee,year);
     *
     * logger.debug("获取员工[{}] [{}]年的基本薪资为[{}]",employee,year,basicSalary);
     * logger.debug("开始获取员工[{}] [{}]年[{}]月休假情况",employee,year,month);
     *
     * logger.debug("员工[{}][{}]年[{}]月年假/病假/事假为[{}]/[{}]/[{}]",employee,year,month,annualLeaveDays,sickLeaveDays,noPayLeaveDays);
     * logger.debug("开始计算员工[{}][{}]年[{}]月应得薪资",employee,year,month);
     *
     * logger.debug("员工[{}] [{}]年[{}]月应得薪资为[{}]",employee,year,month,actualSalary);
     */
    /**
     * @Override
     * @Transactional
     * public void createUserAndBindMobile(@NotBlank String mobile, @NotNull User user) throws CreateConflictException{
     *     boolean debug = log.isDebugEnabled();
     *     if(debug){
     *         log.debug("开始创建用户并绑定手机号. args[mobile=[{}],user=[{}]]", mobile, LogObjects.toString(user));
     *     }
     *     try {
     *         user.setCreateTime(new Date());
     *         user.setUpdateTime(new Date());
     *         userRepository.insertSelective(user);
     *         if(debug){
     *             log.debug("创建用户信息成功. insertedUser=[{}]",LogObjects.toString(user));
     *         }
     *         UserMobileRelationship relationship = new UserMobileRelationship();
     *         relationship.setMobile(mobile);
     *         relationship.setOpenId(user.getOpenId());
     *         relationship.setCreateTime(new Date());
     *         relationship.setUpdateTime(new Date());
     *         userMobileRelationshipRepository.insertOnDuplicateKey(relationship);
     *         if(debug){
     *             log.debug("绑定手机成功. relationship=[{}]",LogObjects.toString(relationship));
     *         }
     *         log.info("创建用户并绑定手机号. userId=[{}],openId=[{}],mobile=[{}]",user.getId(),user.getOpenId(),mobile);
     *     }catch(DuplicateKeyException e){
     *         log.info("创建用户并绑定手机号失败,已存在相同的用户. openId=[{}],mobile=[{}]",user.getOpenId(),mobile);
     *         throw new CreateConflictException("创建用户发生冲突, openid=[%s]",user.getOpenId());
     *     }
     * }
     */
}
