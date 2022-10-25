import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private int place;
    public boolean winterTire;

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
        return place;
    }
    public void setPlace(int place) {
        if (place <= 0) {
            this.place = 5;
        } else {
            this.place = place;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;}
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
        if (transmission.isEmpty() || transmission.isBlank() || transmission == null) {
            this.transmission = "Ручная КПП";
        }
        this.transmission = transmission;
    }

    public String getTegNumber() {
        return regNumber;
    }

    public void setTegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setWinterTire() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTire = currentMonth <= 4 && currentMonth >= 11;
    }



    private boolean IsRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumbersChar = this.regNumber.toCharArray();
        return isNumberLetter(regNumbersChar[0])
                && isNumber(regNumbersChar[1])
                && isNumber(regNumbersChar[2])
                && isNumber(regNumbersChar[3])
                && isNumberLetter(regNumbersChar[4])
                && isNumberLetter(regNumbersChar[5])
                && isNumber(regNumbersChar[6])
                && isNumber(regNumbersChar[7])
                && isNumber(regNumbersChar[8]);
    }
    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String bodyType) {
        this.bodyType = bodyType;
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

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }
    }

//    public static class Insurance {
//        private final LocalDate validUntil;
//        private final float cost;
//        private final String number;
//
//        public Insurance(LocalDate validUntil, float cost, String number) {
//            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
//            this.cost - Math.max(cost, 1f);

        }
//    }
//}
