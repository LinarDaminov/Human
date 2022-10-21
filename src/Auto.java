/*Если не указана модель, марка машины и страна сборки, то значение по умолчанию — default.*/
public class Auto {
    private String brand;
    private String model;
    public double engineVolume;
     public String color;
    private int productionYear;
    private String productionCountry;
    public String transmission;
    private String bodyType;
    public int tegNumber;
    private int Place;
     public String summerOrWinterTire;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPlace() {
        return Place;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getTegNumber() {
        return tegNumber;
    }

    public void setTegNumber(int tegNumber) {
        this.tegNumber = tegNumber;
    }

    public String getSummerOrWinterTire() {
        return summerOrWinterTire;
    }

    public void setSummerOrWinterTire(String summerOrWinterTire) {
        this.summerOrWinterTire = summerOrWinterTire;
    }

    public Auto(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2020;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    @Override
    public String toString() {
        return "Марка " + brand + ",модель " + model + ",объем двигтеля: " + engineVolume + ",цвет " + color +
                ",год выпуска: " + productionYear + ",страна изготовления: " + productionCountry;
    }
}
