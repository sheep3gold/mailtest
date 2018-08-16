package com.yx.test;

import com.yx.dao.MailDao;
import com.yx.entity.Mail;
import com.yx.test.MailSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        FileSystemXmlApplicationContext context2=new FileSystemXmlApplicationContext("src/main/resources/bean.xml");
        MailDao mailDao= (MailDao) context2.getBean("mailDao");
//        Mail mail=new Mail();
//        mail.setSubject1("test");
//        mail.setTo1("yx");
//        mail.setContent1("test");
//        mailDao.addMail(mail);
//        int a[]={1,2};
        Mail mail1=mailDao.query(2);
        System.out.println(mail1.getId()+"  "+mail1.getSubject1());
    }
}