package lab_24_august;   // Package declaration

class Surgeon_Q3 extends Doctor_Q3 {
    String operationType;

    // Constructor for surgeon_Q3 class
    Surgeon_Q3(String name, String specialization, String operationType) {
        super(name, specialization); // Calling the constructor of the parent class
        this.operationType = operationType;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Calling the overridden method of the parent class
        System.out.println("Operation Type: " + operationType);
    }
}