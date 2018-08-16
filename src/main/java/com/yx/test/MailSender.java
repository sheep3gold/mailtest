package com.yx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:13 2018/8/15
 * @ Description：${description}
 * @ Modified By：
 */
@Component("mailSender")
public class MailSender {
    @Autowired
    private ApplicationContext applicationContext;
    //容器事件由容器触发

    public void sendMail(String subject, String to,String content){
        System.out.println("MailSender开始发送邮件");
        MailSendEvent event = new MailSendEvent(applicationContext,subject, to,content);
        applicationContext.publishEvent(event);
    }
}