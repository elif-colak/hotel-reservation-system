
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.InputMismatchException;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		//I commented the code that we don't use in this assignment but we used in previous assignments.
		MyFrame myframe = new MyFrame();	
		myframe.setTitle("Hotel Reservation System");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(635,460);
		myframe.setResizable(false);
		myframe.setLocationRelativeTo(null);
		myframe.setVisible(true);
		
	/*
		boolean success_menu;
		do {
	
			success_menu = false;
			try {
				success_menu = false;
				
				//Menu Options
				for(MenuOptions menu : MenuOptions.values()) {
					System.out.printf("%s\n", menu.getMenuTitle());
				}
				
				Scanner input = new Scanner(System.in);
				int choice = input.nextInt();
				
			
				if(choice<13) {
				
						//create a reservation with type
						if(choice == MenuOptions.ONE.getNumber()) {
							System.out.println("ROOM INFOS: \n");	
							System.out.println("Room Type: Single, Daily Cost: 100, Room Size: 15, Has Bath: false ");
							System.out.println("Room Type: Double, Daily Cost: 180, Room Size: 30, Has Bath: false ");
							System.out.println("Room Type: Club, Daily Cost: 250, Room Size: 45, Has Bath: true ");
							System.out.println("Room Type: Family, Daily Cost: 400, Room Size: 50, Has Bath: false ");
							System.out.println("Room Type: Family With View, Daily Cost: 450, Room Size: 50, Has Bath: true ");
							System.out.println("Room Type: Suite, Daily Cost: 650, Room Size: 80, Has Bath: true \n");
							
							System.out.println("Hotel Name:");			
							Scanner info = new Scanner(System.in);
							String answer_one = info.nextLine();
							
							boolean success_type = false;
							do {
								
								System.out.println("Room Type: ");				
								try {
									String answer_two = info.nextLine();
									if(answer_two.equals("Single")| answer_two.equals("Double") | answer_two.equals("Club") | answer_two.equals("Family") | answer_two.equals("Family with View") |answer_two.equals("Suite")  ) {
										
										System.out.println("Reservation Month: ");	
									    String answer_three = info.nextLine();
									    
									    boolean success = false;
										System.out.println("Reservation Start: ");	
										while(!success) {
											try {
												int answer_four = info.nextInt();
												boolean success_two = false;
												System.out.println("Reservation End: ");	
												while(!success) {
													try {
														int answer_five = info.nextInt();
														//Single
														if(answer_two.equals("Single")) {
															Single room = new Single();
															Reservation reservation = new Reservation(answer_one, answer_three,answer_four,answer_five, 100, room);
															System.out.println("\n");
															
															if((answer_four <=30) & (answer_five <=30) & (answer_four> 0) & (answer_five > 0)& (answer_five > answer_four))	{
																Reservation.totalNumOfReservations++;
																reservation.setCustomerID(Reservation.totalNumOfReservations);
																services_list.add(reservation);
																calculable_list.add(reservation);
																
																System.out.printf("Reservation ID: %d is created!\n", reservation.getCustomerID());
															}
															else {
																System.out.println("There is a problem with the dates. Try agian!");
															}
														}		
														
														//Double
														else if(answer_two.equals("Double")) {
															Double room = new Double();
															Reservation reservation = new Reservation(answer_one, answer_three,answer_four,answer_five, 180, room);
															System.out.println("\n");
															
															if((answer_four <=30) & (answer_five <=30) & (answer_four> 0) & (answer_five > 0)& (answer_five > answer_four))	{
																Reservation.totalNumOfReservations++;
																reservation.setCustomerID(Reservation.totalNumOfReservations);
																services_list.add(reservation);
																calculable_list.add(reservation);
																
																System.out.printf("Reservation ID: %d is created!\n", reservation.getCustomerID());
															}
															else {
																System.out.println("There is a problem with the dates. Try agian!");
															}
														}	
														
														//Club
														else if(answer_two.equals("Club")) {
															Club room = new Club();
															Reservation reservation = new Reservation(answer_one, answer_three,answer_four,answer_five, 250, room);
															System.out.println("\n");
															
															if((answer_four <=30) & (answer_five <=30) & (answer_four> 0) & (answer_five > 0)& (answer_five > answer_four))	{
																Reservation.totalNumOfReservations++;
																reservation.setCustomerID(Reservation.totalNumOfReservations);
																services_list.add(reservation);
																calculable_list.add(reservation);
																
																System.out.printf("Reservation ID: %d is created!\n", reservation.getCustomerID());
															}
															else {
																System.out.println("There is a problem with the dates. Try agian!");
															}
														}
														
														//Family
														else if(answer_two.equals("Family")) {
															Family room = new Family();
															Reservation reservation = new Reservation(answer_one, answer_three,answer_four,answer_five, 400, room);
															System.out.println("\n");
															
															if((answer_four <=30) & (answer_five <=30) & (answer_four> 0) & (answer_five > 0)& (answer_five > answer_four))	{
																Reservation.totalNumOfReservations++;
																reservation.setCustomerID(Reservation.totalNumOfReservations);
																services_list.add(reservation);
																calculable_list.add(reservation);
																
																System.out.printf("Reservation ID: %d is created!\n", reservation.getCustomerID());
															}
															else {
																System.out.println("There is a problem with the dates. Try agian!");
															}
														}	
														
														//Family with view
														else if(answer_two.equals("Family with View") ) {
															FamilywithView room = new FamilywithView();
															Reservation reservation = new Reservation(answer_one, answer_three,answer_four,answer_five, 450, room);
															System.out.println("\n");
															
															if((answer_four <=30) & (answer_five <=30) & (answer_four> 0) & (answer_five > 0)& (answer_five > answer_four))	{
																Reservation.totalNumOfReservations++;
																reservation.setCustomerID(Reservation.totalNumOfReservations);
																services_list.add(reservation);
																calculable_list.add(reservation);
																
																System.out.printf("Reservation ID: %d is created!\n", reservation.getCustomerID());
															}
															else {
																System.out.println("There is a problem with the dates. Try agian!");
															}
														}
														
														//Suite
														else if(answer_two.equals("Suite")) {
															Suite room = new Suite();
															Reservation reservation = new Reservation(answer_one, answer_three,answer_four,answer_five, 650, room);
															System.out.println("\n");
															
															if((answer_four <=30) & (answer_five <=30) & (answer_four> 0) & (answer_five > 0)& (answer_five > answer_four))	{
																Reservation.totalNumOfReservations++;
																reservation.setCustomerID(Reservation.totalNumOfReservations);
																services_list.add(reservation);
																calculable_list.add(reservation);
																
																System.out.printf("Reservation ID: %d is created!\n", reservation.getCustomerID());
															}
															else {
																System.out.println("There is a problem with the dates. Try agian!");
															}
														}
														
														else {
															System.out.println("There is no such Room Type option. Try agian!");
														}
																		
														success = true;
														
														
														success_two = true;
													}
													catch(InputMismatchException inputMismatchException){
														System.err.println("Reservation End must be a numeric value!\n ");
														System.out.println("Reservation End: ");
														info.next();
													}
												}
												
																		
												
											}
											catch(InputMismatchException inputMismatchException){
												System.err.println("Reservation Start must be a numeric value!\n");
												System.out.println("Reservation Start: ");
												info.next();
											}
										}									
										
									}
									else {
										throw new RoomTypeException();
									}
									success_type = true;
								}
								
								catch(RoomTypeException  roomTypeException) {
									System.err.println("Room Type is not valid!");
								}
								
							}while(!success_type);				    
							
																		
							
						}
						
						
						//Display all reservation information
						else if(choice == MenuOptions.TWO.getNumber() ) {
							if(Reservation.totalNumOfReservations!=0) {
								for(int i = 0 ;i<  services_list.size(); i++) {
									if(services_list.get(i).getServiceType().equals("Reservation")) {
										Services s =  services_list.get(i) ;
										Reservation r = (Reservation)s;
										r.displayInfo();
									}
								}
							}
							//Room #1 has 2 people with a price total of $100.
							else {
								System.out.println("No reservation for display.");
							}
						
					}			
						
						//List the reservations for a specific city
						else if(choice == MenuOptions.THREE.getNumber()) {
							System.out.println("Type a city name for a reservation search: ");
							Scanner ip = new Scanner(System.in);
							String  cityname = ip.nextLine();
							
							Iterator<Services> iter = services_list.iterator();
							
							while(iter.hasNext()) {
								Services services = iter.next();
								if(services.getServiceType().equals("Reservation" )) {
									Services s =  services;
									Reservation r = (Reservation)s;
									if(r.get_name().contains(cityname)) {
										System.out.println(r.get_name());
									}
								}
							}
							
						}
						
						
						//Add extra services to a reservation
						else if(choice == MenuOptions.FOUR.getNumber()) {
							System.out.println("Please select one of the extra services from below:");
							System.out.println("1. Laundry Service");
							System.out.println("2. Spa Service");
							
							Boolean init = false;
							
							Scanner extra = new Scanner(System.in);
							int  extra_choice=  extra.nextInt();
							
							
							System.out.println("Type the reservation ID to credit this service: ");
							int  id =  extra.nextInt();
							
							for(int i = 0 ;i<  services_list.size(); i++) {
								if(services_list.get(i).getServiceType().equals("Reservation")) {
									if(services_list.get(i).getCustomerID() == id) {
										init = true;
									}					
								}
							}
							
						    if(init) {
								if(extra_choice ==  1) {
									boolean success = false;
									System.out.println("How many pieces of clothing? ");
									do {
										
										try {
											int numofclothes = extra.nextInt();
											Laundry newLaundry = new Laundry(numofclothes);
											services_list.add(newLaundry);
											calculable_list.add(newLaundry);
											newLaundry.setCustomerID(id);
											success = true;
										}
										catch(InputMismatchException inputMismatchException){
											System.err.println("Clothing count must be a numeric value!\n");
											System.out.println("How many pieces of clothing? ");
											extra.next();
										}
						
									}while(!success);
														
									
								}
								
								else if(extra_choice == 2 ) {		
									boolean success_two = false;
									System.out.println("How many days? ");
									do {
										try {
											int numofdays = extra.nextInt();
											Spa newSpa = new Spa(numofdays);
											services_list.add(newSpa);
											calculable_list.add(newSpa);
											newSpa.setCustomerID(id);
											success_two = true;
										}
										catch(InputMismatchException inputMismatchException) {
										System.err.println("Day count must be a numeric value!\n");
										System.out.println("How many days? ");
										extra.next();
									}
									}while(!success_two);
									
								}
								
								else {
									System.out.println("No such extra choice! ");
								}
							
						}
							else {
								System.out.println("No such id in the reservations! ");
							}
						}
						
						
						
						//Calculate total cost for each service
						else if(choice == MenuOptions.FIVE.getNumber()) {
							for(int i = 0 ;i<  services_list.size(); i++) {
								if(services_list.get(i).getServiceType().equals("Reservation")) {
									Services s = services_list.get(i);
									Reservation r = (Reservation)s;		
									if(r.get_month().equals("July")| r.get_month().equals("july")  | r.get_month().equals("June") | r.get_month().equals("june") | r.get_month().equals("August")|r.get_month().equals("august")) {
										double cost = services_list.get(i).calculateService()*(2.0);
										System.out.printf("The cost for the Room booking service of reservation ID %d: %.2f\n", services_list.get(i).getCustomerID(), cost);				
									}
									else {
										System.out.printf("The cost for the Room booking service of reservation ID %d: %.2f\n", services_list.get(i).getCustomerID(), services_list.get(i).calculateService());				
									}
										
								}
								else if(services_list.get(i).getServiceType().equals("Spa")) {
									System.out.printf("The cost for the Spa service of reservation ID %d: %.2f\n", services_list.get(i).getCustomerID(),services_list.get(i).calculateService() );	
								}
								else if(services_list.get(i).getServiceType().equals("Laundry")) {
									System.out.printf("The cost for the Laundry service of reservation ID %d: %.2f\n", services_list.get(i).getCustomerID(),services_list.get(i).calculateService() );
								}
							}
						}
						
						
						//Display the total cost of every customer
						else if(choice == MenuOptions.SIX.getNumber()) {
							for(int i=0; i< services_list.size(); i++) {
								if(services_list.get(i).getServiceType().equals("Reservation")) {
									double sum = 0;
									Services s = services_list.get(i);
									Reservation r = (Reservation)s;		
									if(r.get_month().equals("July")| r.get_month().equals("july")  | r.get_month().equals("June") | r.get_month().equals("june") | r.get_month().equals("August")|r.get_month().equals("august")) {
										double cost = services_list.get(i).calculateService()*(2.0);
											sum+= cost;		
									}
									else {
										sum+=services_list.get(i).calculateService();
									}
									
									for(int x=0; x< services_list.size(); x++) {
										if((services_list.get(x).getServiceType().equals("Spa" ))&( services_list.get(x).getCustomerID() == services_list.get(i).getCustomerID() )) {
											sum += services_list.get(x).calculateService();
										}
									}
									for(int m=0; m< services_list.size(); m++) {
										if((services_list.get(m).getServiceType().equals("Laundry" ))&( services_list.get(m).getCustomerID() == services_list.get(i).getCustomerID() )) {
											sum += services_list.get(m).calculateService();
										}
									}
									
									System.out.printf("The total cost of all services of the reservation with ID %d: %.2f\n", services_list.get(i).getCustomerID(),sum);
								}
							}
						}
						
						//Add an Employee
						else if(choice == MenuOptions.SEVEN.getNumber()) {
							Scanner in = new Scanner(System.in);
							System.out.println("Name: ");			
							String name = in.nextLine();
							
							System.out.println("Surname: ");
							String surname = in.nextLine();
							
							System.out.println("ID: ");
							int id = in.nextInt();
							
							
							boolean success = false;
							System.out.println("Monthly Payment: ");
							while(!success) {
								try {
									double payment = in.nextDouble();
									Employees new_employee = new Employees(name,surname,payment, id);
									calculable_list.add(new_employee);
									success = true;
								}
								catch(InputMismatchException inputMismatchException) {
									System.err.println("Monthly Payment must be a numeric value!\n");
									System.out.println("Monthly Payment: ");
									in.next();
									
								}
							}
							
							
							
						}
						
						//Add a Bill
						else if(choice == MenuOptions.EIGHT.getNumber()) {
							Scanner inp = new Scanner(System.in);
							System.out.println("Type: ");			
							String type = inp.nextLine();
							
							boolean success = false;
							Scanner in = new Scanner(System.in);
							System.out.println("Amount: ");
							
							while(!success) {
								try {
									double amount = in.nextDouble();
									Scanner i = new Scanner(System.in);
									System.out.println("Month: ");
									String month = i.nextLine();
									success = true;

									Bills new_bill = new Bills(type, amount, month);
									calculable_list.add(new_bill);
								}
								catch(InputMismatchException inputMismatchException) {
									System.err.println("Bill Amount must be a numeric value!\n");
									System.out.println("Amount: ");	
									in.next();
								}
							}
							
						
							
						}
						
						//Get Monthly Balance
						
						else if(choice == MenuOptions.NINE.getNumber()) {
							Scanner in = new Scanner(System.in);
							System.out.println("Enter Month: ");			
							String month = in.nextLine();
							double sum_income = 0.0;
							double sum_bills = 0.0;
							double sum_employees = 0.0;
							double sum_expenditures = 0.0;
							double balance = 0.0;
						
							for(int i = 0; i< calculable_list.size(); i++) {
								//reservation
								
								
								if(calculable_list.get(i) instanceof Reservation) {
									Calculable c = calculable_list.get(i);
									Reservation r = (Reservation)c;			
									
									if(r.get_month().equals(month)) {
										
										if(r.get_month().equals("July")| r.get_month().equals("july")  | r.get_month().equals("June") | r.get_month().equals("june") | r.get_month().equals("August")|r.get_month().equals("august")) {
											double cost = r.getCost() * (2.0);
											System.out.printf("For reservation ID: %d, Service type: Room booking, Service Cost: %.2f\n ",r.getCustomerID(), cost);		
											sum_income += cost;
										}
										else {
											System.out.printf("For reservation ID: %d, Service type: Room booking, Service Cost: %.2f\n ",r.getCustomerID(), r.getCost());
											sum_income += r.getCost();
										}
										
										
										//laundry
										for(int m = 0; m< calculable_list.size(); m++) {
											if(calculable_list.get(m) instanceof Laundry) {
												Calculable s = calculable_list.get(m);
												Laundry l = (Laundry)s;	
												if(l.getCustomerID()== r.getCustomerID()) {
													System.out.printf("For reservation ID: %d, Service type: Laundry, Service Cost: %.2f\n", r.getCustomerID(), l.getCost());
													sum_income += l.getCost();
												}
											}
										}
										
										//spa
										for(int t = 0; t< calculable_list.size(); t++) {
											if(calculable_list.get(t) instanceof Spa) {
												Calculable p = calculable_list.get(t);
												Spa s = (Spa)p;
												if(s.getCustomerID()== r.getCustomerID()) {
													System.out.printf("For reservation ID: %d, Service type: Spa, Service Cost: %.2f\n", r.getCustomerID(), s.getCost());
													sum_income += s.getCost();
												}
											}
										}
										
									}			
									
																				
							}
																		
											
								
								//bills
								else if(calculable_list.get(i) instanceof Bills) {
									Calculable c = calculable_list.get(i);
									Bills b = (Bills)c;
									if(b.getMonth().equals(month)) {
										sum_expenditures += b.getCost();
										sum_bills += b.getCost();
									}
								}
								
								//employees
								else if(calculable_list.get(i) instanceof Employees) {
									Calculable c = calculable_list.get(i);
									Employees e = (Employees)c;
									sum_expenditures += e.getCost();
									sum_employees += e.getCost();
									}
														
								
							}
							
							System.out.printf("Total monthly income: %.2f\n",sum_income);
							System.out.printf("Total monthly bills due: %.2f\n", sum_bills);
							System.out.printf("Total monthly employee cost: %.2f\n", sum_employees);
							balance = (sum_income - sum_expenditures);
							System.out.printf("End of month balance: %.2f\n", balance);
							
													
						
						}
						
						//List all Services sorted based on cost
						else if(choice == MenuOptions.TEN.getNumber()) {
							ArrayList<Services> temp = new ArrayList<Services>();
							for(int i = 0; i< calculable_list.size(); i++) {
								if(calculable_list.get(i) instanceof Reservation) {
									Calculable c = calculable_list.get(i);
									Reservation r = (Reservation)c;
									temp.add(r);
								}
								
								else if(calculable_list.get(i) instanceof Spa) {
									Calculable c = calculable_list.get(i);
									Spa s = (Spa)c;
									temp.add(s);
								}
								
								else if(calculable_list.get(i) instanceof Laundry) {
									Calculable c = calculable_list.get(i);
									Laundry l = (Laundry)c;
									temp.add(l);
								}
							}
							Collections.sort(temp, new CostComparator());
							for(int i=0; i<temp.size();i++) {
								temp.get(i).displayServiceInfo();
							}
						}
						
						//List all Reservations sorted based on hotel names
						else if(choice == MenuOptions.ELEVEN.getNumber()) {
							ArrayList<Reservation> temp = new ArrayList<Reservation>();
							for(int i = 0; i< calculable_list.size(); i++) {
								if(calculable_list.get(i) instanceof Reservation) {
									temp.add((Reservation) calculable_list.get(i));
								}
							}
							Collections.sort(temp);
							for(int i=0; i<temp.size();i++) {
								System.out.printf("Hotel Name: %s, ", temp.get(i).get_name());
								temp.get(i).displayServiceInfo();
							}
						}
					
						else if(choice == MenuOptions.TWELVE.getNumber()) {
							System.out.println("Exiting, Goodbye!");
							success_menu = true;
						}
										
			
				
				}
				else {
					throw new Exception();
					
				
			}
				
			}
			catch(Exception exception) {
				System.err.println("You entered an invalid menu option. Enter again.\n");
			}
			
		}while(!success_menu); */
		
			
		
}
}