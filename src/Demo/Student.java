package Demo;

import java.util.*;
public class Student {
    private int id;
    private String name;
    private String gender;
    private double score;
    private Scanner scan = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getScore() {
        return score;
    }

    public void input(){
        System.out.print("Enter id       : ");id = scan.nextInt();
        System.out.print("Enter name     : ");name = scan.next();
        System.out.print("Enter gender   : ");gender = scan.next();
        System.out.print("Enter score    : ");score = scan.nextDouble();
    }

    public void output(){
        System.out.println(
                "Id        : "+id+"\n"+
                "Name      : "+name+"\n"+
                "Gender    : "+gender+"\n"+
                "Score     : "+score
        );
    }

    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int n,op;
        do {
            System.out.print("""
                    1. Input
                    2. Output
                    3. Search
                    4. Update
                    5. Remove
                    """);
            System.out.print("Please choose option : "); op = scan.nextInt();
            switch (op) {
                case 1 ->{
                    System.out.print("Please choose option : "); n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.input();
                        // add to map
                        map.put(i,student);
                    }
                }
                case 2 -> map.forEach((__,student)-> student.output());
                case 3 -> {
                    System.out.print("Enter id for search : ");int val = scan.nextInt();
                    map.forEach((__, student) -> {
                        if (val == student.getId()){
                            student.output();
                        }
                    });
                }
                case 4 -> {
                    System.out.print("Enter id for update : ");int val = scan.nextInt();
                    map.forEach((__, student) -> {
                        if (val == student.getId()){
                            Student stu = new Student();
                            stu.input();
                            // update to map
                            map.replace(__,stu);
                        }
                    });
                }
                case 5 -> {
                    System.out.print("Enter id for remove : ");int val = scan.nextInt();
                    map.entrySet().removeIf((student) -> student.getValue().getId() == val);
                }
            }
        }while (op!=6);
    }
}
