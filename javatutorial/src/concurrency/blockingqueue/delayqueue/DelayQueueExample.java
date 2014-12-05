package concurrency.blockingqueue.delayqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {

	public static void main(String[] args) throws InterruptedException {
		
		DelayQueue queue = new DelayQueue();

		Delayed element1 = new DelayedElement();

		queue.put(element1);

		Delayed element2 = queue.take();

		System.out.println(element2.getDelay(TimeUnit.MILLISECONDS));
	}

}
