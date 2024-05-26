Person[] employees = new Person[5];

employees[0] = new Person("Jay J", "Инженер", "qwe@mail.ru", "+71111111111", 111111, 11);
employees[1] = new Person("Fox F", "Бухгалтер", "rty@mail.ru", "+722222222222", 22222, 22);
employees[2] = new Person("Leo L", "Менеджер", "uio@mail.ru", "+73333333333333", 33333, 33);
employees[3] = new Person("Jon N", "Дворник", "asd@mail.ru", "+44444444444", 44444, 44);
employees[4] = new Person("Vas V", "Директор", "zxc@mail.ru", "+5555555555", 555555, 55);

for (Person employee : employees) {
    employee.printInfo();
}