package com.telstra;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() { //inner class in java //annonymous inner class
			public void run() {
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
		});
		t.start();
		t.setName("userThread1"); //to set name
		for(int i = 0;i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "thread running");
		}
	}

}
