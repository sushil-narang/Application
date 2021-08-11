package com.springboot.application.service;

import java.util.List;

import com.springboot.application.model.LogModel;

public interface LogModelService {
    public LogModel saveLog(LogModel logModel);
    public List<LogModel> getAllLogs();
}
