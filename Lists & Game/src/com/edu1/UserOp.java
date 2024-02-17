package com.edu1;

import java.util.ArrayList;

public class UserOp {
	private ArrayList<User> arr;
	
	public UserOp() {
		arr = new ArrayList<User>();
	}
	
	public void addUser(User us) {
		arr.add(us);
	}
	
	public void removeUser(User us) {
		arr.remove(us);
	}

	public void login(String userName, String pass) {
	    boolean found = false;
	    for (User user : arr) {
	        String existingPassword = user.getPass();
	        String existingUserName = user.getName();

	        if (existingPassword.equals(pass) && existingUserName.equals(userName)) {
	            System.out.println("Successfully logged in");
	            found = true;
	            Game gm=new Game();
	            //gm.Start();
	            gm.Start();
	            break; 
	        }
	    }

	    if (!found) {
	        System.out.println("Please enter correct userId or password");
	    }

	    App.start(); 
	}

			
			
			
	
	public void displayUser() {
		for(User us : arr) {
			System.out.println("Username: "+us.getName()+" Password: "+us.getPass());
			
		}
	}

	
	
}
