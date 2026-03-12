import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    // Method to get car details
    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
        Rent = GetRent(); // calculate rent
    }

    // Method to calculate rent based on type
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            return 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            return 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            return 2500;
        } else {
            return 0;
        }
    }

    // Method to display car details
    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CARRENTAL car = new CARRENTAL();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        car.GetCar(id, type);

        System.out.println("\nCar Details:");
        car.ShowCar();

        sc.close();
    }
}