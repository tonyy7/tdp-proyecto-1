package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDateTime;

import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEmail;
	private JTextField textFieldGithub;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private int dia;
	private int mes;
	private int año;
	private int	hora;
	private int minutos;
 	private int segundos;
 	LocalDateTime ahora;
	

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 286));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 594, 220);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		lblNewLabel = new JLabel("LU");
		lblNewLabel.setBounds(10, 11, 61, 34);
		tabInformation.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(10, 47, 61, 34);
		tabInformation.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 79, 61, 34);
		tabInformation.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(10, 109, 61, 34);
		tabInformation.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_4.setBounds(10, 141, 71, 31);
		tabInformation.add(lblNewLabel_4);
		
		textFieldLU = new JTextField(""+studentData.getId());
		textFieldLU.setBounds(81, 18, 214, 20);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		
		textFieldApellido = new JTextField(studentData.getLastName());
		textFieldApellido.setBounds(81, 54, 214, 20);
		tabInformation.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldNombre = new JTextField(studentData.getFirstName());
		textFieldNombre.setBounds(81, 86, 214, 20);
		tabInformation.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEmail = new JTextField(studentData.getMail());
		textFieldEmail.setBounds(81, 116, 214, 20);
		tabInformation.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldGithub = new JTextField(studentData.getGithubURL());
		textFieldGithub.setBounds(81, 146, 214, 20);
		tabInformation.add(textFieldGithub);
		textFieldGithub.setColumns(10);
		
		lblNewLabel_5 = new JLabel(new ImageIcon("C:/Users/anto7/Escritorio/GitTDP/proyecto-1/src/images/foto3.jpg"));
		lblNewLabel_5.setBounds(313, 11, 247, 161);
		tabInformation.add(lblNewLabel_5);
		contentPane.add(tabbedPane);
		
		ahora=LocalDateTime.now();
		dia=ahora.getDayOfMonth();
		mes=ahora.getMonthValue();
		año=ahora.getYear();
		hora=ahora.getHour();
		minutos=ahora.getMinute();
		segundos=ahora.getSecond();
		lblNewLabel_6 = new JLabel("Esta ventana fue generada el "+dia+"/"+mes+"/"+año+" a las: "+hora+":"+minutos+":"+segundos);
		lblNewLabel_6.setBounds(10, 232, 333, 14);
		contentPane.add(lblNewLabel_6);
	}
}
