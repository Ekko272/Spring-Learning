package com.xuange.spring6;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations="classpath:beans.xml")
public class TestJdbc {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testAddObject(){
        String sql = "insert into t_emp values(null,?,?,?)";
        int result = jdbcTemplate.update(sql, "programmer", 23, "male");
    }



    @Test
    public void testSelectObject(){
        /*
        手动封装数据
        String sql = "select * from t_emp where id=?;";
        Emp emp = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Emp empTemp = new Emp();
            empTemp.setId(rs.getInt("id"));
            empTemp.setName(rs.getString("name"));
            empTemp.setAge(rs.getInt("age"));
            empTemp.setSex(rs.getString("sex"));
            return empTemp;
        }, 1);
        System.out.println(emp.toString());
         */

        //spring自动封装
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class),1);
        System.out.println(emp);
    }
    @Test
//查询多条数据为一个list集合
    public void testSelectList(){
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

}
