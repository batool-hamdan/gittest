public class Car {
    double mileage;
    int price;
    int doors;

    //constructors - special method - create object -
    public Car(double mileage,int price,int doors) {
        this.mileage = mileage;
        this.price = price;
        this.doors = doors;

    }
    public void carShutoff(){
        System.out.println("car Engine off ");


    }
}
