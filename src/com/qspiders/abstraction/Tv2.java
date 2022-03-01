package com.qspiders.abstraction;

abstract public class Tv2 implements Tv,Tv1
{
	public void hdChannels()
	{
		System.out.println("pay and subscribe to HD channels");
	}
	public void record()
	{
		System.out.println("pay and subscribe to recording of channels");
	}

}
