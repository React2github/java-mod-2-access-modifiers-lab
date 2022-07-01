import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List <String> cars = new ArrayList<>();

    public List <String> getCars() {
        return cars;
    } 

    public void setCars(int index, String carName) {
        cars.set(index,carName);
    }

    public void addCars(String carName) {
       cars.add(carName);
    } 
    
    
}
