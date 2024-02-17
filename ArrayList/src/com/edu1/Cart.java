package com.edu1;

import java.util.ArrayList;
import java.util.Iterator;


public final class Cart {
	ArrayList<Product>list;
	public Cart(){
		this.list=new ArrayList<>();
	}
	public void addItems(Product pd) {
	list.add(pd);
	}

	public void displayItems() {
	for(Product p:list) {
		System.out.println("Product name :"+p.getPname()+"  | Product Price: "+p.getPrice());
		}
	}
	

	public void removeItems(Product pd) {
		list.remove(pd);
	}
	public void RemoveItems(String name) {
		Iterator<Product>itr=list.iterator();
		while(itr.hasNext()) {
			Product pd=itr.next();
			if(pd.getPname()==name) {
				itr.remove();
			}
		}
	}

	

}