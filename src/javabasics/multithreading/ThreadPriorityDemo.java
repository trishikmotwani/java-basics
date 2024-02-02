package javabasics.multithreading;

class ThreadPriorityDemo extends Thread {
    
	ThreadPriorityDemo(String threadName) {
		this.setName(threadName);
	}
	public void run()
    {
    	for(int i = 0; i< 100; i++) {
    		System.out.println(Thread.currentThread().getName() + "->" + i);
    	}
        
    }
 
    public static void main(String[] args)
    {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo("t1");
        ThreadPriorityDemo t2 = new ThreadPriorityDemo("t2");
        ThreadPriorityDemo t3 = new ThreadPriorityDemo("t3");
 
        // Default 5
        System.out.println("t1 thread priority : "
                           + t1.getPriority()); 
       
        // Default 5
        System.out.println("t2 thread priority : "
                           + t2.getPriority()); 
       
        // Default 5
        System.out.println("t3 thread priority : "
                           + t3.getPriority()); 
 
        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(5);
 
        // t3.setPriority(21); will throw
        // IllegalArgumentException
       
        // 2
        System.out.println("t1 thread priority : "
                           + t1.getPriority()); 
       
        // 5
        System.out.println("t2 thread priority : "
                           + t2.getPriority()); 
       
        // 8
        System.out.println("t3 thread priority : "
                           + t3.getPriority()); 
 
        // Main thread
       
        // Displays the name of
        // currently executing Thread
        System.out.println(
            "Currently Executing Thread : "
            + Thread.currentThread()
                  .getName());
       
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());
 
        // Main thread priority is set to 10
        Thread.currentThread().setPriority(5);
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());
        
        t1.start();
        t2.start();
        
    }
}
