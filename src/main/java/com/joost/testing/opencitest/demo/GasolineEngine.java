package com.joost.testing.opencitest.demo;

public class GasolineEngine implements PropulsionSource{


    private boolean isStarted = false;

    private int rpm = 0;

    public void start(){
        isStarted = true;
        setThrottle(0);
    }

    public void stop()
    {
        isStarted = false;
        rpm = 0;
    }

    public void setThrottle(int percentage){
        if(isStarted) {
            rpm = percentage * 200 + 1000;
        }
    }

    public int getRpm(){
        if(isStarted){
            return rpm;
        }
        else{
            return 0;
        }
    }

}
