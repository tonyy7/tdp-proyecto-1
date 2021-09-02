package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
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
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JTextPane textPane_3;
	private JTextPane textPane_4;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 449, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(new GridLayout(5, 2, 0, 0));
		
		lblNewLabel_1 = new JLabel("  LU");
		tabInformation.add(lblNewLabel_1);
		
		textPane = new JTextPane();
		tabInformation.add(textPane);
		
		lblNewLabel_4 = new JLabel("  Apellido");
		tabInformation.add(lblNewLabel_4);
		
		textPane_2 = new JTextPane();
		tabInformation.add(textPane_2);
		
		lblNewLabel_3 = new JLabel("  Nombre");
		tabInformation.add(lblNewLabel_3);
		
		textPane_1 = new JTextPane();
		tabInformation.add(textPane_1);
		
		lblNewLabel = new JLabel("  Email");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		tabInformation.add(lblNewLabel);
		
		textPane_3 = new JTextPane();
		tabInformation.add(textPane_3);
		
		lblNewLabel_2 = new JLabel("  Github URL");
		tabInformation.add(lblNewLabel_2);
		
		textPane_4 = new JTextPane();
		tabInformation.add(textPane_4);
		contentPane.add(tabbedPane);
	}
}
