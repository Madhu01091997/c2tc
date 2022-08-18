package CollectionFrame;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Buffer {
	private Queue<Integer> clQueue = new ConcurrentLinkedQueue<Integer>();

	// Retrieving from the queue
	public void get() {
		System.out.println("Consumer received - " + clQueue.poll());
	}

	// putting in the queue
	public void put(int i) {
		clQueue.add(i);
		System.out.println("Producer Produced - " + i);
	}

}
