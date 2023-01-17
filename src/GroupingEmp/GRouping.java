package GroupingEmp;

import SortingEmplyoee.Emplyoee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class GRouping {
    public static void main(String[] args) {

        Emplyoee emplyoee1 = new Emplyoee("Sita", 24, 4398.43, "Agra");
        Emplyoee emplyoee2 = new Emplyoee("Ram", 24, 7398.43, "Agra");
        Emplyoee emplyoee3 = new Emplyoee("shiv", 24, 3398.43, "kanpur");
        Emplyoee emplyoee4 = new Emplyoee("Sita", 34, 5398.43, "delhi");


        List<Emplyoee> list = asList(emplyoee1, emplyoee2, emplyoee3, emplyoee4);
        System.out.println(list);

     Map<String, Long> emp= list.stream().collect(Collectors.groupingBy(Emplyoee::getName,Collectors.counting()));


    }}
