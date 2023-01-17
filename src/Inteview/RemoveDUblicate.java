package Inteview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDUblicate {
    public static void main(String[] args) {
        List<Integer> strList1 = Arrays.asList(134, 1, 43, 1, 123, 12);

        System.out.println("********** here we remove all dublicate **********************************");
        strList1.stream().filter(a->Collections.frequency(strList1,a)<2).forEach(System.out::println);

        System.out.println("***************** here only dublicates **********************");
        strList1.stream().filter(a->Collections.frequency(strList1,a)>=2).forEach(System.out::println);

        System.out.println("****************** sorting *********************************");
        strList1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        System.out.println("************** sorting reverse *********************************************");
        strList1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("************ only odd ************************************");
        strList1.stream().filter(a->a%2!=0).forEach(System.out::println);

        System.out.println("************ only even ************************************");
        strList1.stream().filter(a->a%2==0).forEach(System.out::println);
    }
}
