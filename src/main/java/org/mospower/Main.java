package org.mospower;
//`Первое домашнее задание по агентам!
//1 ЛК ДЗ (БЕЗ ТЕСТОВ):
//- Задано число int. Вывести в консоль "четное!", если число четное. Вывести в консоль "нечетное..", если число нечетное .
//В конце записи вывести само число
//- Задано слово String. Вывести каждую букву этого слова с новой строки. Если в слове есть буква "а" - прекратить вывод букв,
//"а" не должно быть выведено.

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
public class Main {
    public static void main(String[] args) {
        int number = 7;
        //System.out.println("input number= "+number);
        if (number % 2 == 0) {
            System.out.println("Четное " + number);
        } else {
            System.out.println("Нечетное " + number);
        }
        System.out.println("------------------------");
    }
}
*/
public class Main {
    public static void main(String[] args){
        String slovo = "mechanic";
        for (int i = 0; i < slovo.length();++i) {
            if (slovo.charAt(i) == 'a') {
                //System.out.println("///BREAK///");
                break;
            } else {
                System.out.println(+slovo.charAt(i));
                //System.out.println("///ELSE///");
            }
        }
    }
}

