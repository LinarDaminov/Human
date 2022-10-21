

public class Flowers {
    private String name;
    private String color;
    private String country;
    private double cost;
    private int lifeSpan;


    public Flowers(String name, String color, String country, double cost, int lifeSpan) {
        this.name = name;
        if (color.isEmpty() || color.isBlank() || color == null) {
            this.color = "белый";
        } else
        this.color = color;
        if (country.isBlank() || country.isBlank() || country == null) {
            this.country = "Россия";
        } else
        this.country = country;
        if (cost <= 0) {
            this.cost = 1;
        }else {
        this.cost = cost;
        }

        if (lifeSpan <= 0 ) {
            this.lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;


    }
    @Override
    public String toString() {
        return "Цветы: " + name +  " цвет " + color + ", Страна: " + country + ", Цена: " + cost + ", Срок стояния: " + lifeSpan + " дней" ;
    }

}






