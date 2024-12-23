import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa){
        this.id=id;
        this.fname=fname;
        this.cgpa=cgpa;
    }

    public int getId(){
        return id;
    }

    public String getFname(){
        return fname;
    }

    public double getCgpa(){
        return cgpa;
    }
}

public class Solution{
    public static void main(String[] args){
        Comparator<Student> stu=new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0){
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                } else if (!s1.getFname().equals(s2.getFname())){
                    return s1.getFname().compareTo(s2.getFname());
                } else{
                    return Integer.compare(s1.getId(), s2.getId());
                }
            }
        };

        Scanner in=new Scanner(System.in);
        int testCases=Integer.parseInt(in.nextLine());

        List<Student> studentList=new ArrayList<>();
        while (testCases > 0){
            int id=in.nextInt();
            String fname=in.next();
            double cgpa=in.nextDouble();

            Student st=new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, stu);

        for (Student st : studentList){
            System.out.println(st.getFname());
        }
    }
}
