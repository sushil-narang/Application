package com.springboot.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.application.model.LogModel;
import com.springboot.application.repository.LogModelRepository;
@Service
public class LogModelServiceImpl implements LogModelService {
	
	@Autowired
	public LogModelRepository logModelRepository;

	@Override
	public LogModel saveLog(LogModel logModel) {
		
		return logModelRepository.save(logModel);
	}

	@Override
	public List<LogModel> getAllLogs() {
		
		return logModelRepository.findAll();
	}

}
