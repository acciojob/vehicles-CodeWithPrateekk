package com.driver;

public class F1 extends Car {

    public F1() {
        //super();
    }

    public F1(String type, boolean isManual) {
           super.setName(type);
           super.setManual(isManual);
    }

    public void accelerate(int rate){
        int k = super.getCurrentSpeed();
        k+= rate;
        super.setCurrentSpeed(k);
        //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(super.getCurrentSpeed() == 0) {
            //Stop the car, set gear as 1
            super.changeGear(1);

        }
        //for all other cases, change the gear accordingly

        if(super.getCurrentSpeed() > 0 && super.getCurrentSpeed() <51) {
            super.changeGear(2);
        }

        if(super.getCurrentSpeed() >= 101 && super.getCurrentSpeed() <= 150) {
            super.changeGear(3);
        }

        if(super.getCurrentSpeed() >= 151 && super.getCurrentSpeed() <=200) {
            super.changeGear(4);
        }

        if(super.getCurrentSpeed() >= 201 && super.getCurrentSpeed() <=250) {
            super.changeGear(5);
        }

        if(super.getCurrentSpeed() >= 250) {
            super.changeGear(6);
        }
    }
}
