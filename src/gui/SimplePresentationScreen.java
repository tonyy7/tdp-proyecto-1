package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEmail;
	private JTextField textFieldGithub;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(700, 280));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 432, 203);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(427, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 57, 151);
		tabInformation.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 0));
		
		JLabel lblLU = new JLabel("LU:");
		panel.add(lblLU);
		
		JLabel lblApellido = new JLabel("Apellido:");
		panel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre:");
		panel.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail:");
		panel.add(lblEmail);
		
		JLabel lblGithub = new JLabel("Github URL:");
		panel.add(lblGithub);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(77, 11, 338, 151);
		tabInformation.add(panel_1);
		panel_1.setLayout(null);
		
		textFieldLU = new JTextField();
		textFieldLU.setBounds(0, 3, 328, 20);
		panel_1.add(textFieldLU);
		textFieldLU.setColumns(10);
		textFieldLU.setText(""+studentData.getId());
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(0, 34, 328, 20);
		panel_1.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		textFieldApellido.setText(studentData.getLastName());
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(0, 65, 328, 20);
		panel_1.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		textFieldNombre.setText(studentData.getFirstName());
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(0, 96, 328, 20);
		panel_1.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		textFieldEmail.setText(studentData.getMail());
		
		textFieldGithub = new JTextField();
		textFieldGithub.setBounds(0, 127, 328, 20);
		panel_1.add(textFieldGithub);
		textFieldGithub.setColumns(10);
		contentPane.add(tabbedPane);
		textFieldGithub.setText(studentData.getGithubURL());
		
		JLabel lblImagen = new JLabel("");
		//lblImagen.setIcon(new ImageIcon(studentData.getPathPhoto()));
		lblImagen.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource(studentData.getPathPhoto()))));
		lblImagen.setBounds(438, 11, 236, 219);
		contentPane.add(lblImagen);
		
		JLabel lblHoraEjecucion = new JLabel();
		lblHoraEjecucion.setBounds(15, 205, 422, 25);
		contentPane.add(lblHoraEjecucion);
		
		Calendar fecha= new GregorianCalendar();
		int año=fecha.get(Calendar.YEAR);
		int mes=fecha.get(Calendar.MONTH)+1;
		int dia=fecha.get(Calendar.DATE);
		String hora=""+fecha.get(Calendar.HOUR_OF_DAY);
		String minuto=""+fecha.get(Calendar.MINUTE);
		String segundos=""+fecha.get(Calendar.SECOND);
		lblHoraEjecucion.setText("Esta ventana fue generada el "+dia+"/"+mes+"/"+año+" a las "+hora+":"+minuto+":"+segundos);
	}
}
