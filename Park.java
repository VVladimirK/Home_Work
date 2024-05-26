class Park {
    private static class Attraction {
        String name;
        String workingHours;
        int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("***************");
        }
    }

    private Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public void showAllAttractions() {
        if (attractions.length == 0) {
            System.out.println("В парке нет аттракционов.");
            return;
        }

        System.out.println("Список аттракционов:");
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
    public static void main(String[] args) {
        Attraction[] attractions = new Attraction[]{
                new Attraction("Колесо обозрения", "9:00 - 21:00", 100),
                new Attraction("Американские горки", "8:00 - 22:00", 200),
                new Attraction("Комната страха", "7:00 - 00:00", 300),
        };

        Park park = new Park(attractions);
        park.showAllAttractions();
    }
}
