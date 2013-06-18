package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import com.sun.imageio.stream.StreamCloser.CloseAction;
import com.sun.xml.internal.ws.Closeable;

import sun.java2d.Disposer;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel window = new Panel();
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
	public Panel() {
		initialize();
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
		
		JList list = new JList();
		list.setBounds(10, 10, 300, 200);
		frame.getContentPane().add(list);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addMouseListener(new MouseAdapter() {
			
			/**
			 * @Override open a new window to create new elements.
			 */
			public void mouseClicked(MouseEvent e) {
				//TODO
			}
		});
		btnCreate.setBounds(331, 10, 93, 23);
		frame.getContentPane().add(btnCreate);
		
		JButton btnRead = new JButton("Read");
		btnRead.setBounds(331, 43, 93, 23);
		frame.getContentPane().add(btnRead);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(331, 76, 93, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "delete this?", "confirm dialog", JOptionPane.YES_NO_OPTION); 
		        if (n == JOptionPane.YES_OPTION) { 
		            //TODO
		        	
		        } else if (n == JOptionPane.NO_OPTION) { 
		            //close this YES or No Window and do nothing.
		        }
			}
		});
		btnDelete.setBounds(331, 109, 93, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnRefresh = new JButton("refresh");
		btnRefresh.setBounds(10, 220, 93, 23);
		frame.getContentPane().add(btnRefresh);
	}
}
