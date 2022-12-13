package BhiyaaClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElements {
    public static void main(String[] args) {
        List<Integer> companies = Arrays.asList(1,2,3,4,5,8,6,23,44,2);

        List<Integer> sort=companies.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("************** natural order ************************");
        sort.forEach(System.out::println);

        List<Integer> sort1=companies.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("************** opposite  order ************************");
        sort1.forEach(System.out::println);

    }
}
