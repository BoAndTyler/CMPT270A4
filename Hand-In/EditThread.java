package gui;

import controler.Controler;
import systemEntities.Person;

/**
 * Editing of threads to allow for synchronized locking.
 * @author Bo Dong and Tyler Spink
 */
public class EditThread extends Thread{
	
	/**
	 * Instance of the controller.
	 */
	 private Controler theControler;
	 
	 /**
	  * Instance of the person.
	  */
	 private Person thePerson;
	 
	 /**
	  * The lock object for threads.
	  */
	 private Object theLock;   
	 
	 /**
	  * The constructor for edit thread.
	  * @param aControler an instance of the controller
	  * @param aPerson an instance of the person
	  * @param lock the lock object for the threads
	  */
	 public EditThread(Controler aControler,Person aPerson, Object lock) {
		theControler = aControler;
		thePerson = aPerson;     
		this.theLock = lock;
	 }     
	
	 /**
	  * Testing the locking of the thread.
	  */
	 public static void main(String[] args) throws Exception {     
	    String lock = new String("lock");  
	    Controler aControler = new Controler();
	    Person aPerson= new Person();
	    aPerson.setName("Jack", "M", "Sully");
	    for (int i = 1; i < 10; i++) {
	    	new EditThread(aControler,aPerson, lock).start();     
	    	Thread.sleep(1);     
	     }     
	  }      
	 
	 /**
	  * Running the synchronized thread with a lock.
	  */
	 public void run() {       
		 synchronized (theLock) {     
			 try {
					EditPerson frame = new EditPerson(theControler,thePerson);
					frame.setVisible(true);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			
		 }       
	 }     
}
