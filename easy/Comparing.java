package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Comparing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(Comparator.naturalOrder());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        int compareGpa = Double.compare(student.cgpa, this.cgpa);
        if (compareGpa != 0) return compareGpa;
        int compareName = this.fname.compareTo(student.fname);
        if (compareName != 0) return compareName;
        return Integer.compare(this.id, student.id);
    }
}
