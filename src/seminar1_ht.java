

/*
 * 1)
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

// import java.util.Scanner;
// public class seminar1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("Введите число: \n");
//         var number = sc.nextLine();
//         int num = Integer.parseInt(number);
//         int count = 1;
//         int sum = 0;
//         int product = 1;
//         while (count<=num) {
//             sum = sum + count;
//             product = product*count;
//             count++;
//         }

//         System.out.printf("%d-е треугольное число = %d \n", num, sum);
//         System.out.printf("%d! = %d", num, product);
//     }
// }
/*
 * 2)
 * Вывести все простые числа от 1 до 1000
 */
//import java.math.BigInteger;
// public class seminar1 {
//     public static void main(String[] args) {
//         System.out.println("Простые числа от 1 до 1000: \n");
//         for (int i = 1; i < 1001; i++) {
//             BigInteger integr = BigInteger.valueOf(i);
//             if (integr.isProbablePrime(i)){
//                 System.out.printf("%d \n", i);
//             }
//         }
//     }
// }
/*
 * 3)
 * Реализовать простой калькулятор
 */
// import java.util.Scanner;

// public class seminar1 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Введите первое число:\n");
//     String numOne=sc.nextLine();
//     int nOne=Integer.parseInt(numOne);
//     System.out.println("Введите знак операции, которую хотите совершить (+ - * /):\n");
//     String operand=sc.nextLine();
//     System.out.println("Введите второе число:\n");
//     String numTwo=sc.nextLine();
//     int nTwo=Integer.parseInt(numTwo);
//     switch (operand) {
//         case "+":
//             System.out.printf("%d + %d = %d", nOne, nTwo, nOne+nTwo);
//             break;
//         case "-":
//             System.out.printf("%d - %d = %d", nOne, nTwo, nOne-nTwo);
//             break;
//         case "*":
//             System.out.printf("%d * %d = %d", nOne, nTwo, nOne*nTwo);
//             break;
//         case "/":
//             System.out.printf("%d / %d = %d", nOne, nTwo, nOne/nTwo);
//             break;
//         default:
//             System.out.println("Вы соврешили некорректный ввод!");
//             break;
//     }
//     // System.out.printf("%s\n%s\n%s", numOne, operand, numTwo);
//     }
// }
/*
 * 4)
 * *+Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства.
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */
// import java.util.Scanner;

// public class seminar1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Введите число q, большее или равное 0 (одну цифру нужно заменить знаком вопроса):\n");
//         var q = sc.nextLine();
//         System.out.println("Введите число w, большее или равное 0 (одну цифру нужно заменить знаком вопроса):\n");
//         var w = sc.nextLine();
//         System.out.println("Введите число e:\n");
//         var e = sc.nextLine();
//         int convertedE = Integer.parseInt(e);
//         int indexInQ = q.indexOf("?");
//         int indexInW = w.indexOf("?");
//         if (indexInQ < indexInW) {
//             int newQ = Integer.parseInt(q.replace('?', w.charAt(indexInQ)));
//             int recoveredW = convertedE - newQ;
//             System.out.printf("Восстановленное уравнение: %d + %d = %d", newQ, recoveredW, convertedE);
//         } else if (indexInQ > indexInW) {
//             int newW = Integer.parseInt(w.replace('?', q.charAt(indexInW)));
//             int recoveredQ = convertedE - newW;
//             System.out.printf("Восстановленное уравнение: %d + %d = %d", recoveredQ, newW, convertedE);
//         } else if (q.length() == w.length() && indexInQ == indexInW) {
//             int newQ = Integer.parseInt(q.replace('?', '1'));
//             int recoveredW = convertedE - newQ;
//             System.out.printf("Восстановленное уравнение: %d + %d = %d", newQ, recoveredW, convertedE);
//         } else {
//             System.out.println("Решений нет");
//         }

//     }
// }