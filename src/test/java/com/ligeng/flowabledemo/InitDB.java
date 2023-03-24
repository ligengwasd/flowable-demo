package com.ligeng.flowabledemo;

import org.apache.commons.dbcp.BasicDataSource;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.junit.Before;

import javax.sql.DataSource;


public class InitDB {
    private ProcessEngineConfiguration processEngineConfiguration;

    public DataSource initDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/activiti?useUnicode=true&amp;characterEncoding=UTF8&amp;useSSL=false&amp;serverTimezone=Asia/Shanghai&amp;allowMultiQueries=true&amp;allowPublicKeyRetrieval=true");
        dataSource.setUsername("root");
        dataSource.setPassword("wasdwasd");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setMaxActive(3);
        dataSource.setMinIdle(1);
        return dataSource;
    }


    /**
     * 初始化数据库表34张表
     */
    @Before
    public void initDataBaseTables() {
        processEngineConfiguration = new StandaloneProcessEngineConfiguration();
        processEngineConfiguration.setDataSource(initDataSource());
        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        processEngineConfiguration.buildProcessEngine();
    }

}
