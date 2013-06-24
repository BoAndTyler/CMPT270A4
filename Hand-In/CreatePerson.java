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
import javax.swing.SwingConstants;

/**
 * The Create Menu GUI that allows users to create a new person.
 * @author Bo Dong and Tyler Spink
 * GUI created with WindowBuilder Editor
 */
public class CreatePerson extends JFrame {
	Controler theControler;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel contentPane;
	private JTextField textField_firstName;
	private JTextField textField_middleInitial;
	private JTextField textField_lastName;
	private JTextField textField_street;
	private JTextField textField_city;
	private JTextField textField_prov;
	private JTextField textField_postalCode;
	private JTextField textField_homePhone;
	private JTextField textField_workPhone;
	private JTextField textField_email;
	private JTextField textField_yearRegistered;
	private JTextField textField_degreeProgram;
	private JTextField textField_currentYear;
	private JTextField textField_marks;
	private JTextField textField_totalCredits;
	private JTextField textField_supervisor;
	private JTextField textField_thesisTitle;
	private JTextField textField_thesisArea;
	private JTextField textField_scholarship;
	private JTextField textField_degreeType;

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
		setTitle("Create Menu");
		theControler = Ctrl;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 510, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Please enter the following data:");
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnCreate = new JButton("Save");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println(buttonGroup.getSelection().getActionCommand());
				addPerson();
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
				textField_firstName.setEditable(true);
				textField_middleInitial.setEditable(true);
				textField_lastName.setEditable(true);
				textField_street.setEditable(true);
				//textField_4.setEditable(true);
				textField_city.setEditable(true);
				textField_prov.setEditable(true);
				textField_postalCode.setEditable(true);
				textField_homePhone.setEditable(true);
				textField_workPhone.setEditable(true);
				textField_email.setEditable(true);
				textField_yearRegistered.setEditable(false);
				textField_degreeProgram.setEditable(false);
				textField_currentYear.setEditable(false);
				textField_marks.setEditable(false);
				textField_totalCredits.setEditable(false);
				textField_supervisor.setEditable(false);
				//textField_17.setEditable(false);
				textField_thesisTitle.setEditable(false);
				textField_thesisArea.setEditable(false);
				textField_scholarship.setEditable(false);
				textField_degreeType.setEditable(false);
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
		
		textField_firstName = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_3.add(textField_firstName, gbc_textField);
		textField_firstName.setColumns(10);
		
		JRadioButton rdbtnUndergradstudent = new JRadioButton("Undergradate Student");
		rdbtnUndergradstudent.setActionCommand("Undergradate Student");
		rdbtnUndergradstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_firstName.setEditable(true);
				textField_middleInitial.setEditable(true);
				textField_lastName.setEditable(true);
				textField_street.setEditable(true);
				//textField_4.setEditable(true);
				textField_city.setEditable(true);
				textField_prov.setEditable(true);
				textField_postalCode.setEditable(true);
				textField_homePhone.setEditable(true);
				textField_workPhone.setEditable(true);
				textField_email.setEditable(true);
				textField_yearRegistered.setEditable(true);
				textField_degreeProgram.setEditable(true);
				textField_currentYear.setEditable(true);
				textField_marks.setEditable(true);
				textField_totalCredits.setEditable(true);
				textField_supervisor.setEditable(false);
				//textField_17.setEditable(false);
				textField_thesisTitle.setEditable(false);
				textField_thesisArea.setEditable(false);
				textField_scholarship.setEditable(false);
				textField_degreeType.setEditable(false);
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
		
		textField_middleInitial = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel_3.add(textField_middleInitial, gbc_textField_1);
		textField_middleInitial.setColumns(10);
		
		JRadioButton rdbtnGraduateStudent = new JRadioButton("Graduate Student");
		rdbtnGraduateStudent.setActionCommand("Graduate Student");
		rdbtnGraduateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_firstName.setEditable(true);
				textField_middleInitial.setEditable(true);
				textField_lastName.setEditable(true);
				textField_street.setEditable(true);
				//textField_4.setEditable(true);
				textField_city.setEditable(true);
				textField_prov.setEditable(true);
				textField_postalCode.setEditable(true);
				textField_homePhone.setEditable(true);
				textField_workPhone.setEditable(true);
				textField_email.setEditable(true);
				textField_yearRegistered.setEditable(true);
				textField_degreeProgram.setEditable(true);
				textField_currentYear.setEditable(true);
				textField_marks.setEditable(true);
				textField_totalCredits.setEditable(true);
				textField_supervisor.setEditable(true);
				//textField_17.setEditable(true);
				textField_thesisTitle.setEditable(true);
				textField_thesisArea.setEditable(true);
				textField_scholarship.setEditable(true);
				textField_degreeType.setEditable(true);
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
		
		textField_lastName = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel_3.add(textField_lastName, gbc_textField_2);
		textField_lastName.setColumns(10);
		
		JLabel lblStreetAddress = new JLabel("Street Address");
		GridBagConstraints gbc_lblStreetAddress = new GridBagConstraints();
		gbc_lblStreetAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreetAddress.gridx = 1;
		gbc_lblStreetAddress.gridy = 4;
		panel_3.add(lblStreetAddress, gbc_lblStreetAddress);
		
		textField_street = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panel_3.add(textField_street, gbc_textField_3);
		textField_street.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblCity.gridx = 1;
		gbc_lblCity.gridy = 6;
		panel_3.add(lblCity, gbc_lblCity);
		
		textField_city = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		panel_3.add(textField_city, gbc_textField_5);
		textField_city.setColumns(10);
		
		JLabel lblProvince = new JLabel("Province");
		GridBagConstraints gbc_lblProvince = new GridBagConstraints();
		gbc_lblProvince.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvince.gridx = 1;
		gbc_lblProvince.gridy = 7;
		panel_3.add(lblProvince, gbc_lblProvince);
		
		textField_prov = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.gridwidth = 2;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 7;
		panel_3.add(textField_prov, gbc_textField_6);
		textField_prov.setColumns(10);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		GridBagConstraints gbc_lblPostalCode = new GridBagConstraints();
		gbc_lblPostalCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblPostalCode.gridx = 1;
		gbc_lblPostalCode.gridy = 8;
		panel_3.add(lblPostalCode, gbc_lblPostalCode);
		
		textField_postalCode = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.gridwidth = 2;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 8;
		panel_3.add(textField_postalCode, gbc_textField_7);
		textField_postalCode.setColumns(10);
		
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
		
		textField_homePhone = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 3;
		gbc_textField_8.gridy = 10;
		panel_3.add(textField_homePhone, gbc_textField_8);
		textField_homePhone.setColumns(10);
		
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
		
		textField_workPhone = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 11;
		panel_3.add(textField_workPhone, gbc_textField_9);
		textField_workPhone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 12;
		panel_3.add(lblEmail, gbc_lblEmail);
		
		textField_email = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.gridwidth = 2;
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 2;
		gbc_textField_10.gridy = 12;
		panel_3.add(textField_email, gbc_textField_10);
		textField_email.setColumns(10);
		
		JLabel lblRegisteredYear = new JLabel("Registered Year");
		GridBagConstraints gbc_lblRegisteredYear = new GridBagConstraints();
		gbc_lblRegisteredYear.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegisteredYear.gridx = 1;
		gbc_lblRegisteredYear.gridy = 13;
		panel_3.add(lblRegisteredYear, gbc_lblRegisteredYear);
		
		textField_yearRegistered = new JTextField();
		textField_yearRegistered.setEditable(false);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.gridwidth = 2;
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 2;
		gbc_textField_11.gridy = 13;
		panel_3.add(textField_yearRegistered, gbc_textField_11);
		textField_yearRegistered.setColumns(10);
		
		JLabel lblDegreeProgram = new JLabel("Degree Program");
		GridBagConstraints gbc_lblDegreeProgram = new GridBagConstraints();
		gbc_lblDegreeProgram.insets = new Insets(0, 0, 5, 5);
		gbc_lblDegreeProgram.gridx = 1;
		gbc_lblDegreeProgram.gridy = 14;
		panel_3.add(lblDegreeProgram, gbc_lblDegreeProgram);
		
		textField_degreeProgram = new JTextField();
		textField_degreeProgram.setEditable(false);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.gridwidth = 2;
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 2;
		gbc_textField_12.gridy = 14;
		panel_3.add(textField_degreeProgram, gbc_textField_12);
		textField_degreeProgram.setColumns(10);
		
		JLabel lblYearInProgram = new JLabel("Year in Program");
		GridBagConstraints gbc_lblYearInProgram = new GridBagConstraints();
		gbc_lblYearInProgram.insets = new Insets(0, 0, 5, 5);
		gbc_lblYearInProgram.gridx = 1;
		gbc_lblYearInProgram.gridy = 15;
		panel_3.add(lblYearInProgram, gbc_lblYearInProgram);
		
		textField_currentYear = new JTextField();
		textField_currentYear.setEditable(false);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.gridwidth = 2;
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 2;
		gbc_textField_13.gridy = 15;
		panel_3.add(textField_currentYear, gbc_textField_13);
		textField_currentYear.setColumns(10);
		
		JLabel lblGpa = new JLabel("GPA");
		GridBagConstraints gbc_lblGpa = new GridBagConstraints();
		gbc_lblGpa.insets = new Insets(0, 0, 5, 5);
		gbc_lblGpa.gridx = 1;
		gbc_lblGpa.gridy = 16;
		panel_3.add(lblGpa, gbc_lblGpa);
		
		textField_marks = new JTextField();
		textField_marks.setEditable(false);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.gridwidth = 2;
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 2;
		gbc_textField_14.gridy = 16;
		panel_3.add(textField_marks, gbc_textField_14);
		textField_marks.setColumns(10);
		
		JLabel lblTotalCredits = new JLabel("Total Credits");
		GridBagConstraints gbc_lblTotalCredits = new GridBagConstraints();
		gbc_lblTotalCredits.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalCredits.gridx = 1;
		gbc_lblTotalCredits.gridy = 17;
		panel_3.add(lblTotalCredits, gbc_lblTotalCredits);
		
		textField_totalCredits = new JTextField();
		textField_totalCredits.setEditable(false);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.gridwidth = 2;
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 2;
		gbc_textField_15.gridy = 17;
		panel_3.add(textField_totalCredits, gbc_textField_15);
		textField_totalCredits.setColumns(10);
		
		JLabel lblThesisSupervisor = new JLabel("Thesis Supervisor");
		GridBagConstraints gbc_lblThesisSupervisor = new GridBagConstraints();
		gbc_lblThesisSupervisor.anchor = GridBagConstraints.EAST;
		gbc_lblThesisSupervisor.insets = new Insets(0, 0, 5, 5);
		gbc_lblThesisSupervisor.gridx = 1;
		gbc_lblThesisSupervisor.gridy = 18;
		panel_3.add(lblThesisSupervisor, gbc_lblThesisSupervisor);
		
		textField_supervisor = new JTextField();
		textField_supervisor.setEditable(false);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.gridwidth = 2;
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 2;
		gbc_textField_16.gridy = 18;
		panel_3.add(textField_supervisor, gbc_textField_16);
		textField_supervisor.setColumns(10);
		
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
		
		textField_thesisTitle = new JTextField();
		textField_thesisTitle.setEditable(false);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.gridwidth = 2;
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 2;
		gbc_textField_18.gridy = 20;
		panel_3.add(textField_thesisTitle, gbc_textField_18);
		textField_thesisTitle.setColumns(10);
		
		JLabel lblArea = new JLabel("Area");
		GridBagConstraints gbc_lblArea = new GridBagConstraints();
		gbc_lblArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblArea.anchor = GridBagConstraints.EAST;
		gbc_lblArea.gridx = 1;
		gbc_lblArea.gridy = 21;
		panel_3.add(lblArea, gbc_lblArea);
		
		textField_thesisArea = new JTextField();
		textField_thesisArea.setEditable(false);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.gridwidth = 2;
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 2;
		gbc_textField_19.gridy = 21;
		panel_3.add(textField_thesisArea, gbc_textField_19);
		textField_thesisArea.setColumns(10);
		
		JLabel lblScholarshipAmount = new JLabel("ScholarShip Amount");
		GridBagConstraints gbc_lblScholarshipAmount = new GridBagConstraints();
		gbc_lblScholarshipAmount.insets = new Insets(0, 0, 5, 5);
		gbc_lblScholarshipAmount.gridx = 1;
		gbc_lblScholarshipAmount.gridy = 22;
		panel_3.add(lblScholarshipAmount, gbc_lblScholarshipAmount);
		
		textField_scholarship = new JTextField();
		textField_scholarship.setEditable(false);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.gridwidth = 2;
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 2;
		gbc_textField_20.gridy = 22;
		panel_3.add(textField_scholarship, gbc_textField_20);
		textField_scholarship.setColumns(10);
		
		JLabel lblDegreeType = new JLabel("Degree Type");
		GridBagConstraints gbc_lblDegreeType = new GridBagConstraints();
		gbc_lblDegreeType.insets = new Insets(0, 0, 0, 5);
		gbc_lblDegreeType.gridx = 1;
		gbc_lblDegreeType.gridy = 23;
		panel_3.add(lblDegreeType, gbc_lblDegreeType);
		
		textField_degreeType = new JTextField();
		textField_degreeType.setEditable(false);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.gridwidth = 2;
		gbc_textField_21.insets = new Insets(0, 0, 0, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 2;
		gbc_textField_21.gridy = 23;
		panel_3.add(textField_degreeType, gbc_textField_21);
		textField_degreeType.setColumns(10);
		

	}
	
	/**
	 * Checks if a new person can be created and which fields to retrieve before adding them.
	 */
	public void addPerson() {
		// Attempting to create a new Person
		if(buttonGroup.getSelection().getActionCommand().equals("Person"))
		{
			//System.out.println("First Name: " + textField.getText().equals(""));
			// Check to see if minimum fields are entered to allow a save
			if(!textField_firstName.getText().equals("") && !textField_middleInitial.getText().equals("") && !textField_lastName.getText().equals(""))
			{
				// Retrieves all of the texts fields entered by the user
				String firstName = textField_firstName.getText();
				String middleInitial = textField_middleInitial.getText();
				String lastName = textField_lastName.getText();
				String streetAddress = textField_street.getText();
				String city = textField_city.getText();
				String prov = textField_prov.getText();
				String postalCode = textField_postalCode.getText();
				String homePhone = textField_homePhone.getText();
				String workPhone = textField_workPhone.getText();
				String emailAddress = textField_email.getText();
				
				theControler.addPerson(firstName, middleInitial, lastName, streetAddress, city, 
								prov, postalCode, homePhone, workPhone, emailAddress);
				dispose();
			}
		}
		// Attempting to create a new Undergraduate Student
		else if(buttonGroup.getSelection().getActionCommand().equals("Undergradate Student"))
		{
			// Check to see if minimum fields are entered to allow a save
			if(!textField_firstName.getText().equals("") && !textField_middleInitial.getText().equals("") && !textField_lastName.getText().equals(""))
			{
				// Retrieves all of the texts fields entered by the user
				String firstName = textField_firstName.getText();
				String middleInitial = textField_middleInitial.getText();
				String lastName = textField_lastName.getText();
				String streetAddress = textField_street.getText();
				String city = textField_city.getText();
				String prov = textField_prov.getText();
				String postalCode = textField_postalCode.getText();
				String homePhone = textField_homePhone.getText();
				String workPhone = textField_workPhone.getText();
				String emailAddress = textField_email.getText();
				
				String yearRegistered = textField_yearRegistered.getText();
				String degreeProgram = textField_degreeProgram.getText();
				String currentYear = textField_currentYear.getText();
				String marks = textField_marks.getText();
				String totalCredits = textField_totalCredits.getText();
				
				theControler.addUndergrad(firstName, middleInitial, lastName, streetAddress, city, 
									prov, postalCode, homePhone, workPhone, emailAddress, 
									yearRegistered, degreeProgram, currentYear, marks, totalCredits);
				dispose();
			}
		}
		// Attempting to create a new Graduate Student
		else if(buttonGroup.getSelection().getActionCommand().equals("Graduate Student"))
		{
			// Check to see if minimum fields are entered to allow a save
			if(!textField_firstName.getText().equals("") && !textField_middleInitial.getText().equals("") && !textField_lastName.getText().equals(""))
			{
				// Retrieves all of the texts fields entered by the user
				String firstName = textField_firstName.getText();
				String middleInitial = textField_middleInitial.getText();
				String lastName = textField_lastName.getText();
				String streetAddress = textField_street.getText();
				String city = textField_city.getText();
				String prov = textField_prov.getText();
				String postalCode = textField_postalCode.getText();
				String homePhone = textField_homePhone.getText();
				String workPhone = textField_workPhone.getText();
				String emailAddress = textField_email.getText();
				
				String yearRegistered = textField_yearRegistered.getText();
				String degreeProgram = textField_degreeProgram.getText();
				String currentYear = textField_currentYear.getText();
				String marks = textField_marks.getText();
				String totalCredits = textField_totalCredits.getText();
				
				String supervisor = textField_supervisor.getText();
				String thesisTitle = textField_thesisTitle.getText();
				String thesisArea = textField_thesisArea.getText();
				String scholarship = textField_scholarship.getText();
				String degreeType = textField_degreeType.getText();
				
				theControler.addGraduate(firstName, middleInitial, lastName, streetAddress, city, 
									prov, postalCode, homePhone, workPhone, emailAddress, 
									yearRegistered, degreeProgram, currentYear, marks, totalCredits, 
									supervisor, thesisTitle, thesisArea, scholarship, degreeType);
				dispose();
			}
		}
	}
}
