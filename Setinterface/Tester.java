package Setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {

	public static Set<student> findUnique(List<student> students) {
        Set<student> uniqueStudents = new HashSet<student>();
        Set<String> emailIds = new HashSet<String>();
        for (student student : students) {
            if (!emailIds.contains(student.getEmailId())) {
                uniqueStudents.add(student);
                emailIds.add(student.getEmailId());
            }
        }
        return uniqueStudents;
    }

    public static Set<student> findDuplicates(List<student> students) {
        Set<student> duplicateStudents = new HashSet<student>();
        Set<String> emailIds = new HashSet<String>();
        for (student student : students) {
            if (emailIds.contains(student.getEmailId())) {
                duplicateStudents.add(student);
            } else {
                emailIds.add(student.getEmailId());
            }
        }
        return duplicateStudents;
    }

    public static void main(String[] args) {
        List<student> students = new ArrayList<student>();

        students.add(new student(5004, "Wyatt", "Wyatt@example.com", "Dance"));
        students.add(new student(5010, "Lucy", "Lucy@example.com", "Dance"));
        students.add(new student(5550, "Aaron", "Aaron@example.com", "Dance"));
        students.add(new student(5560, "Ruby", "Ruby@example.com", "Dance"));
        students.add(new student(5013, "Clara", "Clara@example.com", "Music"));
        students.add(new student(5015, "Sophie", "Sophie@example.com", "Music"));
        students.add(new student(5011, "Ivan", "Ivan@example.com", "Music"));
        students.add(new student(4556, "Ben", "Ben@example.com", "Music"));
        students.add(new student(3656, "John", "John@example.com", "Music"));
        students.add(new student(6543, "Sam", "Sam@example.com", "Music"));
        students.add(new student(455, "Ben", "Ben@example.com", "Dance"));

        System.out.println("Unique students:");
        Set<student> uniqueStudents = findUnique(students);
        for (student student : uniqueStudents) {
            System.out.println(student);
        }

        System.out.println("\nDuplicate students:");
        Set<student> duplicateStudents = findDuplicates(students);
        for (student student : duplicateStudents) {
            System.out.println(student);
        }
    }

}