package com.jcLog.database;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * @description: 创建session工厂
 * @author：孙圣然
 * @created: 2013-10-25 上午10:23:59 
 * @version：$Id: ConnectionFactory.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class ConnectionFactory {
	private  final static SqlSessionFactory sqlSessionFactory;   
    static {   
       String resource = "log_mybatis.xml";   
       Reader reader = null;   
       try {   
           reader = Resources.getResourceAsReader(resource);   
       } catch (IOException e) {   
           System.out.println(e.getMessage());   
   
       }   
       sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);   
    }   
   
    public static SqlSessionFactory getSqlSessionFactory() {   
       return sqlSessionFactory;   
    }   
}
