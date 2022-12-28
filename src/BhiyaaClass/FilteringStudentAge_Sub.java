package BhiyaaClass;

import BhiyaaClass.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringStudentAge_Sub {
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

        List<Student> ItStudentlist=   list1.stream().
                                        filter(p->p.getSub().equals("IT") && p.getAge()<=19 )
                                       .collect(Collectors.toList());
        System.out.println("It student list::"+ItStudentlist);

        List<Student> Age19Studentlist=   list1.stream().
                                         filter(a->a.getAge()==19).collect(Collectors.toList());
        System.out.println("Age 19 students list::"+Age19Studentlist);
    }
}