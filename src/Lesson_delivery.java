public class Lesson_delivery {


    void cardDistance (int deliveryDistance) {
      //  int a = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка составит " + day + " день ");
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Доставка составит " + (day + day) + " дня ");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + " Срок доставки " + (day + day + day) + " дня ");
        }
        else {
            System.out.println(" Доставки нет ");
        }

    }
}
