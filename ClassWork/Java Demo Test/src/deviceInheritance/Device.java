package deviceInheritance;

public class Device {
    private int price;
    private String colour;
    private String brandName;
    private String model;
    private int deviceId;
    private double warrenty;
    private double lengthOfWire;

    public Device(int price, String colour, String brandName, String model, int deviceId, double warrenty, double lengthOfWire) {
        this.price = price;
        this.colour = colour;
        this.brandName = brandName;
        this.model = model;
        this.deviceId = deviceId;
        this.warrenty = warrenty;
        this.lengthOfWire = lengthOfWire;
    }
}
