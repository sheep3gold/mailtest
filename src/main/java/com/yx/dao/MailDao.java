package com.yx.dao;

import com.yx.entity.Mail;
import com.yx.mapper.MailMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 10:20 2018/8/16
 * @ Description：${description}
 * @ Modified By：
 */
@Component("mailDao")
public class MailDao {
    private DataSource datasource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
        this.jdbcTemplateObject = new JdbcTemplate(datasource);
    }

    public void addMail(Mail mail) {
        String sql = "INSERT into mail(subject1,to1,content1)\n" +
                "VALUES(?,?,?)";
        Object args[] = {
                mail.getSubject1(),mail.getTo1(),mail.getContent1()};
        int temp=jdbcTemplateObject.update(sql, args);
        if(temp>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }

    public Mail query(int id) {
        String sql = "select * from mail where id = ?";
        Object args[] = new Object[]{id};
        Object  mail = jdbcTemplateObject.queryForObject(sql,args,new MailMapper());
        return (Mail) mail;
    }



}
