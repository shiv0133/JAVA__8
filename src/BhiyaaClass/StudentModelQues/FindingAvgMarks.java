package BhiyaaClass.StudentModelQues;

import BhiyaaClass.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingAvgMarks {
    public static void main(String[] args) {


        List<Student> list1 = new ArrayList<>();

        Student student1 = new Student("RAJ", 21, "IT", 45);
        Student student2 = new Student("ETENDRA", 19, "MATHS", 26);
        Student student3 = new Student("SHIVENDRA", 73, "IT", 66);
        Student student4 = new Student("ABHI", 19, "IT", 56);

        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
// average with filtering......
        Double AvgMarks =list1.stream().filter(s->s.getSub().equals("IT"))
                .collect(Collectors.averagingDouble(Student::getMarks));

        System.out.println("Average marks of student::"+AvgMarks);

    // average with out filtering................

        Double AvgMarkswithOutFilter =list1.stream().
                       collect(Collectors.averagingDouble(Student::getMarks));

        System.out.println("Average marks of student with out filter::"+AvgMarkswithOutFilter);

    }
}