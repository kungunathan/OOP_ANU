package org.example;

public class Main {
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla();
        Nissan nissan1 = new Nissan();

        double oID= tesla1.setOwnerId(123);
        String regNo =tesla1.setRegistrationNumber("KAA 001A");
        String batteryType =tesla1.setBatteryType("13000w");
        double chargeTime =tesla1.setChargeTime(1.5);
        System.out.println(oID+"Your car "+regNo+" of battery type"+batteryType+" has a charge time of "+chargeTime);

        double oId = nissan1.setOwnerId(234);
        String regNum = nissan1.setRegistrationNumber("KBB 023E");
        String engType = nissan1.setEngineType("V4");
        double  tankCap = nissan1.setTankCapacity(45);
        System.out.println(oId+"Your car "+regNum+" of engine type "+engType+" has a fuel capacity of "+tankCap+" liters");
    }
}