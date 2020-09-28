package com.joost.testing.opencitest.demo;

public class Car {

    private PropulsionSource propulsion;

    public Car(PropulsionSource thePropulsion){
         this.propulsion = thePropulsion;
    }

    public void PrepareForDeparture(){
        propulsion.start();
    }

    public void PedalToTheMetal(){
        propulsion.setThrottle(100);
    }


    public void DriveLikePeugeotDriver(int speedLimitThrottle){

        // Specially for roads where at least 50% throttle is required
        propulsion.setThrottle((int) Math.round(speedLimitThrottle * 0.5));
    }

    public int getSpeed(){
        if(propulsion.getRpm() > 1500) {
            return propulsion.getRpm();
        }
        return 0;
    }

}
