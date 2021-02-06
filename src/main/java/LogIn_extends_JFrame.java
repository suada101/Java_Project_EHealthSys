/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoraK
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LogIn_extends_JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	
      //DataBase  
     //  Connection query = conn.StartConnection();
   
	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn_extends_JFrame frame = new LogIn_extends_JFrame();
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
	public LogIn_extends_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Barlow", Font.PLAIN, 14));
		lblUsername.setBounds(172, 82, 88, 13);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Barlow", Font.PLAIN, 14));
		lblPassword.setBounds(172, 123, 88, 13);
		contentPane.add(lblPassword);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(247, 81, 140, 19);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(247, 122, 140, 19);
		contentPane.add(passwordTextField);
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setFont(new Font("Barlow SemiBold", Font.PLAIN, 15));
		btnLogin.addActionListener((ActionEvent e) -> {
                    String un = usernameTextField.getText();
                    String pw = passwordTextField.getText();
                    
                    if(pw.isEmpty() && un.isEmpty() == false){
                        JOptionPane.showMessageDialog(null, "Please Type in a Password!", "Attention", JOptionPane.CANCEL_OPTION);
                    }
                    else if(un.isEmpty() && pw.isEmpty() == false){
                        JOptionPane.showMessageDialog(null, "Please type in a Username!", "Attention", JOptionPane.CANCEL_OPTION);
                    }
                    else if(un.isEmpty() && pw.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Please type in a Username and a Password!", "Attention", JOptionPane.CANCEL_OPTION);
                    }
                    else {
                        
                        
                        
                        
                        
                        try {
                            Statement stmt = null;
                           // stmt = /null/query.createStatement();
                            String sql = "SELECT username, password FROM login where username = '"+ un+"' and binary password = '"+ pw +"'";
                            ResultSet rs = stmt.executeQuery(sql);
                            if(rs.next()){
                                JOptionPane.showMessageDialog(null,"Hello, welcome back.","Welcome!", JOptionPane.DEFAULT_OPTION);
                                // If username and password are correct, then next procedure will be forwarding to next Frame for example Menu
                            }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Your credentials are incorrect!\nPlease try again.","Error!", JOptionPane.DEFAULT_OPTION);
                        }
                        
                        
                    }
                });
		btnLogin.setBounds(247, 156, 94, 27);
		contentPane.add(btnLogin);
		
		JCheckBox chckbxShowpPassword = new JCheckBox("Show Password");
		chckbxShowpPassword.setFont(new Font("Barlow", Font.PLAIN, 11));
		chckbxShowpPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowpPassword.isSelected()) {
					passwordTextField.setEchoChar((char)0);
				}
				else {
					passwordTextField.setEchoChar('*');
				}
			}
		});
		chckbxShowpPassword.setBounds(396, 119, 140, 21);
		contentPane.add(chckbxShowpPassword);
		
		JLabel lblApplicationName = new JLabel("Application Name");
		lblApplicationName.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationName.setFont(new Font("Barlow SemiBold", Font.PLAIN, 15));
		lblApplicationName.setBounds(10, 29, 586, 13);
		contentPane.add(lblApplicationName);
		
		
	}

    private void setContentPane(JPanel contentPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBounds(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class query {

        public query() {
        }
    }
}
