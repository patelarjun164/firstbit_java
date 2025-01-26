package deviceInheritance;

public class Pendrive extends Device{
    private double storageCapacity;
    private double writingSpeed;
    private double readingSpeed;
    private String memoryStatus;

    public Pendrive(int price, String colour, String brandName, String model, int deviceId, double warrenty, double lengthOfWire, double storageCapacity, double writingSpeed, double readingSpeed, String memoryStatus) {
        super(price, colour, brandName, model, deviceId, warrenty, lengthOfWire);
        this.storageCapacity = storageCapacity;
        this.writingSpeed = writingSpeed;
        this.readingSpeed = readingSpeed;
        this.memoryStatus = memoryStatus;
    }
}
