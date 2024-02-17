package com.edu;

import java.util.Scanner;

public class MainApp {
	static Taskmng tm =new Taskmng();
    public static void main(String[] args) {
	
	TaskOp tp=new TaskOp();
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Press\t1)Add New Task   2)Update Task Information   3)Mark Task as Completed   4)Task Details	5)Remove Task");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		tp.AddTask();
		break;
	case 2:
		tp.UpdateTask();
		break;
	case 3:
		tp.MarkCompletedTask();
		break;
	case 4:
		tp.SeeTaskDetails();
		break;
	case 5:
		tp.RemoveTask(tm);
		break;
	default:
			break;

	}
	}
}
}
