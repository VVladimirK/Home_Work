package HomeWork;
public class HomeWork {
    public static void main(String[] args) {
        printThreeWords(); // Задание 1
        printColor(); // Задание 2
        checkSumSign(); // Задание 3
        compareNumbers(); // Задание 4
        System.out.println(Tusk5(10, 10)); // Задание 5
        checkNumber(5); // Задание 6

        int number = -5; // Задание 7
        boolean isNeg = isNegative(number);
        System.out.println(isNeg);

        String a = "Привет!"; // Задание 8
        int b = 7;
        print(a, b); 

        int year = 2024;  // Задание 9
        boolean isLeap = isLeapYear(year); 
        System.out.println(year + " год является " + (isLeap ? "високосным" : "невисокосным"));

        task10();   // Задание 10
        task11();   // Задание 11
        task12();   // Задание 12
        task13();   // Задание 13
        tasK14();   // Задание 14
    }
   
   
    public static void printThreeWords() {   // Задание 1
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

       }

       public static void checkSumSign() {   // Задание 2
        int a = 10;
        int b = 20;
        int sum = a + b;
    
        if (sum >= 0) {
          System.out.println("Сумма положительная");
        } else {
          System.out.println("Сумма отрицательная");
        }
      }


      public static void printColor() {   // Задание 3
        int value = 0;
     
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {   // Задание 4
        int a = 5;
        int b = 10;

        if (a >= b) {
          System.out.println("a >= b");
      } else {
          System.out.println("a < b");
      }
    }

    public static boolean Tusk5(int a, int b) {   // Задание 5
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    public static void Tusk6() {    // Задание6
        checkNumber(5);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isNegative(int n) {   // Задание 7
        return n < 0;
      }
     
    public static void print(String a, int b) {   // Задание 8
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    
        public static boolean isLeapYear(int year) { // Задание 9
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void task10() {  // Задание 10
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {   
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else if (numbers[i] == 1) {
                numbers[i] = 0;
            }
        }
        
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static void task11() {      // Задание 11
        int[] numbers = new int[100];
      
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
                
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void task12() {    // Задание 12
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
       
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void task13() {   // Задание 13
        int n = 4;        
        int[][] a = new int[n][n];        
        for (int i = 0; i < n; i++) {
            a[i][i] = 1;
        }
               
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] task14(int len, int initialValue) {        
        int[] array = new int[len];       
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void tasK14() {
        int[] myArray = task14(7, 7);

        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

}