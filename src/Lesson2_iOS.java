public class Lesson2_iOS {

String phone (int os, int productionYear){
    StringBuilder result = new StringBuilder("Установите ");
    if (productionYear < 2015) {
        result.append("облегченную версию для ");
    } else {
        result.append("версию для ");
    }
    if (os == 0) {
        result.append("iOS");
    } else {
        result.append("Android");
    }
    System.out.println(result);
    return result.toString();
}

    }
