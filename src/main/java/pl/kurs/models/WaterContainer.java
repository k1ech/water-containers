package pl.kurs.models;

public class WaterContainer {

    private final String name;
    private final double maxCapacity;
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

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public void addWater(double value) {

        if(value <= 0) {
            System.out.println("Błędna ilośc wody do dodania");
        } else if(waterAmount + value > maxCapacity) {
            System.out.println("Nie zmieści się tyle wody");
        } else {
            waterAmount+=value;
        }

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
