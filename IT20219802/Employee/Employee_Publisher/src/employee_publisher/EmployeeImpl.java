package employee_publisher;

import java.util.Scanner;

public class EmployeeImpl implements IEmployee{
	
	Scanner sc = new Scanner(System.in);
	float distance = 0;
	float cost = 0;
	float weight = 0;
	float costPerKilogram = 20;
	float costPerKilometer = 60;

	@Override
	public void calcDeliveryCost() {
		System.out.println("---Calculate Employee Cost---");
			System.out.println("Please Enter ID: ");
			float distance = sc.nextFloat();
			System.out.println("Please Enter Salary rate: (rate%)");
			float weight = sc.nextFloat();
			
			if(distance < 5 ) {
				if(weight <= 1) {
					cost = 0;
					System.out.println("Free Delivery on your order!");
				}else {
					cost = costPerKilogram * weight;
					System.out.println("Your Monthly Salary charge is " + cost);
				}
			}else if(distance > 5) {
				if(weight < 2) {
					cost = costPerKilometer * distance;
					System.out.println("Your Monthy cost is " + cost);
				}else {
					cost = (costPerKilometer * distance) + (costPerKilogram * weight);
					System.out.println("Your Monthly cost is " + cost);
				}
			}
		}
}
