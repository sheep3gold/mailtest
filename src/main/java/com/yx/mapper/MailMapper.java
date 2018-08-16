package com.yx.mapper;

import com.yx.entity.Mail;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 10:30 2018/8/16
 * @ Description：${description}
 * @ Modified By：
 */
public class MailMapper implements org.springframework.jdbc.core.RowMapper<Mail> {
    @Override
    public Mail mapRow(ResultSet rs, int rownum) throws SQLException {
        Mail mail = new Mail();
        mail.setId(rs.getInt("id"));
        mail.setSubject1(rs.getString("subject1"));
        mail.setTo1(rs.getString("to1"));
        mail.setContent1(rs.getString("content1"));

        return mail;
    }
}
