package com.capgemini.thread.dev;

public class ThreadThree implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+":");
		}
	}
}
