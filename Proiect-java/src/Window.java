import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Window {

	private JFrame frame;
	private JTextField txtap;
	private JTable table;
	private JTextField txtnume;
	private JTextField txtnrloc;
	private JTextField txtapac;
	private JTextField txtapar;
	private JTextField txtenerg;
	private JTextField txtgaze;
	private JTextField txtsalarii;
	private JTextField txtcuratenie;
	private JTextField txtreparatii;
	private JTextField txttotal;
	private JTextField txtrest;
	private JTextField txtnuper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
		Connect();
		//table_load();
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	
	public void Connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/administatie","root","");
		}
		catch (ClassNotFoundException ex)
		{
			
		}
	    catch (SQLException ex)
		{
	    	
		}
	}
	
	public void table_load()
	{
		try
		{
			pst = con.prepareStatement("select * from locatar");
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1264, 777);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administratie");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(494, 20, 255, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Date", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 80, 416, 442);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Apa calda");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(24, 150, 84, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apa rece");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(24, 178, 84, 34);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Energie");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(24, 210, 84, 34);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gaze");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(24, 243, 84, 34);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Salarii");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(24, 275, 84, 34);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Curatenie");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4_1.setBounds(24, 305, 84, 34);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Reparatii");
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4_1_1.setBounds(24, 336, 84, 34);
		panel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Total");
		lblNewLabel_1_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4_1_2.setBounds(24, 364, 84, 34);
		panel.add(lblNewLabel_1_4_1_2);
		
		JLabel lblNewLabel_1_4_1_3 = new JLabel("Restante");
		lblNewLabel_1_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4_1_3.setBounds(24, 393, 84, 34);
		panel.add(lblNewLabel_1_4_1_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Ap");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(24, 51, 84, 34);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Nume");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_6.setBounds(24, 82, 84, 34);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Nr locuitori");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_7.setBounds(24, 117, 96, 34);
		panel.add(lblNewLabel_1_7);
		
		txtap = new JTextField();
		txtap.setBounds(144, 61, 160, 25);
		panel.add(txtap);
		txtap.setColumns(10);
		
		txtnume = new JTextField();
		txtnume.setColumns(10);
		txtnume.setBounds(144, 92, 160, 25);
		panel.add(txtnume);
		
		txtnrloc = new JTextField();
		txtnrloc.setColumns(10);
		txtnrloc.setBounds(144, 127, 160, 25);
		panel.add(txtnrloc);
		
		txtapac = new JTextField();
		txtapac.setColumns(10);
		txtapac.setBounds(144, 160, 160, 25);
		panel.add(txtapac);
		
		txtapar = new JTextField();
		txtapar.setColumns(10);
		txtapar.setBounds(144, 188, 160, 25);
		panel.add(txtapar);
		
		txtenerg = new JTextField();
		txtenerg.setColumns(10);
		txtenerg.setBounds(144, 220, 160, 25);
		panel.add(txtenerg);
		
		txtgaze = new JTextField();
		txtgaze.setColumns(10);
		txtgaze.setBounds(144, 253, 160, 25);
		panel.add(txtgaze);
		
		txtsalarii = new JTextField();
		txtsalarii.setColumns(10);
		txtsalarii.setBounds(144, 285, 160, 25);
		panel.add(txtsalarii);
		
		txtcuratenie = new JTextField();
		txtcuratenie.setColumns(10);
		txtcuratenie.setBounds(144, 315, 160, 25);
		panel.add(txtcuratenie);
		
		txtreparatii = new JTextField();
		txtreparatii.setColumns(10);
		txtreparatii.setBounds(144, 346, 160, 25);
		panel.add(txtreparatii);
		
		txttotal = new JTextField();
		txttotal.setColumns(10);
		txttotal.setBounds(144, 374, 160, 25);
		panel.add(txttotal);
		
		txtrest = new JTextField();
		txtrest.setColumns(10);
		txtrest.setBounds(144, 402, 160, 25);
		panel.add(txtrest);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ap, nume, nr_loc, apa_c, apa_r, energ, gaze, sal, curatenie, rep, total, rest;
				
				ap=txtap.getText();
				nume=txtnume.getText();
				nr_loc=txtnrloc.getText();
				apa_c=txtapac.getText();
				apa_r=txtapar.getText();
				energ=txtenerg.getText();
				gaze=txtgaze.getText();
				sal=txtsalarii.getText();
				curatenie=txtcuratenie.getText();
				rep=txtreparatii.getText();
				total=txttotal.getText();
				rest=txtrest.getText();
				
				try {
					//pst= con.prepareStatement("introduceti datele(ap, nume, nr_loc, apa_c, apa_r, energ, gaze, sal, curatenie, rep, total, rest;)valorile(?,?,?,?,?,?,?,?,?,?,?,?)");
				    pst = con.prepareStatement("insert into locatar(Ap, Nume, Nr Locuitori, Apa calda, Apa rece, Energie, Gaze, Salarii, Curatenie, Reparatii, Total, Restante)values(?,?,?,?,?,?,?,?,?,?,?,?)");
					pst.setString(1, ap);
					pst.setString(2, nume);
					pst.setString(3, nr_loc);
					pst.setString(4, apa_c);
					pst.setString(5, apa_r);
					pst.setString(6, energ);
					pst.setString(7, gaze);
					pst.setString(8, sal);
					pst.setString(9, curatenie);
					pst.setString(10, rep);
					pst.setString(11, total);
					pst.setString(12, rest);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Date inregistrate!");
					table_load();
					txtap.setText("");
					txtnume.setText("");
					txtnrloc.setText("");
					txtapac.setText("");
					txtapar.setText("");
					txtenerg.setText("");
					txtgaze.setText("");
					txtsalarii.setText("");
					txtcuratenie.setText("");
					txtreparatii.setText("");
					txttotal.setText("");
					txtrest.setText("");
					txtap.requestFocus();
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
					
				}
				
				
				
				
				
				
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(21, 532, 132, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtap.setText("");
				txtnume.setText("");
				txtnrloc.setText("");
				txtapac.setText("");
				txtapar.setText("");
				txtenerg.setText("");
				txtgaze.setText("");
				txtsalarii.setText("");
				txtcuratenie.setText("");
				txtreparatii.setText("");
				txttotal.setText("");
				txtrest.setText("");
				
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(163, 532, 132, 44);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(305, 532, 132, 44);
		frame.getContentPane().add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(460, 85, 780, 585);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(21, 586, 416, 79);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Nume persoana");
		lblNewLabel_1_5_1.setBounds(23, 36, 142, 20);
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1_5_1);
		
		txtnuper = new JTextField();
		txtnuper.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try
				{
					String id = txtnuper.getText();
					
					pst = con.prepareStatement("selecteaza datele unde id este: ?");
					pst.setString(1,id);
					ResultSet rs = pst.executeQuery();
					
					if(rs.next()==true)
					{
						String	ap = rs.getString(1);
						String nume = rs.getString(2);
						String nr_loc = rs.getString(3);
						String apa_c = rs.getString(4);
						String apa_r = rs.getString(5);
						String energ = rs.getString(6);
						String gaze = rs.getString(7);
					    String sal = rs.getString(8);
						String curatenie = rs.getString(9);
						String rep = rs.getString(10);
						String total = rs.getString(11);
						String rest = rs.getString(12);
						
						txtap.setText(ap);
						txtnume.setText(nume);
						txtnrloc.setText(nr_loc);
						txtapac.setText(apa_c);
						txtapar.setText(apa_r);
						txtenerg.setText(energ);
						txtgaze.setText(gaze);
						txtsalarii.setText(sal);
						txtcuratenie.setText(curatenie);
						txtreparatii.setText(rep);
						txttotal.setText(total);
						txtrest.setText(rest);
					}
					else
					{
						txtap.setText("");
						txtnume.setText("");
						txtnrloc.setText("");
						txtapac.setText("");
						txtapar.setText("");
						txtenerg.setText("");
						txtgaze.setText("");
						txtsalarii.setText("");
						txtcuratenie.setText("");
						txtreparatii.setText("");
						txttotal.setText("");
						txtrest.setText("");
					}
					
				}
				catch (SQLException ex)
				{

					
				}
			}
		});
		txtnuper.setBounds(175, 39, 172, 19);
		txtnuper.setColumns(10);
		panel_1.add(txtnuper);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
String ap, nume, nr_loc, apa_c, apa_r, energ, gaze, sal, curatenie, rep, total, rest, nuper;
				
				ap=txtap.getText();
				nume=txtnume.getText();
				nr_loc=txtnrloc.getText();
				apa_c=txtapac.getText();
				apa_r=txtapar.getText();
				energ=txtenerg.getText();
				gaze=txtgaze.getText();
				sal=txtsalarii.getText();
				curatenie=txtcuratenie.getText();
				rep=txtreparatii.getText();
				total=txttotal.getText();
				rest=txtrest.getText();
				nuper=txtnuper.getText();
				
				try {
					//pst= con.prepareStatement("introduceti datele(ap, nume, nr_loc, apa_c, apa_r, energ, gaze, sal, curatenie, rep, total, rest;)valorile(?,?,?,?,?,?,?,?,?,?,?,?)");
				    pst = con.prepareStatement("update locatar set Ap=?, Nume=?, Nr Locuitori=?, Apa calda=?, Apa rece=?, Energie=?, Gaze=?, Salarii=?, Curatenie=?, Reparatii=?, Total=?, Restante=?) where id=?");
					pst.setString(1, ap);
					pst.setString(2, nume);
					pst.setString(3, nr_loc);
					pst.setString(4, apa_c);
					pst.setString(5, apa_r);
					pst.setString(6, energ);
					pst.setString(7, gaze);
					pst.setString(8, sal);
					pst.setString(9, curatenie);
					pst.setString(10, rep);
					pst.setString(11, total);
					pst.setString(12, rest);
					pst.setString(13, nuper);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Date reactualizate!");
					table_load();
					txtap.setText("");
					txtnume.setText("");
					txtnrloc.setText("");
					txtapac.setText("");
					txtapar.setText("");
					txtenerg.setText("");
					txtgaze.setText("");
					txtsalarii.setText("");
					txtcuratenie.setText("");
					txtreparatii.setText("");
					txttotal.setText("");
					txtrest.setText("");
					txtap.requestFocus();
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
					
				}
				
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(529, 680, 132, 44);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
                 String  nuper;
				
				nuper=txtnuper.getText();
				
				try {
					//pst= con.prepareStatement("introduceti datele(ap, nume, nr_loc, apa_c, apa_r, energ, gaze, sal, curatenie, rep, total, rest;)valorile(?,?,?,?,?,?,?,?,?,?,?,?)");
				    pst = con.prepareStatement("delete from locatar where id=?");
				    
					pst.setString(1, nuper);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Date sterse!");
					table_load();
					txtap.setText("");
					txtnume.setText("");
					txtnrloc.setText("");
					txtapac.setText("");
					txtapar.setText("");
					txtenerg.setText("");
					txtgaze.setText("");
					txtsalarii.setText("");
					txtcuratenie.setText("");
					txtreparatii.setText("");
					txttotal.setText("");
					txtrest.setText("");
					txtap.requestFocus();
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
					
				}
				
				
				
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(731, 680, 132, 44);
		frame.getContentPane().add(btnDelete);
	}
}
