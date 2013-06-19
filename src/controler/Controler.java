package controler;


import gui.Panel;

import java.util.Hashtable;

import systemEntities.Person;

public class Controler {
	Hashtable<String, Person> databaseHashtable;
	Panel mainPanel;
	
	public void createPersonFromGUI(Person newGuy){
		databaseHashtable.put(newGuy.getName(), newGuy);
		updateList();
	}

	private void updateList() {
		// TODO Auto-generated method stub
		
	}
	
}
