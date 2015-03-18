package com.jcLog.database;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

/**
 * @description: DBCP工厂类
 * @author：孙圣然
 * @created: 2013-10-25 上午10:24:10 
 * @version：$Id: DBCPDataSourceFactory.java 31118 2013-10-28 20:24:44Z sunsr $ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class DBCPDataSourceFactory implements DataSourceFactory {
    private BasicDataSource datasource = null;
    
    public DBCPDataSourceFactory(){
        this.datasource = new BasicDataSource();
    }
    
    public DataSource getDataSource() {
        return datasource;
    }

    public void setProperties(Properties ps) {
        datasource.setDriverClassName(ps.getProperty("driverclassname"));
        datasource.setUsername(ps.getProperty("username"));
        datasource.setUrl(ps.getProperty("url"));
        datasource.setPassword(ps.getProperty("password"));
        datasource.setDefaultAutoCommit(ps.getProperty("defaultautocommit","0").equals("1") );
        datasource.setInitialSize(Integer.parseInt(ps.getProperty("initialsize","2")) );
        datasource.setMaxActive(Integer.parseInt(ps.getProperty("maxactive","20")));
        datasource.setMaxIdle(Integer.parseInt(ps.getProperty("maxidle","0")));
        datasource.setMaxWait(Long.parseLong(ps.getProperty("maxwait","0")));        
    }
}