interface Figure {

    double getPerimeter();

    double getArea();

    void setFillColor(String color);

    String getFillColor();

    void setBorderColor(String color);

    String getBorderColor();

    default void print() {
        System.out.printf("Периметр: %.2f\n", getPerimeter());
        System.out.printf("Площадь: %.2f\n", getArea());
        System.out.printf("Цвет заливки: %s\n", getFillColor());
        System.out.printf("Цвет границы: %s\n", getBorderColor());
        System.out.println();
    }
}

class Circle implements Figure {

    private double radius;
    private String fillColor, borderColor;

    public Circle(double radius) {
        this.radius = radius;
        this.fillColor = "Белый";
        this.borderColor = "Черный";
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Figure {

    private double width, height;
    private String fillColor, borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.fillColor = "Белый";
        this.borderColor = "Черный";
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Figure {

    private double base, height;
    private double side1, side2, side3;
    private String fillColor, borderColor;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = "Белый";
        this.borderColor = "Черный";
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class Zadanie4_2 {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.setFillColor("Красный");
        circle.setBorderColor("Синий");
        circle.print();

        Rectangle rectangle = new Rectangle(10, 7);
        rectangle.setFillColor("Зеленый");
        rectangle.setBorderColor("Желтый");
        rectangle.print();

        Triangle triangle = new Triangle(6, 8, 5, 7, 9);
        triangle.setFillColor("Фиолетовый");
        triangle.setBorderColor("Оранжевый");
        triangle.print();
    }
}
