package com.ligeng.flowabledemo;

/**
 * 初始化数据库
 */
public class InitDB {
    public static void main(String[] args) {
        ProcessEngineConfigurationFactory.buildProcessEngineConfiguration().buildProcessEngine();
    }
}
