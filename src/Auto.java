/*Если не указана модель, марка машины и страна сборки, то значение по умолчанию — default.*/
public class Auto {
   private String brand;
   private String model;
   private double engineVolume;
   private String color;
   private int productionYear;
   private String productionCountry;

    public Auto(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand.isEmpty()){
            this.brand = "default";
        }else {
            this.brand = brand;}
        if(model.isEmpty()){
            this.model = "default";
        }else {
            this.model = model;
        }
        if (engineVolume==0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;}
        if (color.isEmpty()){
            this.color = "белый";
        }else {
            this.color = color;}
        if (productionYear == 0) {
            this.productionYear = 2020;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry.isEmpty()){
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;}
    }
    @Override
    public String toString() {
        return "Марка " + brand + ",модель " + model +  ",объем двигтеля: " + engineVolume + ",цвет " + color  +
                ",год выпуска: " + productionYear + ",страна изготовления: " + productionCountry;
    }
}
