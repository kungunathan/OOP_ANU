package org.example;

public class Tesla extends Vehicle{
    private String BatteryType;
    private double ChargeTime;
    //Setter
    public String setBatteryType(String batteryType){
        BatteryType=batteryType;
        return batteryType;
    }
    public double setChargeTime(double chargeTime){
        ChargeTime=chargeTime;
        return chargeTime;
    }

    //Getter
    public String getBatteryType(){
        return ("Your battery is "+BatteryType);
    }
    public String getChargeTime(){
        return ("Your car will use "+ ChargeTime +"to charge");
    }
}
