package com.practice;

//	USE OF VOLATILE KEYWORD

class SampleClass extends Thread {

//	private volatile boolean isTrue = true;
	public void run() {

		try {
//			while(isTrue) {
//				
//				System.out.println("running!!!");
//			}
//			for (int i = 0; i < 5; ++i) {
//
////				Thread.yield();
//				System.out.println("Thread Started : "+Thread.currentThread().getName());
//			}
//			Thread.sleep(1000);
			System.out.println("Thread Ended : "+Thread.currentThread().getName());
		} catch (Exception e) {

			System.out.println("Thread Not Syncronized!!!");
		}
	}

	public void shutdown() {

//		isTrue = false;
		System.out.println("Thread showdowned!!!");
	}
}
public class VolatileKeyword {

	public static void main(String[] args) {

		SampleClass sampleClass = new SampleClass();
		sampleClass.start();
		sampleClass.interrupt();
//		SampleClass sampleClass1 = new SampleClass();
//		sampleClass1.start();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//		for (int i = 0; i < 5; ++i) {
//
//			System.out.println("Thread Started : "+Thread.currentThread().getName());
//		}
//		System.out.println("Thread Ended : "+Thread.currentThread().getName());
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		sampleClass.shutdown();
//		SampleClass sampleClass1 = new SampleClass();
//		sampleClass1.start();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		sampleClass1.shutdown();
	}
}
