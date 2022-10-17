public class Auto {
   private String brand;
   private String model;
   private double engineVolume;
   private String color;
   private int productionYear;
   private String productionCountry;

    public Auto(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Марка " + brand + ",модель " + model +  ",объем двигтеля: " + engineVolume + ",цвет " + color  +
                ",год выпуска: " + productionYear +
                ",страна изготовления: " + productionCountry;
    }
}
