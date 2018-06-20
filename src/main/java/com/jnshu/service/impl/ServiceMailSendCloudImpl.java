package com.jnshu.service.impl;

import com.jnshu.model.StudentCustom;
import com.jnshu.service.ServiceMail;
import com.jnshu.tools.MailApiSendCloud;
import org.oasisopen.sca.annotation.Remotable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SSM_WEB_SERVER
 * @description: 邮件SDK SendCloud实现
 * @author: Mr.xweiba
 * @create: 2018-06-09 01:35
 **/
@Service
@Remotable
public class ServiceMailSendCloudImpl implements ServiceMail{
    @Autowired
    MailApiSendCloud sendMailSDK;

    @Override
    public Boolean sendMailDefault(String httpUrl, StudentCustom studentCustom) {
        return sendMailSDK.sendMail(httpUrl, studentCustom);
    }

    @Override
    public Boolean sendMailAddSubject(String httpUrl, StudentCustom studentCustom, String toSubject) {
        return sendMailSDK.sendMail(httpUrl, studentCustom, toSubject);
    }

    @Override
    public Boolean sendMailAddSubjectName(String httpUrl, StudentCustom studentCustom, String toSubject, String fromName) {
        return sendMailSDK.sendMail(httpUrl, studentCustom, toSubject, fromName);
    }
}
