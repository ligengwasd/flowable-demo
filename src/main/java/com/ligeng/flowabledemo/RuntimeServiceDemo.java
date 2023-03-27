package com.ligeng.flowabledemo;

import com.google.gson.Gson;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;

import java.util.HashMap;
import java.util.Map;

public class RuntimeServiceDemo {
    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngineFactory.buildProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("employee", "geng.li");
        ProcessInstance processInstance =
                runtimeService.startProcessInstanceByKey("holidayRequest", variables);
    }
}
