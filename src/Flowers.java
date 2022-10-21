

public class Flowers {

    private String name;
    private String color;
    private String country;
   private double cost;
    private int lifeSpan;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

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
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;

    }
    @Override
    public String toString() {
        return "Цветы: " + name + " цвет " + color + ", Страна: " + country + ", Цена: " + cost + ", Срок стояния: " + lifeSpan + " дней";
    }


}







