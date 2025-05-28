import Models.Motor;

public class App {
    public static void main(String[] args) throws Exception {
        Motor motor = new Motor("M001", "Bosch", 4, 120);

        System.out.println("==== MOTOR ====");
        motor.mostrarInformacion();
        motor.encenderMotor();
    }
}
