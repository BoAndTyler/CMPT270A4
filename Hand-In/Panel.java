package gui;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import systemEntities.ImportHashtable;
import systemEntities.Person;
import systemEntities.SaveHashtable;
import controler.Controler;
import dataStorage.PersonSetAccess;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * The Main Menu GUI that gives the user the option to create a new person, 
 * view or edit an existing person, or delete an eexisting person.
 * @author Bo Dong and Tyler Spink
 * GUI created with WindowBuilder Editor
 */
public class Panel {
	
	DefaultListModel listModel = new DefaultListModel();

	private JFrame frmMainMenu;
	Controler theControler; 
	JList aJList;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controler aControler = new Controler();
					Panel window = new Panel(aControler);
					aControler.setPanel(window);
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Panel(Controler Ctrl) {
		
		theControler = Ctrl;
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				SaveHashtable.saveHashtable();
			}
			@Override
			public void windowOpened(WindowEvent arg0) {
				ImportHashtable.importHashtable();
				updateList();
			}
		});
		frmMainMenu.setResizable(false);
		frmMainMenu.setBounds(100, 100, 450, 250);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);
		
		aJList = new JList(listModel);	// Added listModel to input
//		JList list = new JList();
		aJList.setBounds(10, 10, 300, 200);
		frmMainMenu.getContentPane().add(aJList);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCreate.addMouseListener(new MouseAdapter() {
			
			/**
			 * @Override open a new window to create new elements.
			 */
			public void mouseClicked(MouseEvent e) {
				try {
					CreatePerson frame = new CreatePerson(theControler);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCreate.setBounds(331, 10, 93, 23);
		frmMainMenu.getContentPane().add(btnCreate);
		
		JButton btnRead = new JButton("Read");
		btnRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					//ask for JList for the selected person name
					Person aPerson;
					String focus = (String)aJList.getSelectedValue();
					if (null == focus) {
						JOptionPane.showMessageDialog(null, "Hey! You selected Nothing!");
					}else{
					//search the name in the hashTable
					aPerson = PersonSetAccess.personList().get(focus);
					ReadPerson frame = new ReadPerson(theControler,aPerson);
					frame.setVisible(true);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}			
			}
		});
		btnRead.setBounds(331, 43, 93, 23);
		frmMainMenu.getContentPane().add(btnRead);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				//ask for JList for the selected person name
				Person aPerson;
				String focus = (String)aJList.getSelectedValue();
				if (null == focus) {
					JOptionPane.showMessageDialog(null, "Hey! You selected Nothing!");
				}else{
				//search the name in the hashTable
				aPerson = PersonSetAccess.personList().get(focus);
				new EditThread(theControler, aPerson, aJList.getSelectedValue()).start();
				}
			}
		});
		btnUpdate.setBounds(331, 76, 93, 23);
		frmMainMenu.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(aJList.getSelectedValue() != null)
				{
					int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + (String)aJList.getSelectedValue() 
															+ " ?", "Confirm delete", JOptionPane.YES_NO_OPTION); 
			        if (n == JOptionPane.YES_OPTION) 
			        { 
			        	deleteSelected();
			        } else if (n == JOptionPane.NO_OPTION) 
			        { 
			            //close this YES or No Window and do nothing.
			        }
				}
			}
		});
		btnDelete.setBounds(331, 109, 93, 23);
		frmMainMenu.getContentPane().add(btnDelete);
	}
	
	/**
	 * Updates the list of people shown in the main menu after the data has been modified.
	 */
	public void updateList()
	{
		Enumeration names;
		listModel.removeAllElements();
		names = PersonSetAccess.personList().keys();
		while(names.hasMoreElements())
		{
			listModel.addElement((String)names.nextElement());
			//names.nextElement();
		}
	}
	
	/**
	 * Deletes the selected person the from the hash table.
	 */
	public void deleteSelected(){
		String focus = (String)aJList.getSelectedValue();
    	int index = aJList.getSelectedIndex();
    	PersonSetAccess.personList().remove(focus);
    	listModel.remove(index);
    	updateList();
	}
}
