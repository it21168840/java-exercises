import java.util.Scanner;

class RoomChargeCalculator{
	
	private double FixedFee, Balcony, Parking, Kitchen, Garden, Wifi, Tv, Ac;
	
	public double getChargeDeluxDouble(double fixed_fee, double balcony, double parking, double tv, double kitchen, double wifi){
		
		FixedFee = fixed_fee;
		Balcony = balcony;
		Parking = parking;
		Kitchen = kitchen;
		Tv = tv;
		Wifi = wifi;
		
		return(FixedFee + Balcony + Parking + Tv + Wifi);
		
	}
	
	public double getChargeStandardFamily(double fixed_fee, double parking, double kitchen, double garden){
		FixedFee = fixed_fee;
		Parking = parking;
		Kitchen = kitchen;
		Garden = garden;
		
		return(FixedFee + Balcony + Parking + Kitchen + Garden);
		
	}
	
	public double getChargeStandardSingle(double fixed_fee, double parking, double ac, double wifi){
		FixedFee = fixed_fee;
		Parking = parking;
		Ac = ac;
		Wifi = wifi;
		
		return(FixedFee + Parking + Ac + Wifi);
	}
}

//end of RoomChargeCalculator class

class Main{
	public static void main(String[] args){
		
		int num;
		String Select;
	    String Choose;
		double Balcony;
		double Parking;
		double Kitchen;
		double garden;
		double Wifi;
		double Tv;
		double Ac;
	
		RoomChargeCalculator RCC= new RoomChargeCalculator();
		
		Scanner Enter = new Scanner(System.in);
		
		System.out.println("Select a Room Type : ");
		System.out.println("1.Delux-Double\n 2.Standard-Family\n 3.Standard-Single\n 4.Quit\n");
		System.out.println("Enter the number of selected room type: \n");
		
		num = Enter.nextInt();
		
		//start of selecting room type
		
		switch(num){
			//CASE 1
			case 1:
			System.out.println("You have selected Delux-Double type!!!\n");
			System.out.println("We would like to give you some additional facilities under below price ranges....");
			System.out.println("Balcony - 500.00\n Parking - 200.00\n Tv - 200.00\n KItchen - 1000.00\n Wifi - 100.00");
			System.out.println("Type 'yes' if you want these facilities , or else type 'no': \n");
			
			Select = Enter.next();
			
				if (Select.toLowerCase().equals("true")){
					System.out.println("Enter yes or no to the facilities : ");
					System.out.println("Balcony - ");

					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Balcony = 500.00;
					} 
					//if no
					else {
						Balcony = 0.00;
					}
					
					//..............................................................................................
					System.out.println("Parking - ");

					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Parking = 200.00;
					} 
					//if no
					else {
						Parking = 0.00;
					}
					
					//...............................................................................................
					
					System.out.println("Tv - ");

					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Tv = 200.00;
					} 
					//if no
					else {
						Tv = 0.00;
					}
					
					//...............................................................................................
					
					System.out.println("Kitchen - ");

					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Kitchen = 1000.00;
					} 
					//if no
					else {
						Kitchen = 0.00;
					}
					
					//...............................................................................................
					
					System.out.println("Wifi - ");

					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Wifi = 100.00;
					} 
					//if no
					else {
						Wifi = 0.00;
					}
					
				System.out.println("\n Your Payment Bill is:  ");
				System.out.println("Fixed Fee = 5000.00 ");
				System.out.println("Balcony = " +Balcony);
				System.out.println("Parking = " +Parking);
				System.out.println("Tv = " +Tv);
				System.out.println("Kitchen = " +Kitchen);
				System.out.println("Wifi = " +Wifi);
				System.out.println("Your Total Bill = "+RCC.getChargeDeluxDouble(5000.00, Balcony, Parking, Tv, Kitchen, Wifi));
				}
				else {
						
						System.out.println("\n total bill = 5000.00  "); //only the fixed fee
					}
		
				break;
				
			//CASE 2
			case 2:
				
			System.out.println("You have selected Standard-Family type!!!\n");
			System.out.println("We would like to give you some additional facilities under below price ranges....");
			System.out.println("Parking - 200.00\n Kitchen - 500.00\n Garden - 200.00");
			System.out.println("Type 'yes' if you want these facilities , or else type 'no': \n");
			
			Select = Enter.next();
				
				if (Select.toLowerCase().equals("true")){
				System.out.println("Enter yes or no to the facilities : ");
				
				System.out.println("Parking - ");
				Choose = Enter.next();
				
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Parking = 200.00;
					} 
					//if no
					else {
						Parking = 0.00;
					}
					
					//.......................................................................................
					System.out.println("Kitchen - ");
					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Kitchen = 500.00;
					} 
					//if no
					else {
						Kitchen = 0.00;
					}
					
					//.......................................................................................
					System.out.println("Garden - ");
					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Garden = 200.00;
					} 
					//if no
					else {
						Kitchen = 0.00;
					}
				
				System.out.println("\n Your Payment Bill is:  ");
				System.out.println("Fixed Fee = 3000.00 ");
				System.out.println("Parking = " +Parking);
				System.out.println("Kitchen = " +Kitchen);
				System.out.println("Garden = " +Garden);
				System.out.println("Your Total Bill = "+RCC.getChargeStandardFamily(3000.00, Parking, Kitchen, Garden));
				}
				else
					System.out.println("\n total bill = 3000.00  "); //only the fixed fee
	}
				break;
				
			//CASE 3
			case 3:
				
			System.out.println("You have selected Standard-Single type!!!\n");
			System.out.println("We would like to give you some additional facilities under below price ranges....");
			System.out.println("Parking - 200.00\n Ac - 500.00\n Wifi - 100.00");
			System.out.println("Type 'yes' if you want these facilities , or else type 'no': \n");
			
			Select = Enter.next();
				
				if (Select.toLowerCase().equals("true")){
				System.out.println("Enter yes or no to the facilities : ");
				
				System.out.println("Parking - ");
				Choose = Enter.next();
				
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Parking = 200.00;
					} 
					//if no
					else
						Parking = 0.00;
					
					//.................................................................................
					System.out.println("Ac - ");
					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Ac = 500.00;
					} 
					//if no
					else {
						Ac = 0.00;
					}
					
					//....................................................................................
					System.out.println("Wifi - ");
					Choose = Enter.next();
					
					//if yes
					if (Choose == "yes" || Choose == "yes"){
						Wifi = 100.00;
					} 
					//if no
					else {
						Wifi = 0.00;
					}
					
					System.out.println("\n Your Payment Bill is:  ");
					System.out.println("Fixed Fee = 2000.00 ");
					System.out.println("Parking = " +Parking);
					System.out.println("Ac = " +Ac);
					System.out.println("Wifi = " +Wifi);
					System.out.println("Your Total Bill = "+RCC.getChargeStandardSingle(2000.00, Parking, Kitchen, Garden));
				}
				else
					System.out.println("\n total bill = 2000.00  "); //only the fixed fee
}
				break;
				
				//Case 4
			case 4:
				System.out.println("Thank you for using our services!...");
				break;
			default: 
				System.out.println("Invalid Number! Please Try Again!!! ");
				break;	
		}
	}

}