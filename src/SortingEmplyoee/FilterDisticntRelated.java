package SortingEmplyoee;



import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class FilterDisticntRelated {
    public static void main(String[] args) {

        Emplyoee emplyoee1 = new Emplyoee("Sita", 24, 4398.43, "Agra");
        Emplyoee emplyoee2 = new Emplyoee("Ram", 34, 7398.43, "tundla");
        Emplyoee emplyoee3 = new Emplyoee("shiv", 44, 3398.43, "kanpur");
        Emplyoee emplyoee4 = new Emplyoee("Sita", 34, 4398.43, "delhi");

        List<Emplyoee> list = asList(emplyoee1, emplyoee2, emplyoee3, emplyoee4);
        System.out.println(list);

        list.stream().map(Emplyoee::getCity).distinct().forEach(System.out::println);

        list.stream().filter(a->a.getAge()>34 && a.city.equals("delhi")).forEach(System.out::println);

        Double avg= list.stream().collect(Collectors.averagingDouble(Emplyoee::getSalary));
        System.out.println(avg);

       double Avg= list.stream().filter(a->a.name.equals("sita")).
                collect(Collectors.averagingDouble(Emplyoee::getAge));
        System.out.println(Avg);

      Map<String,List<Emplyoee>> listnew= list.stream().collect(Collectors.groupingBy(Emplyoee::getName));
        System.out.println(listnew);

      Map<String,List<Emplyoee>> listMap=  list.stream().collect(Collectors.groupingBy(Emplyoee::getCity));
        System.out.println(listMap);
    }
}