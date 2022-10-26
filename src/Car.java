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
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String bodyType, String transmission, String regNumber, int place, boolean winterTire) {
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
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (regNumber.isBlank()) {
            this.regNumber = "о00000777";
        } else {
            this.regNumber = regNumber;
        }

        this.place = place;
        this.winterTire = winterTire;
        this.key = new Key() ;
        this.insurance = new Insurance();

    }


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
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;

        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public boolean isWinterTire() {
        return winterTire;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public boolean IsRegNumberValid() {
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

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber.isBlank()) {
            this.regNumber = "о00000777";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean setWinterTire() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTire = currentMonth <= 4 && currentMonth >= 11;
        return false;
    }


    private static boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    private static boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }

        public Key() {
            this(false, false);

        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;


        public Insurance(LocalDate validUntil, float cost, String number) {
            if (validUntil == null) {
                this.validUntil = LocalDate.now().plusDays(365);
            } else {
                this.validUntil = validUntil;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }

        }

        public Insurance() {
            this(null   , 15000, null);
        }

        public void checkInsurance() {
            if (validUntil.isBefore(LocalDate.now()) || validUntil.isEqual(LocalDate.now())) {
                System.out.println("Обновить страховку");
            } else {
            }
        }

        public void checkNumber() {
            if (number.length() > 9 || number.length() < 9) {
                System.out.println("Некорректный номер");
            }
        }


        public LocalDate getValidUntil() {
            return validUntil;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}







