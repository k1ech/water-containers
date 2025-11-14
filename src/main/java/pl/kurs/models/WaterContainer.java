package pl.kurs.models;

public class WaterContainer {

    private String name;
    private double maxCapacity;
    private double waterAmount;

    public WaterContainer(String name, double maxCapacity, double waterAmount) {
        if (maxCapacity <= 0) {
            throw new RuntimeException("Błędna pojemność!");
        }
        if (waterAmount < 0) {
            throw new RuntimeException("Ilość wody nie powinna być ujemna");
        }
        if (waterAmount > maxCapacity) {
            throw new RuntimeException("Ilość wody nie może być większa od pojemności");
        }
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.waterAmount = waterAmount;
    }

    public String getName() {
        return name;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        return "WaterContainer{" +
                "name='" + name + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", waterAmount=" + waterAmount +
                '}';
    }
}
