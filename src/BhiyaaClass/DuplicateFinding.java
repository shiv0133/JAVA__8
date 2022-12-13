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

        List<String> companies1=companies.stream().distinct().collect(Collectors.toList());
        System.out.println("*********** using distinct ********************");
        companies1.forEach(System.out::println);

        Set<String> duplicateCompanies = companies
                .stream()
                .filter(company -> Collections.frequency(companies, company) > 2)
                .collect(Collectors.toSet());
        System.out.println("********* using filter & frequency ************************");
        duplicateCompanies.forEach(System.out::println);
    }
}
