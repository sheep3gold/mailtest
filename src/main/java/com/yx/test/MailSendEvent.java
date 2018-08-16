package com.yx.test;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 15:08 2018/8/15
 * @ Description：${description}
 * @ Modified By：
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * 继承了ApplicationContextEvent，就是个容器事件
 */
public class MailSendEvent extends ApplicationContextEvent {
    /**
     * @author  yx
     * @create  2018/8/15 15:28
     * @desc 收件人
     **/
    private String to;
    /**
     * @author  yx
     * @create  2018/8/15 15:28
     * @desc 主题
     **/
    private String subject;
    /**
     * @author  yx
     * @create  2018/8/15 15:29
     * @desc 正文
     **/
     private String content;

    public MailSendEvent(ApplicationContext source,String subject, String to,String content) {
        super(source);
        this.to = to;
        this.subject=subject;
        this.content=content;
    }

    public String getTo(){
        return this.to;
    }
    public String getSubject(){
        return this.subject;
    }
    public String getContent(){
        return this.content;
    }
}