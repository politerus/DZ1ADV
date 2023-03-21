package Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Кішка");
        list.add("Пес");
        list.add("Папуга");
        list.add("Слон");
        list.add("Носоріг");
        list.add("Жираф");
        list.add("Крокодил");
        list.add("Ластівка");
        list.add("Пацюк");
        list.add("Свиня");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
  /*     Вывод на экран элементов List: Создать список,
        заполнить его на 10 элементов и вывести
         на экран содержимое используя iterator. */