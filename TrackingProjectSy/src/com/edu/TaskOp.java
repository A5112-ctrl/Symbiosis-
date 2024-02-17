package com.edu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;



public class TaskOp {
	static Scanner sc=new Scanner(System.in);
	private ArrayList<Taskmng> t;
	public TaskOp() {
		t=new ArrayList<Taskmng>();
	}
	public void addtask(Taskmng tm) {
		t.add(tm);
	}
	public void removeUser(Taskmng tm) {
		t.remove(tm);
	}
	//static Taskmng tm=new Taskmng();
	public void AddTask() {
	Taskmng tm=new Taskmng();
		
		System.out.println("Enter task ID :");
		tm.setTaskId(sc.nextInt());
		System.out.println("Title :");
		tm.setTitle(sc.next());
		System.out.println("Description :");
		tm.setDescription(sc.next());
		System.out.println("Due date :");
		tm.setDueDate(sc.next());
		System.out.println("Priority Level :");
		tm.setPriorityLevel(sc.nextInt());
		System.out.println("Status :");
		tm.setStatus(sc.next());
		addtask(tm);
		
	}
	public void UpdateTask() {
	
	}

	public void MarkCompletedTask() {
		
	}
	public void RemoveTask(Taskmng tm) {
		t.remove(tm);
	}

	public void SeeTaskDetails() {
		for(Taskmng ob:t) {
		System.out.println("Task Id :"+ob.getTaskId()+"\tTask Title :"+ob.getTitle()+
				"\tTask Due Date :"+ob.getDueDate()+"\tTask Descrption :"+ob.getDescription()+
				"\tTask Status :"+ob.getStatus()+"\tTask Priority Level :"+ob.getPriorityLevel());
	}
	}

}
