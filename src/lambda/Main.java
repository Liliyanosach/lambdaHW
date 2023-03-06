package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /*
     *Напишите реализации функционального интерфейса Predicate, которые проверяют, является ли число положительным.
     * Если число положительное, то предикат должен возвращать true, в противном случае — false
     */
    public static void task1() {
        System.out.println("Задача 1");
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 0) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(predicate.test(-5));
        System.out.println(predicate.test(5));



    }

    /*
     * Создайте функциональный интерфейс Consumer, который принимает на вход имя человека и выводит в консоль приветствие в его адрес.
     */
    public static void task2() {
        System.out.println("Задача 2");

        Consumer<Name> consumer = new Consumer<Name>() {
            @Override
            public void accept(Name name) {
                System.out.println("Hi! " + name.getName());
            }
        };
        consumer.accept(new Name("Liliya"));

        Consumer<Name> consumer1 = name ->System.out.println("Hi! " + name.getName());
        consumer1.accept(new Name("Zlata"));

    }

    /*
     * Реализуйте функциональный интерфейс Function, который принимает на вход вещественное число типа Double, а возвращает
     * его округленный вариант типа Long.
     */
    public static void task3() {
        System.out.println("Задача 3");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double a) {
                return Math.round(a);
            }
        };

        System.out.println(function.apply(3.5));

        Function<Double, Long> function1 = d -> Math.round(d);
        System.out.println(function1.apply(5.7));
    }
}
