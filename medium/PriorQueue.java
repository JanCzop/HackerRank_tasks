package medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Priorities{
    private final List<Student> students = new ArrayList<>();
    private static final Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int cgpa = Double.compare(s1.getCgpa(),s2.getCgpa());
            if(cgpa != 0) return cgpa;

            int name_comparison = s1.getName().compareTo(s2.getName());
            if(name_comparison != 0) return name_comparison;

            return Integer.compare(s1.getId(),s2.getId());
        }
    };


    public List<Student> getStudents(List<String> events){
        for(String event : events){
            String[] splitted_event = event.split(" ");
            if(splitted_event[0].equals("ENTER")){
            String name = splitted_event[1];
            double cgpa = Double.parseDouble(splitted_event[2]);
            int id = Integer.parseInt(splitted_event[3]);
            Student student = new Student(id,name,cgpa);
            insert(student);
            }
            else if(splitted_event[0].equals("SERVED")) serve();
        }
        return students;
    }
    private void insert(Student student){
        int index = 0;
        while(index < students.size() && comparator.compare(students.get(index),student) < 0){
            index++;
        }
        students.add(index,student);

    }
    private void serve(){
        if(!students.isEmpty()) students.remove(0);
    }
}
class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
public class PriorQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
