import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyFrame extends JFrame implements ActionListener {
		//Services  type arraylist to keep reservations objects
		ArrayList<Services> services_list = new ArrayList<Services>();
		//Calculable type arraylist to keep track of Services, Empolyees, and Bills class
		ArrayList<Calculable> calculable_list = new ArrayList<Calculable>();
	
		private JMenuBar menubar;
		private JMenu file;
		private JMenu new_op;
		private JMenu help;
		private JButton button1;
		private JButton button2;
		private JButton button3;
		private JButton button4;
		private JButton button5;
		private JButton button6;
		private JTextArea textarea;
		private JPanel buttonpanel;
		private JMenuItem reservation;
		private JMenuItem services;
		private JMenuItem exit;
		private JMenuItem contents;
		private JMenuItem about;
		private ExecutorService executorService;
		
		public MyFrame() {
			setLayout(null);
			menubar = new JMenuBar();
			setJMenuBar(menubar);
			file = new JMenu("File");
			new_op = new JMenu("New");
			help = new JMenu("Help");
			
			menubar.add(file);
			menubar.add(new_op);
			menubar.add(help);
			
			
			reservation = new JMenuItem("Reservation");
			reservation.addActionListener(this);
			services = new JMenuItem("Services");
			services.addActionListener(this);
			exit = new JMenuItem("Exit");
			exit.addActionListener(this);
			contents = new JMenuItem("Contents");
			contents.addActionListener(this);
			about = new JMenuItem("About");
			about.addActionListener(this);
			
			new_op.add(reservation);
			new_op.add(services);
			file.add(exit);
			help.add(contents);
			help.add(about);
			
			button1 = new JButton("Display Reservations");
			button1.setFocusable(false);
			button1.setBackground(Color.WHITE);
			button1.setBounds(100,10,200,20);
			button1.addActionListener(this);
			button2 = new JButton("Display Extra Services");
			button2.setFocusable(false);
			button2.setBackground(Color.WHITE);
			button2.setBounds(310,10,200,20);
			button2.addActionListener(this);
			button3 = new JButton("Disp. Res. For City");
			button3.setFocusable(false);
			button3.setBackground(Color.WHITE);
			button3.setBounds(100,35,200,20);			
			button3.addActionListener(this);
			button4 = new JButton("Multithread Search");
			button4.setFocusable(false);
			button4.setBackground(Color.WHITE);
			button4.setBounds(310,35,200,20);			
			button4.addActionListener(this);
			button5 = new JButton("Save Reservations");
			button5.setFocusable(false);
			button5.setBackground(Color.WHITE);
			button5.setBounds(60,365,200,20);			
			button5.addActionListener(this);
			button6 = new JButton("Load Reservations");
			button6.setFocusable(false);
			button6.setBackground(Color.WHITE);
			button6.setBounds(350,365,200,20);			
			button6.addActionListener(this);
			
			add(button1);
			add(button2);
			add(button3);
			add(button4);
			add(button5);
			add(button6);
			
			textarea = new JTextArea();
			textarea.setBackground(Color.WHITE);
			textarea.setEditable(false);
			textarea.setBounds(10,65, 600,285);  
			add(textarea);

			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == exit) {
				System.exit(0);
			}
			
			else if(e.getSource() == contents) {
				JOptionPane.showMessageDialog(null, "You can add a new reservation and a service and display them.");
			}
			
			else if(e.getSource() == about) {
				JOptionPane.showMessageDialog(null, "Hi! I am Elif Çolak. I am the developer.");
			}
			
			else if(e.getSource() == reservation) {
				String city= JOptionPane.showInputDialog(null,"Enter City:"); 
				String name= JOptionPane.showInputDialog(null,"Hotel Name:"); 
				String month= JOptionPane.showInputDialog(null,"Reservation Month:"); 
				String start = JOptionPane.showInputDialog(null,"Reservation Start");  //integerrr
				int int_start = Integer.parseInt(start);
				String end = JOptionPane.showInputDialog(null,"Reservation End"); //integerr
				int int_end = Integer.parseInt(end);
				
				Reservation reservation = new Reservation(name, month, int_start, int_end,city);
				
				Reservation.totalNumOfReservations++;
				reservation.setCustomerID(Reservation.totalNumOfReservations);
				services_list.add(reservation);
				calculable_list.add(reservation);
				
			}
			
			else if(e.getSource() == button1) {
				textarea.setText(null);
				if(Reservation.totalNumOfReservations!=0) {
					for(int i = 0 ;i<  services_list.size(); i++) {
						if(services_list.get(i).getServiceType().equals("Reservation")) {
							Services s =  services_list.get(i) ;
							Reservation r = (Reservation)s;
							String string_id  =Integer.toString(r.getCustomerID());
							String string_start = Integer.toString(r.get_start());
							String string_end = Integer.toString(r.get_end());
							textarea.append("Reservation ID: #" + string_id + "\n");
							textarea.append("Reservation at " + r.get_name() +" starts on " + r.get_month()+ " " + string_start + " and ends on "+ r.get_month() + " " + string_end + " ." + "\n");
						}
					}
				}
				else {
					System.out.println("No reservation for display.");
				}
			}
			
			else if(e.getSource() == services) {
				String laundryorspa = JOptionPane.showInputDialog(null,"Please selet one of the extra services from below: \n1.Laundry Service\n2.Spa Service"); 
				String id = JOptionPane.showInputDialog(null,"Type the reservation ID to credit this service:");
				int int_id = Integer.parseInt(id);  
				
				Boolean init = false;
				for(int i = 0 ;i<  services_list.size(); i++) {
					if(services_list.get(i).getServiceType().equals("Reservation")) {
						if(services_list.get(i).getCustomerID() == int_id) {
							init = true;
						}					
					}
				}
				
				if(init) {
					if(laundryorspa.equals("1")) {
						String piece = JOptionPane.showInputDialog(null,"How many pieces of clothing? :");
						Laundry newLaundry = new Laundry(Integer.parseInt(piece));
						services_list.add(newLaundry);
						calculable_list.add(newLaundry);
						newLaundry.setCustomerID(int_id);
					}
					else if(laundryorspa.equals("2")) {
						String days = JOptionPane.showInputDialog(null,"How many days?:");
						Spa newSpa = new Spa(Integer.parseInt(days));
						services_list.add(newSpa);
						calculable_list.add(newSpa);
						newSpa.setCustomerID(int_id);
					}
				}
				
				
			}
			
			else if(e.getSource() == button2) {
				textarea.setText(null);
				for(int i = 0 ;i<  services_list.size(); i++) {
					if(services_list.get(i).getServiceType().equals("Spa")) {
						String string_id  =Integer.toString(services_list.get(i).getCustomerID());
						Services s =  services_list.get(i);
						Spa sp = (Spa)s;
						String string_days  =Integer.toString(sp.getDays());
						textarea.append("Reservation ID: #" + string_id + " has " + string_days + " days of Spa Services. \n");
					}
					else if(services_list.get(i).getServiceType().equals("Laundry")) {
						String string_id  =Integer.toString(services_list.get(i).getCustomerID());
						Services s =  services_list.get(i);
						Laundry l = (Laundry)s;
						String string_days  =Integer.toString(l.getClothingPieces());
						textarea.append("Reservation ID: #" + string_id + " has " + string_days + " pieces assigned for Laundry Service.\n");
					}
				}
			}
			
			else if(e.getSource() == button3) {
				textarea.setText(null);
				String city = JOptionPane.showInputDialog(null,"Type a city name:"); 
				
				textarea.append("Reservations for ");
				textarea.append(city + ":");
				
				Iterator<Services> iter = services_list.iterator();
				
				while(iter.hasNext()) {
					
					Services services = iter.next();
					if(services.getServiceType().equals("Reservation" )) {
						Services s =  services;
						Reservation r = (Reservation)s;
						if(r.get_city().equals(city)) {
							String string_id  =Integer.toString(r.getCustomerID());
							String string_start = Integer.toString(r.get_start());
							String string_end = Integer.toString(r.get_end());
							textarea.append("\n");
							textarea.append("Reservation ID: #");
							textarea.append(string_id);
							textarea.append("\n");
							textarea.append("Reservation at " + r.get_name() +" starts on " + r.get_month()+ " " + string_start + " and ends on "+ r.get_month() + " " + string_end + " .");
							
						}
					}
				}
				
			}
			
			else if(e.getSource() == button4) {
				int count = 0;
				for(int i = 0 ;i<  services_list.size(); i++) {
					if(services_list.get(i).getServiceType().equals("Reservation")) {
						count++;		
					}
				}
				if(count >= 8) {
					String hotelName = JOptionPane.showInputDialog(null,"Enter Hotel name:");
					multithreadSearch(hotelName);
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Please enter at least 8 reservations - now it is " + count);
				}
			}
			
			//Save reservationd
			else if(e.getSource() == button5) {
				for(int i = 0 ;i<  services_list.size(); i++) {
					if(services_list.get(i).getServiceType().equals("Reservation")) {
						
						 try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("reservations.csv", true))) {
							 Reservation reservation = (Reservation) services_list.get(i);
				        	 bufferWriter.append(reservation.get_city() + "," + reservation.get_name() + "," + reservation.get_month() + "," + reservation.get_start() + "," + reservation.get_end());
				        	 bufferWriter.newLine();
				        	 JOptionPane.showMessageDialog(null,"Saved","Info" , JOptionPane.INFORMATION_MESSAGE);
					            
					      } catch (IOException e1) {
					            System.out.println("error while opening.");
					            e1.printStackTrace();
					      }
					}
					
				}
				
			}
			
			//Load reservations
			else if(e.getSource() == button6) {
			    try (BufferedReader bufferReader = new BufferedReader(new FileReader("reservations.csv"))) {
		            String line;
		            boolean isFirstLine = true; 
		            while ((line = bufferReader.readLine()) != null) {
		            	if (isFirstLine) {
		                    isFirstLine = false;
		                    continue; // Skip the first line
		                }
		            	else {
		            		String[] fields = line.split(",");
			            	String city= fields[0];
							String name= fields[1]; 
							String month= fields[2];
							String start = fields[3];
							int int_start = Integer.parseInt(start);
							String end = fields[4];
							int int_end = Integer.parseInt(end);
							
							Reservation reservation = new Reservation(name, month, int_start, int_end,city);
							
							Reservation.totalNumOfReservations++;
							reservation.setCustomerID(Reservation.totalNumOfReservations);
							services_list.add(reservation);
							calculable_list.add(reservation);
		            	}
		            	
		            }
		            
		        } catch (IOException ex) {
		        	System.out.println("Error while reading.");
		            ex.printStackTrace();
		        }
			    
			    //Displaying loaded reservations on the text field
			    for(int i = 0 ;i<  services_list.size(); i++) {
					if(services_list.get(i).getServiceType().equals("Reservation")) {
						  Reservation reservation = (Reservation) services_list.get(i);
						String string_id  = Integer.toString(reservation .getCustomerID());
						String string_start = Integer.toString(reservation.get_start());
						String string_end = Integer.toString(reservation.get_end());
						textarea.append("Reservation ID: #" + string_id + " at "+ reservation.get_name() +" starts on " + reservation.get_month()+ " " + string_start + " and ends on "+ reservation.get_month() + " " + string_end + " ." + "\n");
					}
			    }
			}
				
		}
		
		private void multithreadSearch(String hotelName) {
			textarea.setText(null);
			textarea.append("Reservation ID's for " + hotelName + ":\n");
	        int threadNum = 3; //The threads that I want to use

	        int rPerThread = services_list.size() / threadNum;  // Dividing threads per thread
	        executorService = Executors.newFixedThreadPool(threadNum);

	        //Calculating starting and ending index per thread
	        for (int i = 0; i < threadNum; i++) {
	            int start = i * rPerThread;
	            int end ;
	            if(i == threadNum - 1) { 
	            	end = services_list.size();
	            	}
	            else{
	            	end = start + rPerThread;
	            	}
	            ArrayList<Services> listForAThread = new ArrayList<>(services_list.subList(start, end));
	           
	            executorService.execute( new Runnable() {
					@Override
					public void run() {
						 for (Services service : listForAThread) {
				                if (service.getServiceType().equals("Reservation")) {
				                    Reservation reservation = (Reservation) service;
				                    if (reservation.get_name().equals(hotelName)) {
				                        textarea.append(" " + reservation.getCustomerID());
				                    }
				                }
				            }
						
					}});
	         
	        }
	        executorService.shutdown();
	    }
}
