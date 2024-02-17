package com.edu;

public class Taskmng {
private int taskId;
private String title;
private String description;
private String dueDate;
private int priorityLevel;
private String status;
@Override
public String toString() {
	return "Taskmng [taskId=" + taskId + ", title=" + title + ", description=" + description + ", dueDate=" + dueDate
			+ ", priorityLevel=" + priorityLevel + ", status=" + status + "]";
}
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDueDate() {
	return dueDate;
}
public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
}
public int getPriorityLevel() {
	return priorityLevel;
}
public void setPriorityLevel(int priorityLevel) {
	this.priorityLevel = priorityLevel;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
