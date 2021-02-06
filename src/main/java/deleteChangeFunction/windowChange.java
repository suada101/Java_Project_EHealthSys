// real java projekt 

package deleteChangeFunction;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class windowChange {

	private JFrame frame;
	private JTable table;
	
	
	
//	String[] columnNames= {"Name","Description","Date"};
//	Object[][] data= {{"Frankfurt","Artz","28/03/2021"}};
	public ArrayList<appointments> appointmentsListe= new ArrayList<appointments>();

	/**
	 * Launch the application.
	 */
	public static void changeMain() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowChange window = new windowChange();
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
	public windowChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		appointmentsListe.add(new appointments("Nora","KA","12324"));
		appointmentsListe.add(new appointments("Pedro","KA","22"));
		appointmentsListe.add(new appointments("Sardar","KA","333"));
		appointmentsListe.add(new appointments("O","KA","444"));

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(71, 179, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				windowR window = new windowR();
				window.frame.setVisible(true);
				frame.getDefaultCloseOperation();

			}

		});

		JButton btnNewButton_1 = new JButton("Change date of selected Item");
		btnNewButton_1.setBounds(212, 179, 180, 21);
		frame.getContentPane().add(btnNewButton_1);
		// function abrufen, die ein Post Request zu dem DB macht. 
		// In der Funktion muss sich wieder alle Daten von dem DB holen.
		// 
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);

//		
//		table.setPreferredScrollableViewportSize(new Dimension(500,50));
//		table.setFillsViewportHeight(true);
		
//		JScrollPane scrollPane = new JScrollPane(table);
//		frame.add(scrollPane);
		
		DefaultTableModel model= (DefaultTableModel) table.getModel();
		table.setCellSelectionEnabled(true);
		model.addColumn("name");
		model.addColumn("Text");
		model.insertRow(model.getRowCount(), new Object[] {"nora","hola"});
		
//		Object rowData[] = new Object[4];
//		for(int i = 0; i< appointmentsListe.size(); i++) {
//			rowData[i]= appointmentsListe.get(i).getName();
//			rowData[i]= appointmentsListe.get(i).getDescription();
//			rowData[i]= appointmentsListe.get(i).getDate();
//			model.addRow(rowData);
//		}
		
		table.setBounds(62, 32, 320, 118);
		frame.getContentPane().add(table);
	}
}

