package concurrency.blockingqueue.linkedblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) {
		BlockingQueue queue = new LinkedBlockingQueue();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
        
	}

}

class Consumer implements Runnable{
	
	BlockingQueue blockingQueue;

	public Consumer(BlockingQueue blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable{
	
	BlockingQueue blockingQueue;

	public Producer(BlockingQueue blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.blockingQueue.put("1");
			this.blockingQueue.put("AirBlade");
			this.blockingQueue.put("iPhone");
			this.blockingQueue.put("4");
			this.blockingQueue.put("5");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}