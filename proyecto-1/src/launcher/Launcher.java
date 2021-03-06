package launcher;

import javax.swing.JFrame;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante=new Student(127000,"Sevenants","Antonio","anto.7up@gmail.com","https://github.com/tonyy7","C:/Users/anto7/Escritorio/GitTDP/proyecto-1/src/images/foto perfil");
            	JFrame gui= new SimplePresentationScreen(estudiante);
            	gui.setVisible(true);
            }
        });
    }
}