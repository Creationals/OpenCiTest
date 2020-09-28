package com.joost.testing.opencitest.demo;

public class Owner {


    public void DoStuff(){

        DieselEngine engine = new DieselEngine();

        Car myCar = new Car(engine);

        myCar.PrepareForDeparture();
        myCar.DriveLikePeugeotDriver(50);
        myCar.PedalToTheMetal();
    }


}
