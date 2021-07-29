package com.telstra;

class Multi3 extends Thread{   
	public void run(){  
		for(int i = 0;i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " is running"); //to display thread name
			//Thread.yield(); //pauses the thread
			try { 
				Thread.sleep(2000); //stop thread for sometime
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	 public static void main(String args[]) throws InterruptedException{  
		   Multi3 t1=new Multi3();  
		   //Multi3 t2=new Multi3();  
			   
		   t1.start(); 
		   
		   t1.join(10000);
		   
		   for(int i = 0;i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "thread running");
		   }
	  }  
} 