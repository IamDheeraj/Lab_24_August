package lab_24_august; // Package declaration

class Nurse_Q3 extends Doctor_Q3 {

    int yearsOfExperience;

    // Constructor for Nurse_Q3 class
    Nurse_Q3(String name, String specialization, int yearsOfExperience) {
        super(name, specialization); // Calling the constructor of the parent class
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Calling the overridden method of the parent class
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}