package cars;

public class Main {

    public static void main(String[] args) {


        CarOwner johannes = new CarOwner ("Johannes", "Malmö", 25);
        Car volvo = new Car ("SMD123", "Sedan", "Tesla");


        System.out.println(johannes.name +" "+ johannes.address +" "+ johannes.age);
        System.out.println( volvo.registernumber +" "+ volvo.brand +" "+ volvo.model);

        volvo.buyCar(johannes);

        //volvo.sellCar();
        printCar(volvo);

    }
    public static void printCar (Car car){
        if (car.getCarOwner() == null){
            System.out.println(" bilen med regNummber " + car.getRegisternumber() + " har ingen ägare ");
        } else {
            System.out.println(" Bilen med regNummer " + car.getRegisternumber() + " är av modellen " + car.getBrand() + " och ägs av " + car.getCarOwner().getName());
        }

    }

}


