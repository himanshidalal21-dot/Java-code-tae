import java.util.Scanner;

class Que3 {
    int CarId;
    String CarType;
    float Rent;

    // Method to accept CarId and CarType
    void GetCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        CarType = sc.nextLine();
    }

    // Method to calculate and return rent based on CarType
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
            System.out.println("Invalid Car Type!");
        }
        return Rent;
    }

    // Method to display car details
    void ShowCar() {
        System.out.println("\nCar Details:");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    // Main method
    public static void main(String[] args) {
        CARRENTAL car = new CARRENTAL();
        car.GetCar();
        car.GetRent();
        car.ShowCar();
    }
}