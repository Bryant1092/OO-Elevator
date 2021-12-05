public class Main {
    public static void main(String []args) {
        Elevator elevator = new Elevator();
        elevator.setFloor(1);
        elevator.press2();
        elevator.press1();
        elevator.press3();
        elevator.press3();
        elevator.press1();
    }
}