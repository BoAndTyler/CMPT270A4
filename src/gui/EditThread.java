package gui;

import controler.Controler;
import systemEntities.Person;

public class EditThread extends Thread{
	 private Controler theControler;
	 private Person thePerson; 
	 private Object theLock;     
	 public EditThread(Controler aControler,Person aPerson, Object lock) {
		theControler = aControler;
		thePerson = aPerson;     
		this.theLock = lock;
	 
	 }     
	
	 /**
	  * 
	  * @param args
	  * @throws Exception
	  * main test
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
