package cars;

public class Car {

    String registernumber;
    String model;
    String brand;
    CarOwner owner;



    public Car(String registernumber, String model, String brand) {
        this.registernumber = registernumber;
        this.model = model;
        this.brand = brand;


    }
    public String getmodel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public String getRegisternumber(){
        return registernumber;
    }

    public CarOwner getCarOwner(){
        return owner;
    }

    public void buyCar(CarOwner newOwner){
        owner = newOwner;
    }

    public void sellCar(){
        owner = null;
    }



}
