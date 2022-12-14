package BhiyaaClass;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateFinding {
    public static void main(String[] args) {

        // 1. list of Strings
        List<String> companies = new ArrayList<String>();


        // 1.1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate
        companies.add("Apple"); // duplicate

        System.out.println("********* Original Company List *****************");
        companies.forEach(System.out::println);

        System.out.println("*********** using distinct ********************");
        List<String> companies1=companies.stream().distinct().collect(Collectors.toList());
        companies1.forEach(System.out::println);

        System.out.println("********* using filter & frequency ************************");
        List<String> duplicateCompanies1 =  companies
                                                       .stream()
                                                        .filter(company -> Collections
                                                                        .frequency
                                                                                (companies, company) > 2)
                                                        .collect(Collectors.toList());

        duplicateCompanies1.forEach(System.out::println);


        System.out.println("*************************************************");

        List<String> companies2 = new ArrayList<String>();


        // 1.1 add string elements to List
        companies2.add("Meta");
        companies2.add("Apple");
        companies2.add("Amazon");
        companies2.add("Netflix");
        companies2.add("Meta"); // duplicate
        companies2.add("Google");
        companies2.add("Apple"); // duplicate
        companies2.add("Apple"); // duplicate
        companies2.add("Apple"); // duplicate

      List<String>   company=companies2.stream().distinct().collect(Collectors.toList());
      company.forEach(System.out::println);
        System.out.println("=================================================");
       List <String> compqny1=companies2.
                           stream().
                           filter(c-> Collections.frequency(companies2,c)>3)
                           .collect(Collectors.toList());
              compqny1.forEach(System.out::println);
    }
}
