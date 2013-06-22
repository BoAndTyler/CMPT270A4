package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

import controler.Controler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * 
 * @author Bo Dong and Tyler Spink
 */
public class CreatePerson extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controler aControler = new Controler();
					CreatePerson frame = new CreatePerson(aControler);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreatePerson(final Controler Ctrl) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 510, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("choose a type of data you want to create:");
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnCreate = new JButton("Save");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println(buttonGroup.getSelection().getActionCommand());
				if(buttonGroup.getSelection().getActionCommand().equals("Person"))
				{
					//System.out.println("First Name: " + textField.getText().equals(""));
					if(!textField.getText().equals("") && !textField_1.getText().equals("") && !textField_2.getText().equals(""))	// TODO - Add more block conditions
					{
						String firstName = textField.getText();
						String middleInitial = textField_1.getText();
						String lastName = textField_2.getText();
						String streetAddress = textField_3.getText();
						String city = textField_5.getText();
						String prov = textField_6.getText();
						String postalCode = textField_7.getText();
						String homePhone = textField_8.getText();
						String workPhone = textField_9.getText();
						String emailAddress = textField_10.getText();
						
						Ctrl.addPerson(firstName, middleInitial, lastName, streetAddress, city, 
										prov, postalCode, homePhone, workPhone, emailAddress);
						dispose();
					}
				}
				else if(buttonGroup.getSelection().getActionCommand().equals("Undergradate Student"))
				{
					if(!textField.getText().equals("") && !textField_1.getText().equals("") && !textField_2.getText().equals(""))
					{
						String firstName = textField.getText();
						String middleInitial = textField_1.getText();
						String lastName = textField_2.getText();
						String streetAddress = textField_3.getText();
						String city = textField_5.getText();
						String prov = textField_6.getText();
						String postalCode = textField_7.getText();
						String homePhone = textField_8.getText();
						String workPhone = textField_9.getText();
						String emailAddress = textField_10.getText();
						
						String yearRegistered = textField_11.getText();
						String degreeProgram = textField_12.getText();
						String currentYear = textField_13.getText();
						String marks = textField_14.getText();
						String totalCredits = textField_15.getText();
						
						Ctrl.addUndergrad(firstName, middleInitial, lastName, streetAddress, city, 
											prov, postalCode, homePhone, workPhone, emailAddress, 
											yearRegistered, degreeProgram, currentYear, marks, totalCredits);
						dispose();
					}
				}
				else if(buttonGroup.getSelection().getActionCommand().equals("Graduate Student"))
				{
					if(!textField.getText().equals("") && !textField_1.getText().equals("") && !textField_2.getText().equals(""))
					{
						String firstName = textField.getText();
						String middleInitial = textField_1.getText();
						String lastName = textField_2.getText();
						String streetAddress = textField_3.getText();
						String city = textField_5.getText();
						String prov = textField_6.getText();
						String postalCode = textField_7.getText();
						String homePhone = textField_8.getText();
						String workPhone = textField_9.getText();
						String emailAddress = textField_10.getText();
						
						String yearRegistered = textField_11.getText();
						String degreeProgram = textField_12.getText();
						String currentYear = textField_13.getText();
						String marks = textField_14.getText();
						String totalCredits = textField_15.getText();
						
						String supervisor = textField_16.getText();
						String thesisTitle = textField_18.getText();
						String thesisArea = textField_19.getText();
						String scholarship = textField_20.getText();
						String degreeType = textField_21.getText();
						
						Ctrl.addGraduate(firstName, middleInitial, lastName, streetAddress, city, 
											prov, postalCode, homePhone, workPhone, emailAddress, 
											yearRegistered, degreeProgram, currentYear, marks, totalCredits, 
											supervisor, thesisTitle, thesisArea, scholarship, degreeType);
						dispose();
					}
				}
			}
		});
		panel.add(btnCreate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		panel.add(btnCancel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{17, 61, 39, 145, 121, 0};
		gbl_panel_3.rowHeights = new int[]{23, 0, 0, 27, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JRadioButton rdbtnPerson = new JRadioButton("Person");
		rdbtnPerson.setSelected(true);
		rdbtnPerson.setActionCommand("Person");
		rdbtnPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				//textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(true);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				//textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
			}
		});
		buttonGroup.add(rdbtnPerson);
		GridBagConstraints gbc_rdbtnPerson = new GridBagConstraints();
		gbc_rdbtnPerson.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPerson.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPerson.gridx = 0;
		gbc_rdbtnPerson.gridy = 1;
		panel_3.add(rdbtnPerson, gbc_rdbtnPerson);
		
		JLabel lblFirstName = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 1;
		gbc_lblFirstName.gridy = 1;
		panel_3.add(lblFirstName, gbc_lblFirstName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_3.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnUndergradstudent = new JRadioButton("Undergradate Student");
		rdbtnUndergradstudent.setActionCommand("Undergradate Student");
		rdbtnUndergradstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				//textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(true);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(true);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				//textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
			}
		});
		buttonGroup.add(rdbtnUndergradstudent);
		GridBagConstraints gbc_rdbtnUndergradstudent = new GridBagConstraints();
		gbc_rdbtnUndergradstudent.anchor = GridBagConstraints.WEST;
		gbc_rdbtnUndergradstudent.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnUndergradstudent.gridx = 0;
		gbc_rdbtnUndergradstudent.gridy = 2;
		panel_3.add(rdbtnUndergradstudent, gbc_rdbtnUndergradstudent);
		
		JLabel lblMiddleInitial = new JLabel("middle initial");
		GridBagConstraints gbc_lblMiddleInitial = new GridBagConstraints();
		gbc_lblMiddleInitial.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiddleInitial.gridx = 1;
		gbc_lblMiddleInitial.gridy = 2;
		panel_3.add(lblMiddleInitial, gbc_lblMiddleInitial);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel_3.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnGraduateStudent = new JRadioButton("Graduate Student");
		rdbtnGraduateStudent.setActionCommand("Graduate Student");
		rdbtnGraduateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				//textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(true);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(true);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(true);
				//textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(true);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
			}
		});
		buttonGroup.add(rdbtnGraduateStudent);
		GridBagConstraints gbc_rdbtnGraduateStudent = new GridBagConstraints();
		gbc_rdbtnGraduateStudent.anchor = GridBagConstraints.WEST;
		gbc_rdbtnGraduateStudent.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnGraduateStudent.gridx = 0;
		gbc_rdbtnGraduateStudent.gridy = 3;
		panel_3.add(rdbtnGraduateStudent, gbc_rdbtnGraduateStudent);
		
		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 1;
		gbc_lblLastName.gridy = 3;
		panel_3.add(lblLastName, gbc_lblLastName);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel_3.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblStreetAddress = new JLabel("Street Address");
		GridBagConstraints gbc_lblStreetAddress = new GridBagConstraints();
		gbc_lblStreetAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreetAddress.gridx = 1;
		gbc_lblStreetAddress.gridy = 4;
		panel_3.add(lblStreetAddress, gbc_lblStreetAddress);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panel_3.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblCity.gridx = 1;
		gbc_lblCity.gridy = 6;
		panel_3.add(lblCity, gbc_lblCity);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		panel_3.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblProvince = new JLabel("Province");
		GridBagConstraints gbc_lblProvince = new GridBagConstraints();
		gbc_lblProvince.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvince.gridx = 1;
		gbc_lblProvince.gridy = 7;
		panel_3.add(lblProvince, gbc_lblProvince);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 2;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 7;
		panel_3.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		GridBagConstraints gbc_lblPostalCode = new GridBagConstraints();
		gbc_lblPostalCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblPostalCode.gridx = 1;
		gbc_lblPostalCode.gridy = 8;
		panel_3.add(lblPostalCode, gbc_lblPostalCode);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.gridwidth = 2;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 8;
		panel_3.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber.gridx = 1;
		gbc_lblPhoneNumber.gridy = 9;
		panel_3.add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		JLabel lblHome = new JLabel("HOME");
		GridBagConstraints gbc_lblHome = new GridBagConstraints();
		gbc_lblHome.anchor = GridBagConstraints.EAST;
		gbc_lblHome.insets = new Insets(0, 0, 5, 5);
		gbc_lblHome.gridx = 1;
		gbc_lblHome.gridy = 10;
		panel_3.add(lblHome, gbc_lblHome);
		
		JLabel label = new JLabel("(306)");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 2;
		gbc_label.gridy = 10;
		panel_3.add(label, gbc_label);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 3;
		gbc_textField_8.gridy = 10;
		panel_3.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblWork = new JLabel("WORK");
		GridBagConstraints gbc_lblWork = new GridBagConstraints();
		gbc_lblWork.anchor = GridBagConstraints.EAST;
		gbc_lblWork.insets = new Insets(0, 0, 5, 5);
		gbc_lblWork.gridx = 1;
		gbc_lblWork.gridy = 11;
		panel_3.add(lblWork, gbc_lblWork);
		
		JLabel label_1 = new JLabel("(306)");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 11;
		panel_3.add(label_1, gbc_label_1);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 11;
		panel_3.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 12;
		panel_3.add(lblEmail, gbc_lblEmail);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.gridwidth = 2;
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 2;
		gbc_textField_10.gridy = 12;
		panel_3.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRegisteredYear = new JLabel("Registered Year");
		GridBagConstraints gbc_lblRegisteredYear = new GridBagConstraints();
		gbc_lblRegisteredYear.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegisteredYear.gridx = 1;
		gbc_lblRegisteredYear.gridy = 13;
		panel_3.add(lblRegisteredYear, gbc_lblRegisteredYear);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.gridwidth = 2;
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 2;
		gbc_textField_11.gridy = 13;
		panel_3.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblDegreeProgram = new JLabel("Degree Program");
		GridBagConstraints gbc_lblDegreeProgram = new GridBagConstraints();
		gbc_lblDegreeProgram.insets = new Insets(0, 0, 5, 5);
		gbc_lblDegreeProgram.gridx = 1;
		gbc_lblDegreeProgram.gridy = 14;
		panel_3.add(lblDegreeProgram, gbc_lblDegreeProgram);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.gridwidth = 2;
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 2;
		gbc_textField_12.gridy = 14;
		panel_3.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblYearInProgram = new JLabel("Year in Program");
		GridBagConstraints gbc_lblYearInProgram = new GridBagConstraints();
		gbc_lblYearInProgram.insets = new Insets(0, 0, 5, 5);
		gbc_lblYearInProgram.gridx = 1;
		gbc_lblYearInProgram.gridy = 15;
		panel_3.add(lblYearInProgram, gbc_lblYearInProgram);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.gridwidth = 2;
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 2;
		gbc_textField_13.gridy = 15;
		panel_3.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel lblGpa = new JLabel("GPA");
		GridBagConstraints gbc_lblGpa = new GridBagConstraints();
		gbc_lblGpa.insets = new Insets(0, 0, 5, 5);
		gbc_lblGpa.gridx = 1;
		gbc_lblGpa.gridy = 16;
		panel_3.add(lblGpa, gbc_lblGpa);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.gridwidth = 2;
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 2;
		gbc_textField_14.gridy = 16;
		panel_3.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblTotalCredits = new JLabel("Total Credits");
		GridBagConstraints gbc_lblTotalCredits = new GridBagConstraints();
		gbc_lblTotalCredits.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalCredits.gridx = 1;
		gbc_lblTotalCredits.gridy = 17;
		panel_3.add(lblTotalCredits, gbc_lblTotalCredits);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.gridwidth = 2;
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 2;
		gbc_textField_15.gridy = 17;
		panel_3.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JLabel lblThesisSupervisor = new JLabel("Thesis Supervisor");
		GridBagConstraints gbc_lblThesisSupervisor = new GridBagConstraints();
		gbc_lblThesisSupervisor.anchor = GridBagConstraints.EAST;
		gbc_lblThesisSupervisor.insets = new Insets(0, 0, 5, 5);
		gbc_lblThesisSupervisor.gridx = 1;
		gbc_lblThesisSupervisor.gridy = 18;
		panel_3.add(lblThesisSupervisor, gbc_lblThesisSupervisor);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.gridwidth = 2;
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 2;
		gbc_textField_16.gridy = 18;
		panel_3.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		JLabel lblThesis = new JLabel("Thesis");
		GridBagConstraints gbc_lblThesis = new GridBagConstraints();
		gbc_lblThesis.insets = new Insets(0, 0, 5, 5);
		gbc_lblThesis.gridx = 1;
		gbc_lblThesis.gridy = 19;
		panel_3.add(lblThesis, gbc_lblThesis);
		
		JLabel lblTitle = new JLabel("Title");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.anchor = GridBagConstraints.EAST;
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 20;
		panel_3.add(lblTitle, gbc_lblTitle);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.gridwidth = 2;
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 2;
		gbc_textField_18.gridy = 20;
		panel_3.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);
		
		JLabel lblArea = new JLabel("Area");
		GridBagConstraints gbc_lblArea = new GridBagConstraints();
		gbc_lblArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblArea.anchor = GridBagConstraints.EAST;
		gbc_lblArea.gridx = 1;
		gbc_lblArea.gridy = 21;
		panel_3.add(lblArea, gbc_lblArea);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.gridwidth = 2;
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 2;
		gbc_textField_19.gridy = 21;
		panel_3.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);
		
		JLabel lblScholarshipAmount = new JLabel("ScholarShip Amount");
		GridBagConstraints gbc_lblScholarshipAmount = new GridBagConstraints();
		gbc_lblScholarshipAmount.insets = new Insets(0, 0, 5, 5);
		gbc_lblScholarshipAmount.gridx = 1;
		gbc_lblScholarshipAmount.gridy = 22;
		panel_3.add(lblScholarshipAmount, gbc_lblScholarshipAmount);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.gridwidth = 2;
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 2;
		gbc_textField_20.gridy = 22;
		panel_3.add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		JLabel lblDegreeType = new JLabel("Degree Type");
		GridBagConstraints gbc_lblDegreeType = new GridBagConstraints();
		gbc_lblDegreeType.insets = new Insets(0, 0, 0, 5);
		gbc_lblDegreeType.gridx = 1;
		gbc_lblDegreeType.gridy = 23;
		panel_3.add(lblDegreeType, gbc_lblDegreeType);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.gridwidth = 2;
		gbc_textField_21.insets = new Insets(0, 0, 0, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 2;
		gbc_textField_21.gridy = 23;
		panel_3.add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		
	}
	
}
