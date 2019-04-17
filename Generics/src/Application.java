public class Application {

    public static void main(String[] args){
        Car car = new Car();
        Jeep jeep = new Jeep();

        Vehicle<Car> carVehicle = new Vehicle<>(car);

    }
}
