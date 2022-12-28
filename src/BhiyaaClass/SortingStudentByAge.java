package BhiyaaClass;

import BhiyaaClass.Model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SortingStudentByAge {
    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();
        Student student1=new Student("RAJ",21,"ENGLISH",45);
        Student student2=new Student("ETENDRA",19,"MATHS",26);
        Student student3=new Student("SHIVENDRA",73,"IT",66);
        Student student4=new Student("ABHI",13,"CS",56);



        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
// asceding order based on age.....
       List < Student > studentAgeSorting = list.stream()
                .sorted(Comparator.comparingLong(Student::getAge))
               .collect(Collectors.toList()); //ascending order

      //  studentAgeSorting.forEach(System.out::println);
       System.out.println(studentAgeSorting);

        // desending order based on age....
        List < Student > StudentAgeDesending =
                list.stream()
                        .sorted(Comparator.comparingLong(Student::getAge).reversed())
                        .collect(Collectors.toList());

        System.out.println("printing in revererse::"+StudentAgeDesending);





    }
}