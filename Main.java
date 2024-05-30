public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat("Котей");
        Animal a2 = new Dog("Собакен");
        Animal a3 = new Cat("Котей2");
        Animal a4 = new Dog("Собакен2");

        a1.run(-1);
        a1.run(200);
        a1.run(201);

        System.out.println("---------");

        a2.run(-1);
        a2.run(500);
        a2.run(501);


        System.out.println("---------");

        a3.swim(-1);
        a3.swim(500);
        a3.swim(501);

        System.out.println("---------");

        System.out.println("Количество созданных животных: " + Animal.getCount());
        System.out.println("Количество созданных собак: " + Dog.getCount());
        System.out.println("Количество созданных котов: " + Cat.getCount());
    }
}