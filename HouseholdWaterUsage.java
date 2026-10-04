import java.util.Scanner;

public class HouseholdWaterUsage {
    
    // Method to calculate total usage
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1a) Household details
        System.out.print("Enter number of family members: ");
        int familyMembers = sc.nextInt();

        System.out.print("Enter house number: ");
        int houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (H=High, L=Low, M=Medium): ");
        char usageStatus = sc.next().charAt(0);

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc.nextDouble();

        System.out.println("\n--- Household Details ---");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Usage Status: " + usageStatus);
        System.out.println("Water Consumed (litres): " + waterConsumed);

        // 1b) Water bill calculation
        int bill;
        if (waterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
        System.out.println("Water Bill: Rs." + bill);

        // 1c) Method for total consumption
        System.out.print("\nEnter morning water usage (litres): ");
        int morning = sc.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = sc.nextInt();

        int total = calculateTotal(morning, evening);
        System.out.println("Total Water Consumption (morning + evening): " + total + " litres");

        sc.close();
    }
}

