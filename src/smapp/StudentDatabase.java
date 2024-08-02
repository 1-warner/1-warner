// StudentDatabase.java
package smapp;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {
    private Map<Integer, Student> students;

    public StudentDatabase() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNumber(), student);
    }

    public Student searchStudent(int studentNumber) {
        return students.get(studentNumber);
    }
}