package tv;

import java.lang.*;
import java.lang.String;

public class TV {
    //Attributes
    private boolean switchedOn;
    public static int counterOfSwitchedOn = 0;

    //Methods
        //constructor
    public TV() {
        switchedOn = false;
    }

    public TV(boolean switchedOn) {
        this.switchedOn = switchedOn;
        //System.out.println(this.getSwitchedOn());
    }

    public boolean getSwitchedOn() {
        return this.switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public void onOff() {
        if (counterOfSwitchedOn >= 2) {
            System.out.println("TV went wrong!");

        } else {
            this.switchedOn = !this.switchedOn;
            //switchedOn = !switchedOn;
            if (switchedOn) { //if (this.switchedOn == true) {
                counterOfSwitchedOn++;
                System.out.println("TV: ON");
            } else {
                System.out.println("TV: OFF");
            }
        }

    }
}
