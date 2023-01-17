package SortingEmplyoee;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
import static java.util.Arrays.asList;

public class Operations {
    public static void main(String[] args) {



        Emplyoee emplyoee1=new Emplyoee("Sita",24,4398.43,"Agra");
        Emplyoee emplyoee2=new Emplyoee("Ram",34,7398.43,"tundla");
        Emplyoee emplyoee3=new Emplyoee("shiv",44,3398.43,"kanpur");
        Emplyoee emplyoee4=new Emplyoee("Sita",34,4398.43,"delhi");

       List<Emplyoee> list= asList(emplyoee1,emplyoee2,emplyoee3,emplyoee4);
        System.out.println(list);

        System.out.println("********************* foreword based on age ********************************");
        list.stream().sorted(Comparator.comparingLong(Emplyoee::getAge)).forEach(System.out::println);
        list.stream().sorted((a1,a2)->(a1.getAge()-a2.getAge())).forEach(System.out::println);

     //  list.stream().sorted(Comparator.comparingLong(Emplyoee::getSalary)).forEach(System.out::println);

        System.out.println("***************** reverse based on age **********************");
        list.stream().sorted(Comparator.comparingLong(Emplyoee::getAge).reversed())
                .forEach(System.out::println);
        System.out.println("********************** m2 **********************************");
        list.stream().sorted((e1,e2)->(e2.getAge()-e1.getAge())).forEach(System.out::println);

        System.out.println("********************* foreword based on salary ********************************");
        list.stream().sorted((e1,e2)->(int) (e1.getSalary()- e2.getSalary())).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("********************* reversed based on salary ********************************");
        list.stream().sorted((e1,e2)->(int) (e2.getSalary()- e1.getSalary())).collect(Collectors.toList()).forEach(System.out::println);


       // comparator concepts..................................................


        // Create Comparators for Name and Salary fields respectively
        System.out.println("***************************************************");
        Comparator<Emplyoee> sortByName = (e1, e2) ->  e1.getName().compareToIgnoreCase(e2.getName());
        Comparator<Emplyoee> sortByAge = (e1, e2) -> Integer.compare(e1.getAge(),e2.getAge());
        Comparator<Emplyoee> sortBySalary = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
        Comparator<Emplyoee> sortByCity = (e1, e2) -> e1.getCity().compareToIgnoreCase(e2.getCity());

        //Sort by Name then Sort by Salary
       list.stream().sorted(sortByName.thenComparing(sortByAge).
                                                                  thenComparing(sortBySalary).
                                                                   thenComparing(sortByCity)).forEach(System.out::println);


        System.out.println("********************** new ******************************");
        list.stream().sorted(sortByName.thenComparing(sortBySalary)).forEach(System.out::println);


    }
}
