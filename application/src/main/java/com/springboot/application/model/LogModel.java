package com.springboot.application.model;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="LogModel")
public class LogModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer logId;
public LogModel() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getLogId() {
	return logId;
}

public void setLogId(Integer logId)
{
	this.logId=logId;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLogtype() {
	return logtype;
}
public void setLogtype(String logtype) {
	this.logtype = logtype;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
private String Id;
private String name;
private String logtype;
private String date;
private String time;


}
