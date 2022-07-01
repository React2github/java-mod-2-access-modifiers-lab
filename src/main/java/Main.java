import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage myhome = new Garage();
        System.out.println("Type name of car. ");
        try (Scanner obj = new Scanner(System.in)) {
            String carName = obj.nextLine();
            myhome.addCars(carName);
            System.out.println("Type name of car. ");
            String carName2 = obj.nextLine();
            myhome.addCars(carName2);
            System.out.print(myhome.getCars());
        } catch(Exception e) {
            System.out.println("Something went wrong!");
        }
       

    }
}
