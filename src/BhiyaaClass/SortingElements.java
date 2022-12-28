package BhiyaaClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElements {
    public static void main(String[] args) {
        List<Integer> companies1 = Arrays.asList(1,2,3,4,5,8,6,23,44,2);
        System.out.println(companies1);

        List<Integer> sort=companies1.stream().
                sorted(Comparator.naturalOrder()).
                collect(Collectors.toList());
        System.out.println("************** natural order ************************");
        sort.forEach(System.out::println);

        List<Integer> sort1=companies1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("************** opposite  order ************************");
        sort1.forEach(System.out::println);

        List<String> companies2 = Arrays.asList("raj","meena","radha","mukesh","poonam");
        System.out.println(companies2);
        List<String> list1=companies2.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("************natural order for list 1**************");
        list1.forEach(System.out::println);

        List<String> list2=companies2.stream().
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("*************reverse order for list 2*********************");
        list2.forEach(System.out::println);

    }
}
