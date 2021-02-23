// REAL java projekt
package deleteChangeFunction;

//import AppointmentCount;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class windowCancel {
	
	DefaultListModel<String> appointmentsTmp =new DefaultListModel<>();
	private JFrame frame;
	JList list = new JList();

	/**
	 * Launch the application.
	 */
	public static void cancelMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowCancel window = new windowCancel();
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
	public windowCancel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DefaultListModel<appointments> LISTE = new DefaultListModel<>();
		appointments m = new appointments("User","1234","Cancel Appointment");
       /*       
		appointmentsTmp.addElement("Appointment 1");
		appointmentsTmp.addElement("Appointment 2");
		appointmentsTmp.addElement("Appointment 3");
		appointmentsTmp.addElement("Appointment 4");
		appointmentsTmp.addElement("Appointment 5"); */
		
        int i;
       int anzahl = CountofAppointments.cntofapp.getappcnt();
            
        for(i=0;i!=anzahl;i++){
                   //Healthproblem als addElement     
                  appointmentsTmp.addElement("Appointment "+ (i+1)); 
                  
                }  
       

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(62, 188, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				
				windowR m = new windowR();
				m.frame.setVisible(true);
				frame.setVisible(false);
				
			}
			
		});
		
		
		list.setBounds(62, 52, 329, 109);
		list.setModel(appointmentsTmp);
		
		frame.getContentPane().add(list);
		
		JButton btnNewButton_1 = new JButton("Delete selected Item");
		btnNewButton_1.setBounds(236, 188, 156, 21);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//delete-function
				appointmentsTmp.remove(list.getSelectedIndex());
				CountofAppointments.cntofapp.modifiedappcnt = CountofAppointments.cntofapp.appcnt - 1; //Gesamt count wird minus 1 genommen

			}
		});
		
		
		
	}
	
	
}
