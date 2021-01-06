import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MakeupData extends JFrame {
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField_TypeMakeup;
	private JTable table;
	
	 ArrayList <Makeup> m;
	    String header[] = new String[]{"Type Of Make", "Brand", "How To Use", "Where To Buy"};
	    DefaultTableModel dtm;
	    int row, col;
	    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeupData frame = new MakeupData();
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
	public MakeupData() {
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 7));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 446, 588);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Makeup Data Information");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(20, 64, 409, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_Type = new JLabel("Type Of Makeup");
		lblNewLabel_Type.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Type.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Type.setBounds(20, 177, 138, 42);
		panel.add(lblNewLabel_Type);
		
		JLabel lblNewLabel_Brand = new JLabel("Brand");
		lblNewLabel_Brand.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Brand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Brand.setBounds(36, 230, 122, 42);
		panel.add(lblNewLabel_Brand);
		
		JLabel lblNewLabel_Use = new JLabel("How To Use");
		lblNewLabel_Use.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Use.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Use.setBounds(20, 283, 138, 42);
		panel.add(lblNewLabel_Use);
		
		JLabel lblNewLabel_Buy = new JLabel("Where To Buy");
		lblNewLabel_Buy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Buy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Buy.setBounds(52, 336, 106, 42);
		panel.add(lblNewLabel_Buy);
		
		textField_TypeMakeup = new JTextField();
		textField_TypeMakeup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_TypeMakeup.setBounds(168, 186, 251, 28);
		panel.add(textField_TypeMakeup);
		textField_TypeMakeup.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Midvalley Megamall", "Aeon Shah Alam"}));
		comboBox_3.setBounds(168, 344, 251, 30);
		panel.add(comboBox_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Fenty Beauty", "Maybelline", "MAC", "Revlon"}));
		comboBox_1.setBounds(168, 238, 251, 30);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"- Plese Select - ", "Apply thinly on your lip.", "Apply it on your eye lid with your favourite colour.", "Apply it on your eyelash, curl it upward.", "Apply thinly use blusher brush."}));
		comboBox_2.setBounds(168, 295, 251, 30);
		panel.add(comboBox_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 7));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(10, 610, 1350, 87);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textField_TypeMakeup.getText(),
						comboBox_1.getSelectedItem(),
						comboBox_2.getSelectedItem(),
						comboBox_3.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Car Booking Confirmed", "Makeup Data Information",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(97, 20, 221, 49);
		panel_1.add(btnNewButton);
		
		JButton btnEdit = new JButton("RESET");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_TypeMakeup.setText("");
				comboBox_1.setSelectedItem("- Please Select - ");
				comboBox_2.setSelectedItem("- Please Select - ");
				comboBox_3.setSelectedItem("- Please Select - ");
				
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEdit.setBounds(376, 20, 174, 49);
		panel_1.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No Data to delete", "Makeup Data Information",
								JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select which data to delete", "Makeup Data Information",
								JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(836, 20, 167, 49);
		panel_1.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ?", "Makeup Data Information",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1069, 20, 160, 49);
		panel_1.add(btnExit);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
		            File file = new File ("/Users/user/Desktop/DataBase.txt");
		            if(!file.exists())
		            {
		                file.createNewFile();
		            }
		            
		            FileWriter fw = new FileWriter(file.getAbsoluteFile());
		            BufferedWriter bw = new BufferedWriter(fw);
		            bw.write("- Makeup Data Information -\n");
		            bw.write("Type Of Makeup\t\t\tBrand\t\tHow To Use\t\tWhere To Buy\n");
		            
		            for(int i = 0; i < table.getRowCount(); i++)
		            {
		                for(int j = 0; j < table.getColumnCount(); j++)
		                {
		                    bw.write(table.getModel().getValueAt(i, j) + "\t\t");
		                }
		                bw.write("\n");
		            }
		            bw.close();
		            fw.close();
		            JOptionPane.showConfirmDialog(frame, "Save To File", "Makeup Data Information",
		            		JOptionPane.OK_OPTION);
		        }
		        catch(Exception ex)
		        {
		            ex.printStackTrace();
		        }
			}
		});
		
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(611, 20, 167, 49);
		panel_1.add(btnSave);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.DARK_GRAY, 7));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(466, 11, 894, 588);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 45, 806, 505);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type Of Makeup", "Brand", "How To Use", "Where To Buy"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(185);
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(206);
		scrollPane.setViewportView(table);
	}
}
