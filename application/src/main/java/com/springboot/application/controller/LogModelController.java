package com.springboot.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.application.model.LogModel;
import com.springboot.application.service.LogModelService;

@RestController
public class LogModelController {
	@Autowired
    private LogModelService logModelService;

    @PostMapping("/add")
    public String add(@RequestBody LogModel logModel){
        logModelService.saveLog(logModel);
        return "New log is added";
    }

    @GetMapping("/getAll")
    public List<LogModel> list(){
        return logModelService.getAllLogs();
    }
}
