package com.ligeng.flowabledemo;

import com.google.gson.Gson;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.Deployment;

public class RepositoryServiceDemo {
    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngineFactory.buildProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("holiday-request.bpmn20.xml")
                .deploy();
        System.out.println(new Gson().toJson(deployment));
    }
}
