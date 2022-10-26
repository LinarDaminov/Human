public class MainForAuto {
    public static void main(String[] args) {

        Car lada = new Car("lada", "Granta", 1.7, "Желтый", 2015, "Россия", "седан", "АКПП", "А405РО122", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "седан", "", "к261ва102", 5, false);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "седан", "МКПП", "м125аз154", 5, true);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "седан", "", "а468оо078", 4, true);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "седан", "МКПП", "р556ла164", 5, false);

        printInfoAboutCar(lada);
        printInfoAboutCar(audi);
        printInfoAboutCar(bmw);
        printInfoAboutCar(kia);
        printInfoAboutCar(hyundai);
        lada.setRegNumber("Р456ОА102");
        System.out.println(lada.IsRegNumberValid());
    }
    private static void printInfoAboutCar(Car car) {
        System.out.println("Марка " + car.getBrand() + ",модель " + car.getModel() + ",объем двигателя: " + car.getEngineVolume() + ",цвет " + car.getColor() +
                ",год выпуска: " + car.getProductionYear() + ",страна изготовления: " + car.getProductionCountry() + " коробка передач " + car.getTransmission()
                + " тип кузова " + car.getBodyType() + " рег. номер: " + car.getRegNumber() + " количество мест " + car.getPlace() +
                " шины: " + car.setWinterTire() + (car.getKey().isKeyLessAccess() ? "безключевой" : "ключевой" )+
                (car.getKey().isRemoteEngineStart() ? "удаленный" : "локальный" ) + (car.getInsurance()) );


        }



}



















