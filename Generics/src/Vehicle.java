public class Vehicle<T>{
    T t;

    public Vehicle(T t){
        this.t = t;
    }

    public void drive(){
        System.out.println(t.toString());
    }
}
