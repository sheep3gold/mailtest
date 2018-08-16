package com.yx.test;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:09 2018/8/15
 * @ Description：${description}
 * @ Modified By：
 */
@Component
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        MailSendEvent event = mailSendEvent;

        System.out.println("MailSender向"+ event.getTo()+ "发送了主题为"+event.getSubject()
                +",正文为"+event.getContent()+"邮件");
    }
}