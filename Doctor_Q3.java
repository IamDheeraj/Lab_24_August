package lab_24_august; // Package declaration

class Doctor_Q3 {

    String name;
    String specialization;

    // Constructor for Doctor_Q3 class
    Doctor_Q3(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Method to display doctor's and nurse information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        // Creating instances of Surgeon_Q3 and Nurse_Q3
        Surgeon_Q3 surgeon = new Surgeon_Q3("Dr. Dheeraj", "Cardiothoracic Surgeon", "Heart Surgery");
        Nurse_Q3 nurse = new Nurse_Q3("abcd", "ICU Nurse", 5);

        System.out.println("Surgeon Information:");
        surgeon.displayInfo();
        System.out.println();

        System.out.println("Nurse Information:");
        nurse.displayInfo();
    }
}