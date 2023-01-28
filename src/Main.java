import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Задача1 ");
        Lesson_metod1 pen = new Lesson_metod1(); // Обращаемся к классу который создали, создаем в нем переменную и переносим его в наш созданый класс (открываем ему методы класса)
        pen.specifyTheNumber(2021);  // Через переменную (через точку) обращаемся к методам нашего класса
        pen.actionOverTheYear();
    }

    public static void task2() {
        System.out.println(" Задание 2 ");
        int currentYear = LocalDate.now().getYear();
        Lesson2_iOS one = new Lesson2_iOS();
        one.phone(0, currentYear );
    }


        public static void task3 () {
            System.out.println(" Задание 3 ");
            Lesson_delivery one = new Lesson_delivery();
            one.cardDistance(95);

        }
    }
