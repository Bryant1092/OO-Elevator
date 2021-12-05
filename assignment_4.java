import java.util.Scanner;

public class assignment_4 {
    public static void main(String[] args) {
        doorStatus(1, 1, 0);
    }

    static boolean floorCheck(int floorOn, int floorSelected) {

        if(floorOn == floorSelected) {
            return false;
        }

        else {
            return true;
        }
    }

    static void doorStatus(int doorCheck, int floorOn, int floorSelected){
        if(doorCheck == 1 && floorSelected == 0) {
            System.out.println("Doors are open");
            button(floorOn);
        }
        else if(doorCheck == 2){
            System.out.println("Doors are closed");
        }
        else if(doorCheck == 3 && floorSelected == 0){
            System.out.println("Nothing happens");
            button(floorOn);
        }
        elevatorStatus(floorOn, floorSelected);
    }

    static void button(int floorOn){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Which floor? 1, 2, or 3");
        int floorInput = myObj.nextInt();
        System.out.println(floorInput + " pressed");
        doorStatus(2, floorOn, floorInput);
    }

    static void elevatorStatus(int floorOn, int floorSelected){
        boolean status = floorCheck(floorOn, floorSelected);
        if(status == true && floorSelected > floorOn) {
            System.out.println("going up...");
            System.out.println("*ding* The elevator arrived at floor " + floorSelected);
            floorOn = floorSelected;
        }
        else if(status == true && floorSelected < floorOn) {
            System.out.println("going down...");
            System.out.println("*ding* The elevator arrived at floor " + floorSelected);
            floorOn = floorSelected;
        }
        else if(status == false)
        {
            doorStatus(3, floorOn, 0);
        }
        doorStatus(1, floorOn, 0);
    }
}