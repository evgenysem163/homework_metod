public class Lesson_metod1 {
    int year;

    int specifyTheNumber(int parameterYear){ // Создали метод specifyTheNumber передали в него парметр с типом int переменная parametrYear
         year = parameterYear;              // Прировняли нашу переменну класса к перменной метода
         return  parameterYear;            // Возвратили результат метода через перменную parameterYear
    }

    void actionOverTheYear() {
        if (((year % 4== 0) && (year % 100 != 0)) || (year % 400 ==0)) {
            System.out.println(year+" Год високосный ");
        } else
            System.out.println(year+" Год невисокосный ");

        }


    }

