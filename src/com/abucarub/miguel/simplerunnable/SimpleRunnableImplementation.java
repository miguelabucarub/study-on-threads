package com.abucarub.miguel.simplerunnable;

public class SimpleRunnableImplementation implements Runnable{

	@Override
	public void run() {

        // We are creating a simple loop which will run and allow us to take
        // a look into how the different threads run.
        for (int i = 0; i < 5; i++) {
            
            // Thread.currentThread().getName() is used to get the name of the 
            // currently running thread. We can provide a name, if we create
            // the thread ourselves, else it will be given one from the JVM.
            System.out.println(Thread.currentThread().getName() +
                    "\twith Runnable: SimpleRunnableImplementation runs..." + i);
        }
	}

}
