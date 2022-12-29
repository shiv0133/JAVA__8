package BhiyaaClass.StudentModelQues;

import BhiyaaClass.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragingANDGroupingBYSub {
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

     Map<String,Double> SubjectWiseAverage= list1.stream()
                .collect(Collectors
                        .groupingBy(Student::getSub,
                                Collectors.averagingInt(Student::getMarks)));
        System.out.println("Average marks::"+SubjectWiseAverage);
}
}
