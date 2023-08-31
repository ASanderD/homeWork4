public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int age = 11;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");

        System.out.println("Задание 2.");
        int temperature = 25;
        boolean normTemperature = temperature >= 5;
        if (normTemperature) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        else {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        }
        System.out.println(" ");

        System.out.println("Задание 3.");
        int speed = 10;
        boolean speedAtMoment = speed >= 60;
        if (speedAtMoment) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
       System.out.println(" ");

        System.out.println("Задание 4.");
        System.out.println("Возраст = " + age);
        boolean child = age >= 2 && age <= 6;
        boolean studentOfSchool = age >= 7 && age <= 17;
        boolean studentOfUniversity = age >= 18 && age <= 24;
        boolean worker = age > 24; // приходится создавать, т.к. возраст может быть также от 0 до 1 года включительно
        if (child) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        else if (studentOfSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        else if (studentOfUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        else if (worker) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему никуда не нужно ходить.))");//пенсионера добавлять не стал))
        }
        System.out.println(" ");

        System.out.println("Задание 5.");
        System.out.println("Возраст = " + age);
        boolean childWithAdult = age >= 5 && age < 14;
        boolean childWithoutAdult = age >= 14;
        if (childWithAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракионе в сопровождении взрослого.");
        }
        else if (childWithoutAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракионе без сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракионе.");
        }
        System.out.println(" ");

        System.out.println("Задание 6.");
        int numberOfPassengers = 110;
        int capacity = 102;
        int seating = 60;
        int standing = capacity - seating;
        System.out.println("Количество пассажиров - " + numberOfPassengers);
        if (numberOfPassengers <= seating) { //Когда количество пассажиров меньше либо равно количеству сидячих мест
            System.out.println("В вагоне осталось " + (capacity - numberOfPassengers) + " свободных места, из них " + (seating - numberOfPassengers) + " сидячих и " + standing + " стоячих места.");
        }
        else if (numberOfPassengers > seating && numberOfPassengers < capacity) { //Когда количество пассажиров больше количества сидячих мест, но меньше вместимости вагона
            System.out.println("В вагоне осталось " + (capacity - numberOfPassengers) + " свободных мест, из них " + (capacity - numberOfPassengers) + " стоячих мест.");
            }
        else if (numberOfPassengers == capacity) { //Когда количество пассажиров равно вместимости вагона
            System.out.println("В вагоне не осталось свободных мест.");
            }
        else { // Когда количество пассажиров больше, чем вместимость вагона
            System.out.println("Вагон переполнен.");
            }
        System.out.println(" ");

        System.out.println("Задание 7.");
        int one = 30;
        int two = 50;
        int three = 47;
        if (one > two && one > three) {
            System.out.println("Число один - " + one + " больше, чем число два - " + two + " и больше, чем число три - " + three); //когда число 1 больше, чем число 2 и больше, чем число 3
        }
        else if (two > one  && two > three) {
            System.out.println("Число два - " + two + " больше, чем число один - " + one + " и больше, чем число три - " + three); //когда число 2 больше, чем число 1 и больше, чем число 3
        }
        else {
            System.out.println("Число три - " + three + " больше, чем число один - " + one + " и больше, чем число два - " + two); //когда число 3 больше, чем число 1 и больше, чем число 2
        }
    }
}