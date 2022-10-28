public class MainForFlower {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза", "", "Голландия", 35.590, 2);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15.003025, 5);
        Flower peony = new Flower("Пион", "", "Англия", 69.9968, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5012, 10);
        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(peony.toString());
        System.out.println(gypsophila.toString());
        System.out.println();
        printHowCostBouquet(rose, rose , rose,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);
    }

    private static void printHowCostBouquet(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower: flowers ) {
            if (flower.getLifeSpan()<minimumLifeSpan) {
                minimumLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.println("Общая цена - " + totalCost);
        System.out.println("Срок стояния - " + minimumLifeSpan);
    }
}

