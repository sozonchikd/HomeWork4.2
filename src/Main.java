public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием.");
        }
        else  {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        System.out.println("Задание 2");
        int humanAge = 15;
        if (humanAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else if (humanAge >=18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (humanAge >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (humanAge <7) {
            System.out.println("Не проходит критерии");
        }

        System.out.println("Задание 3");

        int passengers = 17;
        int wagonCapacity = 102;
        int sitPlaces = 60;
        if (passengers > wagonCapacity) {
            System.out.println("Вагон переполнен");
        }
        else if (passengers > sitPlaces) {
            System.out.println("Есть стоячие места");
        }
        else if (passengers < sitPlaces) {
            System.out.println("Есть сидячие места");
        }
    }
}