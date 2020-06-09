import java.util.Scanner;

public class WhereToTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("What kind of vacation are you looking for? Musical, tropical, or adventurous?");
			String vacationType = scnr.nextLine();
			vacationType = vacationType.toLowerCase();
			String travelMethod = "x";
			String location = "y";
				//System.out.println(vacationType);
		System.out.println("How many people are in your party?");
			int groupSize = scnr.nextInt();
				//System.out.println(groupSize);
				if (vacationType.equals("musical")) {
					location = "New Orleans";
				} else if (vacationType.equals("tropical")) {
					location = "beach vacation in Mexico";
				} else if (vacationType.equals("adventurous")) {
					location = "whitewater rafting in the Grand Canyon";
				} else {
					System.out.println("We don't have any trips like that, please select between musical, tropical or adventurous.");
				}
				
				if (groupSize <= 0) {
					System.out.println("Not much of a vacation if nobody is going.  Wouldn't you agree?");
				} else if (groupSize <= 2) {
					travelMethod = " flying first class";
				} else if (groupSize <= 5) {
					travelMethod = "a helicopter trip";
				} else if (groupSize >= 6) {
					travelMethod = "chartering a flight";
				}
				System.out.println("Since you're a group of " + groupSize + " going on a " + vacationType + " vacation, I suggest " + travelMethod + " to " + location + ".");			}
	}
