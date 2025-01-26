package deviceInheritance;

public class Hairdryer extends Device {
    private double rpm;
    private double voltage;
    private double airTemperature;
    private double noiseLevel;
    private double wireLength;

    public Hairdryer(int price, String colour, String brandName, String model, int deviceId, double warrenty, double lengthOfWire, double rpm, double voltage, double airTemperature, double noiseLevel, double wireLength) {
        super(price, colour, brandName, model, deviceId, warrenty, lengthOfWire);
        this.rpm = rpm;
        this.voltage = voltage;
        this.airTemperature = airTemperature;
        this.noiseLevel = noiseLevel;
        this.wireLength = wireLength;
    }
}
