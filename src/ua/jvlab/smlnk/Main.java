package ua.jvlab.smlnk;

/* works String */

/* @version 1.0.0;
 * @date 2018-01-23;
 * @author "$.m.lnk";
 */

public class Main {

    public static void main(String[] args) {
        // обявляем и инициализируем переменные String s1, s2;
        String s1 = "220981";
        String s2 = "SerG";
        String s8 = "SERG";
        String s10 = "220981";

        // конкатенация строк (s1+s2);
        String s3 = (s1 + s2);
        System.out.println("s1+s2 = " + s3 + "\n"); // 220981SerG;

        // вывод данных строки "220981" на экран с указаного индекса;
        String s4 = s1.substring(2);
        System.out.println("с указаного индекса [2] - " + s4 + "\n"); //0981;

        String s6 = s2.substring(1, 3); //ставим endIndex на один index больше;
        System.out.println("с указаного индекса [0 по 2] - " + s6 + "\n"); //er;

        // показать длину строки s2;
        Integer n = s2.length();
        System.out.println("длина строки s2 = " + n + "\n"); //4;

        // поднять все символы у заглавный регистр;
        String s5 = s2.toUpperCase();
        System.out.println(s5 + "\n");  // "SERG", было знач.="SerG";

        // вывод символа строки на экран по заданому индексу;
        char a = s2.charAt(1);
        System.out.println(a + "\n"); // 'e';

        // показывает индеск с которого символа нач. заданая строка;
        int indx = s1.indexOf("3");
        System.out.println(indx + "\n"); // возвращает -1 если нет такого символа;

        // вставка / замена как у ворде;
        String s7 = "aaabbbccc".replace("bbb", "QQQ");
        System.out.println(s7 + "\n"); // aaaQQQccc;

        // сравнение строк s1,s2,s8,s10;
        boolean bl = s1.equals(s10); // true
        boolean bl1 = s1.equals(s8); // false
        System.out.println(bl + "\n" + bl1 + "\n");

        System.out.println(s2.equalsIgnoreCase(s8) + "\n"); // true, сравнение без учета регистра;

        /*Существуют классы Byte, Short, Integer, Long, Char, Boolean:
         * у класов есть методы для перевода числа в строку и обратно */

        // преобразование числа в строку;
        String s11 = Integer.toString(777);
        String s12 = Long.toString(888888888);
        String s13 = Integer.toString(222, 16); // ""
        System.out.println(s13 + "\n"); // метод вернет число 222 в шеснацетыричном представлении "de"

        // преобразование строки в число;
        int c = Integer.parseInt(s11);
        long d = Long.parseLong(s12);
        int f = Integer.parseInt(s13, 16);
        System.out.println(f + "\n" + d + "\n" + c + "\n");

        // приведение типов, используем метод methStr;
        String s14 = "Money = ";
        System.out.println(methStr(s14)+"\n"); // Money = 500$; int = 100 приводит в строку;

    }

    public static String methStr (String s14) {
        int sm = 500;
        char dol = '$';
        return s14+sm+dol;
    }
}