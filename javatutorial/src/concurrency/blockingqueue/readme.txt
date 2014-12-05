BlockingQueue
The Java BlockingQueue interface in the java.util.concurrent class represents a queue which is thread safe to put into, and take instances from. In this text I will show you how to use this BlockingQueue.

This text will not discuss how to implement a BlockingQueue in Java yourself. If you are interested in that, I have a text on Blocking Queues in my more theoretical Java Concurrency Tutorial.

BlockingQueue Usage

A BlockingQueue is typically used to have on thread produce objects, which another thread consumes. Here is a diagram that illustrates this principle:

A BlockingQueue with one thread putting into it, and another thread taking from it.
A BlockingQueue with one thread putting into it, and another thread taking from it.
The producing thread will keep producing new objects and insert them into the queue, until the queue reaches some upper bound on what it can contain. It's limit, in other words. If the blocking queue reaches its upper limit, the producing thread is blocked while trying to insert the new object. It remains blocked until a consuming thread takes an object out of the queue.

The consuming thread keeps taking objects out of the blocking queue, and processes them. If the consuming thread tries to take an object out of an empty queue, the consuming thread is blocked until a producing thread puts an object into the queue.


BlockingQueue Methods

A BlockingQueue has 4 different sets of methods for inserting, removing and examining the elements in the queue. Each set of methods behaves differently in case the requested operation cannot be carried out immediately. Here is a table of the methods:

 	Throws Exception	Special Value	Blocks	Times Out
Insert	add(o)	offer(o)	put(o)	offer(o, timeout, timeunit)
Remove	remove(o)	poll(o)	take(o)	poll(timeout, timeunit)
Examine	element(o)	peek(o)	 	 
The 4 different sets of behaviour means this:

Throws Exception: 
If the attempted operation is not possible immediately, an exception is thrown.
Special Value: 
If the attempted operation is not possible immediately, a special value is returned (often true / false).
Blocks: 
If the attempted operation is not possible immedidately, the method call blocks until it is.
Times Out: 
If the attempted operation is not possible immedidately, the method call blocks until it is, but waits no longer than the given timeout. Returns a special value telling whether the operation succeeded or not (typically true / false).
It is not possible to insert null into a BlockingQueue. If you try to insert null, the BlockingQueue will throw a NullPointerException.

It is also possible to access all the elements inside a BlockingQueue, and not just the elements at the start and end. For instance, say you have queued an object for processing, but your application decides to cancel it. You can then call e.g. remove(o) to remove a specific object in the queue. However, this is not done very efficiently, so you should not use these Collection methods unless you really have to.

BlockingQueue Implementations

Since BlockingQueue is an interface, you need to use one of its implementations to use it. The java.util.concurrent package has the following implementations of the BlockingQueue interface (in Java 6):

ArrayBlockingQueue
DelayQueue
LinkedBlockingQueue
PriorityBlockingQueue
SynchronousQueue
Click the links in the list to read more about each implementation. If a link cannot be clicked, that implementation has not yet been described. Check back again in the future, or check out the JavaDoc's for more detail.