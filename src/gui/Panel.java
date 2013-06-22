package gui;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import systemEntities.Person;

import controler.Controler;
import dataStorage.PersonSetAccess;





import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
/**
 * 
 * @author Bo Dong and Tyler Spink
 *
 */
public class Panel {
	
	DefaultListModel listModel = new DefaultListModel();	// Added this line *********************************

	private JFrame frame;
	Controler theControler; 
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
					window.frame.setVisible(true);
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
		initialize();
		theControler = Ctrl;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JList list = new JList(listModel);	// Added listModel to input
//		JList list = new JList();
		list.setBounds(10, 10, 300, 200);
		frame.getContentPane().add(list);
		
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
		frame.getContentPane().add(btnCreate);
		
		JButton btnRead = new JButton("Read");
		btnRead.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					//ask for Jlist for the selected person name
					Person aPerson;
					String focus = (String)list.getSelectedValue();
					//search the name in the hashTable
					aPerson = PersonSetAccess.personList().get(focus);
					ReadPerson frame = new ReadPerson(theControler,aPerson);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnRead.setBounds(331, 43, 93, 23);
		frame.getContentPane().add(btnRead);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(331, 76, 93, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list.getSelectedValue() != null)
				{
					int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + (String)list.getSelectedValue() 
															+ " ?", "Confirm delete", JOptionPane.YES_NO_OPTION); 
			        if (n == JOptionPane.YES_OPTION) 
			        { 
				        String focus = (String)list.getSelectedValue();
			        	int index = list.getSelectedIndex();
			        	PersonSetAccess.personList().remove(focus);
			        	listModel.remove(index);
			        	updateList();
			        } else if (n == JOptionPane.NO_OPTION) 
			        { 
			            //close this YES or No Window and do nothing.
			        }
				}
			}
		});
		btnDelete.setBounds(331, 109, 93, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnRefresh = new JButton("refresh");
		btnRefresh.setBounds(10, 220, 93, 23);
		frame.getContentPane().add(btnRefresh);
	}
	
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
}
