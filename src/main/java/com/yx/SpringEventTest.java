package com.yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:14 2018/8/15
 * @ Description：${description}
 * @ Modified By：
 */
public class SpringEventTest {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        MailSender sender  = (MailSender)context.getBean("mailSender");
        sender.sendMail("hello","yx","helloWorld");
    }
}