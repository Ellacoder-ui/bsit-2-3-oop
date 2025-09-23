public class PetService {
    private static final double BASE_FEE = 50.0;
    private static final double VACCINATION_FEE = 25.0;
    private static final double GROOMING_FEE = 30.0;

    // Method Overloading for Basic Checkup
    public double calculateFee() {
        return BASE_FEE;
    }

    // Method Overloading for Checkup with Vaccination
    public double calculate(boolean withVaccination) {
        if (withVaccination) {
            return BASE_FEE + VACCINATION_FEE;
        }
        return BASE_FEE;
    }

    // Method Overloading for Full Service
    public double calculate(boolean withVaccination, boolean withGrooming) {
        if (withVaccination && withGrooming) {
            return BASE_FEE + VACCINATION_FEE + GROOMING_FEE;
        }
        return calculate(withVaccination);
    }

    // Method Overloading for Emergency
    public double calculateFee(String emergencyType) {
        return 200.0; // Emergency fee
    }

    public static void main(String[] args) {
        PetService service = new PetService();

        // Displaying the fee for various services
        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculate(true));
        System.out.println("Full service: $" + service.calculate(true, true));
        System.out.println("Emergency: $" + service.calculateFee("emergency"));
    }
}
