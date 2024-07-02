package com.hana.apps;

import java.util.Scanner;

public class BookFlight {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to BookYourFly.com! \n");
		
		System.out.println("Please enter your Full name.");
		String nameOfPassenger = scn.nextLine();
		
		System.out.println("How many passengers are coming aboard?");
		int numOfPass = scn.nextInt();
		
		
		System.out.println("Here are the lists of flights: \n"+
						   "1. Delta Airlines	\n"+
						   "2. Lufthansa Airlines\n"+
						   "3. Turkish Airlines	  \n"+
						   "4. Indigo Airlines  \n"+
						   "5. KLM               \n"+
						   "6. Korean Air       \n" +
						   "7. Emerates Airlines \n");
		
		System.out.println("Choose the flight by its number.");
		int flightNumber = scn.nextInt();
	
		switch(flightNumber) {
		case 1:
			
			System.out.println("Now which city would you like to departure from?");
			String depart = new Scanner(System.in).nextLine();
			
			if(depart.equalsIgnoreCase("Dubai")) {
				String airportDubai = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai);
				
			}else if(depart.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh = "King Khalid International Airport";
				
			}else if(depart.equalsIgnoreCase("Beijing")) {
				String airportBeijing = "Beijing Daxing International Airport";
				
			}else if(depart.equalsIgnoreCase("Seoul")) {
				String airportSeoul = "Incheon International Airport";
				
			}else if(depart.equalsIgnoreCase("Delhi")) {
				String airportDelhi = "Indira Gandhi International Airport";
				
			}else if(depart.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem = "Ben Gurion Airport";
				
			}else if(depart.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids = "Gerald R Ford International Airport";
				
			}else if(depart.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul = "Saint Paul International Airport";
				
			}else if(depart.equalsIgnoreCase("Ottowa")) {
				String airportOttowa = "Ottowa International Airport";
				
			}else if(depart.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC = "Ronald Reagen International Airport";
				
			}else {
				System.out.println("Nope!");
			}
			break;
			
		case 2:
			
			System.out.println("Now which city would you like to departure from?");
			String depart1 = scn.nextLine();
			
			if(depart1.equalsIgnoreCase("Dubai")) {
				String airportDubai1 = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai1);
				
			}else if(depart1.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh1 = "King Khalid International Airport";
				
			}else if(depart1.equalsIgnoreCase("Beijing")) {
				String airportBeijing1 = "Beijing Daxing International Airport";
				
			}else if(depart1.equalsIgnoreCase("Seoul")) {
				String airportSeoul1 = "Incheon International Airport";
				
			}else if(depart1.equalsIgnoreCase("Delhi")) {
				String airportDelhi1 = "Indira Gandhi International Airport";
				
			}else if(depart1.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem1 = "Ben Gurion Airport";
				
			}else if(depart1.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids1 = "Gerald R Ford International Airport";
				
			}else if(depart1.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul1 = "Saint Paul International Airport";
				
			}else if(depart1.equalsIgnoreCase("Ottowa")) {
				String airportOttowa1 = "Ottowa International Airport";
				
			}else if(depart1.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC1 = "Ronald Reagen International Airport";
				
			}	
			break;
			
		case 3:
			System.out.println(" ");
			
			
			System.out.println("Now which city would you like to departure from?");
			String depart2 = scn.nextLine();
			
			if(depart2.equalsIgnoreCase("Dubai")) {
				String airportDubai2 = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai2);
				
			}else if(depart2.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh2 = "King Khalid International Airport";
				
			}else if(depart2.equalsIgnoreCase("Beijing")) {
				String airportBeijing2 = "Beijing Daxing International Airport";
				
			}else if(depart2.equalsIgnoreCase("Seoul")) {
				String airportSeoul2 = "Incheon International Airport";
				
			}else if(depart2.equalsIgnoreCase("Delhi")) {
				String airportDelhi2 = "Indira Gandhi International Airport";
				
			}else if(depart2.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem2 = "Ben Gurion Airport";
				
			}else if(depart2.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids2 = "Gerald R Ford International Airport";
				
			}else if(depart2.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul2 = "Saint Paul International Airport";
				
			}else if(depart2.equalsIgnoreCase("Ottowa")) {
				String airportOttowa2  = "Ottowa International Airport";
				
			}else if(depart2.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC1 = "Ronald Reagen International Airport";
				
			}	
			break;
		case 4:
			System.out.println(" ");
			
			
			
			System.out.println("Now which city would you like to departure from?");
			String depart3 = scn.nextLine();
			
			if(depart3.equalsIgnoreCase("Dubai")) {
				String airportDubai3 = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai3);
				
			}else if(depart3.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh3 = "King Khalid International Airport";
				
			}else if(depart3.equalsIgnoreCase("Beijing")) {
				String airportBeijing3 = "Beijing Daxing International Airport";
				
			}else if(depart3.equalsIgnoreCase("Seoul")) {
				String airportSeoul3 = "Incheon International Airport";
				
			}else if(depart3.equalsIgnoreCase("Delhi")) {
				String airportDelhi3 = "Indira Gandhi International Airport";
				
			}else if(depart3.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem3 = "Ben Gurion Airport";
				
			}else if(depart3.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids3 = "Gerald R Ford International Airport";
				
			}else if(depart3.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul3 = "Saint Paul International Airport";
				
			}else if(depart3.equalsIgnoreCase("Ottowa")) {
				String airportOttowa3 = "Ottowa International Airport";
				
			}else if(depart3.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC3 = "Ronald Reagen International Airport";
				
			}	
			break;
		case 5:
					
			
			System.out.println("Now which city would you like to departure from?");
			String depart4 = new Scanner(System.in).nextLine();
			
			if(depart4.equalsIgnoreCase("Dubai")) {
				String airportDubai1 = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai1);
				
			}else if(depart4.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh1 = "King Khalid International Airport";
				
			}else if(depart4.equalsIgnoreCase("Beijing")) {
				String airportBeijing1 = "Beijing Daxing International Airport";
				
			}else if(depart4.equalsIgnoreCase("Seoul")) {
				String airportSeoul1 = "Incheon International Airport";
				
			}else if(depart4.equalsIgnoreCase("Delhi")) {
				String airportDelhi1 = "Indira Gandhi International Airport";
		
			}else if(depart4.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem1 = "Ben Gurion Airport";
				
			}else if(depart4.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids1 = "Gerald R Ford International Airport";
				
			}else if(depart4.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul1 = "Saint Paul International Airport";
				
			}else if(depart4.equalsIgnoreCase("Ottowa")) {
				String airportOttowa1 = "Ottowa International Airport";
				
			}else if(depart4.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC1 = "Ronald Reagen International Airport";
				
			}	
			break;
		case 6:
			System.out.println(" ");
			
			
			System.out.println("Now which city would you like to departure from?");
			String depart5 = scn.nextLine();
			
			if(depart5.equalsIgnoreCase("Dubai")) {
				String airportDubai1 = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai1);
				
			}else if(depart5.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh1 = "King Khalid International Airport";
				
			}else if(depart5.equalsIgnoreCase("Beijing")) {
				String airportBeijing1 = "Beijing Daxing International Airport";
				
			}else if(depart5.equalsIgnoreCase("Seoul")) {
				String airportSeoul1 = "Incheon International Airport";
				
			}else if(depart5.equalsIgnoreCase("Delhi")) {
				String airportDelhi1 = "Indira Gandhi International Airport";
				
			}else if(depart5.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem1 = "Ben Gurion Airport";
				
			}else if(depart5.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids1 = "Gerald R Ford International Airport";
				
			}else if(depart5.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul1 = "Saint Paul International Airport";
				
			}else if(depart5.equalsIgnoreCase("Ottowa")) {
				String airportOttowa1 = "Ottowa International Airport";
				
			}else if(depart5.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC1 = "Ronald Reagen International Airport";
				
			}
			break;
		case 7:
			System.out.println(" ");
			
			
			System.out.println("Now which city would you like to go to?");
			String depart6 = scn.nextLine();
			
			if(depart6.equalsIgnoreCase("Dubai")) {
				String airportDubai1 = "Dubai International Airport";
				System.out.println("Name of airport: "+airportDubai1);
				
			}else if(depart6.equalsIgnoreCase("Riyadh")) {
				String airportRiyadh1 = "King Khalid International Airport";
				
			}else if(depart6.equalsIgnoreCase("Beijing")) {
				String airportBeijing1 = "Beijing Daxing International Airport";
				
			}else if(depart6.equalsIgnoreCase("Seoul")) {
				String airportSeoul1 = "Incheon International Airport";
				
			}else if(depart6.equalsIgnoreCase("Delhi")) {
				String airportDelhi1 = "Indira Gandhi International Airport";
				
			}else if(depart6.equalsIgnoreCase("Jerusalem")) {
				String airportJerusalem1 = "Ben Gurion Airport";
				
			}else if(depart6.equalsIgnoreCase("Grand Rapids")) {
				String airportGrandRapids1 = "Gerald R Ford International Airport";
				
			}else if(depart6.equalsIgnoreCase("Saint Paul")) {
				String airportSaintPaul1 = "Saint Paul International Airport";
				
			}else if(depart6.equalsIgnoreCase("Ottowa")) {
				String airportOttowa1 = "Ottowa International Airport";
				
			}else if(depart6.equalsIgnoreCase("Washington D.C")) {
				String airportWashingtonDC1 = "Ronald Reagen International Airport";
				
			}	
			break;
			}
		}
	
	}
