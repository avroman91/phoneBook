package phoneBook.ua.ithillel.utils;


import phoneBook.ua.ithillel.contactService.Contact;
import phoneBook.ua.ithillel.contactService.ContactList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ListUtils {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3};
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> even = Arrays.asList(2,4,6,8,10,12);


        forEach(arr, elem -> System.out.println(elem * elem));

        System.out.println(anyMatch(list, i -> i % 2 == 0));
        System.out.println(allMatch(even, i -> i % 2 == 0));

        Integer sum = reduce(list, 1, Integer::sum);
        System.out.println("Sum = " + sum);

        List<String> reMapped = map(list, Object::toString);
        System.out.println(reMapped);

    }

    public static <T> void forEach(T[] arr, Consumer<T> elemProcessor) {
        for (T items : arr) {
            elemProcessor.accept(items);
        }
    }

    public static Contact filter(ContactList contactList, Predicate<Contact> predicate) {
        for (int i = 0; i < contactList.size(); i++) {
            if(predicate.test(contactList.get(i))){
                return contactList.get(i);
            };
        }
        return null;
    }

    public static <T, R> R reduce(List<T> list, R initValue, BiFunction<R, T, R> f) {

        for (T elem : list) {
            initValue = f.apply(initValue, elem);
        }
        return initValue;
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }

    public static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        for (T items : list) {
            if (predicate.test(items)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T items : list) {
            if (!predicate.test(items)) {
                return false;
            }
        }
        return true;
    }
}