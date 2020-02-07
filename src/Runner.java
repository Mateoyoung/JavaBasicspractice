public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(2000, "Toyota", 100, "Camry");
        System.out.println(myCar.toString());
        myCar.drive(13);
        System.out.println(myCar.toString());
        Rectangle myRectangle = new Rectangle(2,3);
        System.out.println(myRectangle.toString2());

    }

}