package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car   = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        Modle3Car modle3Car = new Modle3Car();
        driver.setK3Car(null);
        driver.setModel3Car(modle3Car);
        driver.drive();

    }
}
