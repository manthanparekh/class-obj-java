// TODO: Task1 create a class named 'Ship' 
public class Ship {
    // TODO: Task2 create instance variabe for 'name', 'dataArriving', and 'numberOfpeople'
    // TODO: Task3 assing the data type for 'name' and 'dateArriving' to be String and 'numberOfpeople' to be integer   
    String name; // instance variable 'name' with a data type string 
    String dateArriving; // instance variable 'dataArriving' with a data type string 
    int numberOfpeople; // instance variable 'numberOfpeople' with a data type integer 

    public static void main(String[] args) { // main method 
        // TODO: Task4 inside the main method create two new objects named 'Oasis' and 'Disney'
        Ship Oasis = new Ship(); // object named 'Oasis'
        Ship Disney = new Ship(); // object named 'Disney'
        
        // TODO:  Task5 give some values to the object and instance vaiables  
        Oasis.name = "oasis";
        Oasis.dateArriving = "june 12";
        Oasis.numberOfpeople = 500;
        Disney.numberOfpeople = 1000;
        
        // TODO: Task6 print the values from Task5
        System.out.println(Oasis.name);
        System.out.println(Oasis.dateArriving);
        System.out.println(Oasis.numberOfpeople);
    }
}