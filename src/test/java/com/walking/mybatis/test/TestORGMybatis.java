package com.walking.mybatis.test;

import com.alibaba.fastjson.JSONObject;
import com.walking.entity.Blog;
import com.walking.mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.Reader;

/**
 * @Author: walking 公众号：编程大道
 * @Date: 2020年5月21日
 */
public class TestORGMybatis {
    private static SqlSession sqlSession;
    private static  SqlSessionFactory sqlSessionFactory;
    @Before
    public void init(){
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Reader.class.getClassLoader().getSystemResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void destroy(){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }
    @Test
    public void selectBlog(){
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog select = blogMapper.selectByStep(1);
        System.out.println(JSONObject.toJSONString(select));
    }

}
