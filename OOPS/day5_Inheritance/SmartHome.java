package OOPS.day5_Inheritance;

class Device {
    String deviceId;
    String status;
}

class Thermostat extends Device {
    int temperatureSetting;

    void displayStatus() {
        System.out.println(deviceId + " " + status + " " + temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = "T001";
        t.status = "On";
        t.temperatureSetting = 22;
        t.displayStatus();
    }
}