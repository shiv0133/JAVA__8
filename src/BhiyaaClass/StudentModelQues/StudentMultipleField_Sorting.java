package BhiyaaClass.StudentModelQues;

import BhiyaaClass.Model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMultipleField_Sorting {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();

        Student student1 = new Student("RAJ", 21, "IT", 45);
        Student student2 = new Student("ETENDRA", 19, "MATHS", 26);
        Student student3 = new Student("SHIVENDRA", 73, "IT", 66);
        Student student4 = new Student("ABHI", 19, "IT", 56);
        Student student5 = new Student("ABHI", 19, "ENGLISH", 56);

        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        // creating comparator..........
        Comparator<Student> sortByName = (e1, e2) ->    e1.getName().compareToIgnoreCase(e2.getName());

        Comparator<Student> sortByAge = (e1, e2) -> Double.compare(e1.getAge(), e2.getAge());

        //Sort by Name then Sort by Salary
        list1.stream()
                .sorted(sortByName.thenComparing(sortByAge))
                .forEach(e->System.out.println(e));

        System.out.println("\nSort list of book objects by name then by age then by marks");
        Comparator<Student> sortByName1 = (b1, b2) -> b1.getName().
                                             compareToIgnoreCase(b2.getName());

        Comparator<Student> sortByAge1 = (b1, b2) -> Double.compare(b1.getAge(), b2.getAge());


        Comparator<Student> sortByMarks = (b1, b2) -> Double.compare(b1.getMarks(), b2.getMarks());

        //Sort by Name then Sort by Author then sort by Cost
        list1.stream()
                .sorted(
                        sortByName1
                                .thenComparing(sortByAge1)
                                .thenComparing(sortByMarks))
                                .forEach(
                                        book-> System.out.println(list1));

    }
}