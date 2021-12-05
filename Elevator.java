public class Elevator {
    int floorOn;

    public void setFloor(int floorOn) {
        this.floorOn = floorOn;
    }

    public void press1() {
        int floorSelected = 1;
        System.out.println(floorSelected + " pressed");
        doorStatus(2, floorOn, floorSelected);
    } 

    public void press2() {
        int floorSelected = 2;
        System.out.println(floorSelected + " pressed");
        doorStatus(2, floorOn, floorSelected);
    } 
    
    public void press3() {
        int floorSelected = 3;
        System.out.println(floorSelected + " pressed");
        doorStatus(2, floorOn, floorSelected);
    } 

    boolean floorCheck(int floorOn, int floorSelected) {
        if(floorOn == floorSelected) {
            return false;
        }
        else {
            return true;
        }
    }

    //door control
    void doorStatus(int doorCheck, int floorOn, int floorSelected){
        if(doorCheck == 1 && floorSelected == 0) {
            System.out.println("Doors are open");
        }
        else if(doorCheck == 2){
            System.out.println("Doors are closed");
            elevatorStatus(floorOn, floorSelected);
        }
        else if(doorCheck == 3 && floorSelected == 0){
            System.out.println("Nothing happens");
        }
    }

    //Elevator control/checker
    void elevatorStatus(int floorOn, int floorSelected){
        boolean status = floorCheck(floorOn, floorSelected);
        if(status == true && floorSelected > floorOn) {
            System.out.println("Going up...");
            System.out.println("*ding* The elevator arrived at Floor " + floorSelected);
            setFloor(floorSelected);
            doorStatus(1, floorOn, 0);
        }
        else if(status == true && floorSelected < floorOn) {
            System.out.println("Going down...");
            System.out.println("*ding* The elevator arrived at Floor " + floorSelected);
            setFloor(floorSelected);
            doorStatus(1, floorOn, 0);
        }
        else if(status == false)
        {
            doorStatus(3, floorOn, 0);
        }
        
    }
}
