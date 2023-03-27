package com.ligeng.flowabledemo;

import org.apache.commons.dbcp.BasicDataSource;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;

public class ProcessEngineConfigurationFactory {
    public static ProcessEngineConfiguration buildProcessEngineConfiguration() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/flowable?useUnicode=true&characterEncoding=UTF8&useSSL=false&serverTimezone=Asia/Shanghai&allowMultiQueries=true&allowPublicKeyRetrieval=true&nullCatalogMeansCurrent=true");
        dataSource.setUsername("root");
        dataSource.setPassword("wasdwasd");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setMaxActive(3);
        dataSource.setMinIdle(1);

        ProcessEngineConfiguration processEngineConfiguration = new StandaloneProcessEngineConfiguration();
        processEngineConfiguration.setDataSource(dataSource);
        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
//        processEngineConfiguration.buildProcessEngine();
        return processEngineConfiguration;
    }

}
