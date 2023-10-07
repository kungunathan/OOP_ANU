package org.example;
import java.lang.String;
public class Nissan extends Vehicle{
    private String EngineType;
    private double TankCapacity;
    public String setEngineType(String engineType){
        EngineType= engineType;
        return engineType;
    }
    public double setTankCapacity(double tankCapacity){
        TankCapacity=tankCapacity;
        return tankCapacity;
    }

    //Getter
    public String getEngineType(){
        return ("Your engine is a "+EngineType);
    }
    public String getTankCapacity(){
        return ("Your car will use "+ TankCapacity+"litres for a full tank");
    }

}
