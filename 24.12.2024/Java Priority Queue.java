import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }

    @Override
    public int compareTo(Student other){
        if (Double.compare(other.cgpa, this.cgpa) != 0){
            return Double.compare(other.cgpa, this.cgpa);
        }else if (!this.name.equals(other.name)){
            return this.name.compareTo(other.name);
        }else{
            return Integer.compare(this.id, other.id);
        }
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> queue=new PriorityQueue<>();

        for (String event : events){
            String[] parts=event.split(" ");
            if (parts[0].equals("ENTER")){
                String name=parts[1];
                double cgpa=Double.parseDouble(parts[2]);
                int id=Integer.parseInt(parts[3]);
                queue.add(new Student(id, name, cgpa));
            }else if (parts[0].equals("SERVED")){
                queue.poll();
            }
        }

        List<Student> result=new ArrayList<>();
        while (!queue.isEmpty()){
            result.add(queue.poll());
        }
        return result;
    }
}

public class Solution{
    private final static Scanner scan=new Scanner(System.in);
    private final static Priorities priorities=new Priorities();

    public static void main(String[] args){
        int totalEvents=Integer.parseInt(scan.nextLine());
        List<String> events=new ArrayList<>();

        while (totalEvents-- != 0){
            String event=scan.nextLine();
            events.add(event);
        }

        List<Student> students=priorities.getStudents(events);

        if (students.isEmpty()){
            System.out.println("EMPTY");
        }else{
            for (Student st : students){
                System.out.println(st.getName());
            }
        }
    }
}
