package num5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelOccupancy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int floors, totalRooms = 0, occupiedRooms = 0;
		
		do {
			System.out.print("Enter the total number of floors: ");
			floors = input.nextInt();
			System.out.println("");
		}
		while (floors < 1);
		
		
		for (int x = 1; x <= floors; x++){
			System.out.print("Enter the total number of rooms on this floor: ");
			totalRooms += input.nextInt();
			System.out.print("Enter the number of rooms that are occupied: ");
			occupiedRooms += input.nextInt();
			System.out.println("");
		}
		
		DecimalFormat percent = new DecimalFormat("#0.##%");
		
		System.out.println("# of rooms: " + totalRooms);
		System.out.println("# of occupied rooms: " + occupiedRooms);
		System.out.println("Occupancy Rate: " + percent.format((double)occupiedRooms / totalRooms));
		
		input.close();

	}

}
