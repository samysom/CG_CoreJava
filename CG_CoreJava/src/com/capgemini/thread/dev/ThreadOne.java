package com.capgemini.thread.dev;

public class ThreadOne extends Thread {
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+", ");
		}
	}
}
