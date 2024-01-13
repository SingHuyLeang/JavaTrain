package Demo;

import java.util.*;

public class Student{
    int id;
    String name;
    String gender;
    double score1,score2,score3,score4,score5;
    Scanner scan = new Scanner(System.in);

    public Student(int id, String name, String gender, double score1, double score2, double score3, double score4, double score5) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public double getScore4() {
        return score4;
    }

    public double getScore5() {
        return score5;
    }

    public void input(){
        System.out.print("បំពេញ លេខរៀង   : "); id = scan.nextInt(); scan.nextLine();
        System.out.print("បំពេញ ឈ្មោះ     : "); name = scan.nextLine();
        System.out.print("បំពេញ ភេទ       : "); gender = scan.next();
        System.out.print("បំពេញ ពិន្ទុ ខ្មែរ    : "); score1 = scan.nextDouble();
        System.out.print("បំពេញ ពិន្ទុ គណិត  : "); score2 = scan.nextDouble();
        System.out.print("បំពេញ ពិន្ទុ រូប     : "); score3 = scan.nextDouble();
        System.out.print("បំពេញ ពិន្ទុ គីមី    : "); score4 = scan.nextDouble();
        System.out.print("បំពេញ ពិន្ទុ ជីវៈ    : "); score5 = scan.nextDouble();
    }
    public double total(){
        return score1 + score2 + score3 + score4 + score5 ;
    }

    public double average(){
        return total() / 5;
    }
    public String grade(){
        return (average() < 50 )? "F"
               : (average() >= 50 && average() < 60) ? "E"
               : (average() >= 60 && average() < 70) ? "D"
               : (average() >= 70 && average() < 80) ? "C"
               : (average() >= 80 && average() < 90) ? "B"
               : "A";
    }
    public  void  output(){
        System.out.println(
                "\t"+id+
                "\t"+name+
                "\t"+gender+
                "\t"+score1+
                "\t"+score2+
                "\t"+score3+
                "\t"+score4+
                "\t"+score5+
                "\t"+total()+
                "\t"+average()+
                "\t"+grade()
        );
    }
    static public void title(){
        System.out.println("\tល.រ\tឈ្មោះ\tភេទ\tខ្មែរ\tគណិត\tរូប\tគីមី\tជីវៈ\tពិន្ទុសរុប\tមធ្យមភាគ\tនិទ្ទេស");
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student;
        Scanner scan = new Scanner(System.in);

        int n,op;
        do {
            System.out.print("""
                    ១. បញ្ចូល និង បន្ថែមទិន្នន័យ
                    ២. បង្ហាញទិន្នន័យ
                    ៣. ស្វែងរកទិន្នន័យ
                    ៤. កែប្រែទិន្នន័យ
                    ៥. លុបទិន្នន័យ
                    ៦. សៀតទិន្នន័យ
                    ៧. តម្រៀបទិន្នន័យ
                    ៨. សម្អាតរាល់ទិន្នន័យ
                    ៩. ចាកចេញ
                    """);
            System.out.print("សូមជ្រើសរើសមីនុយ ៖ "); op = scan.nextInt();
            switch (op){
                case 1->{
                    System.out.print("បញ្ចូលចំនួនសិស្ស ៖ "); n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        student = new Student();
                        student.input();
                        list.add(student);
                    }
                }
                case 2-> {
                    Student.title();
                    list.forEach(Student::output);
                }
                case 3-> {
                    int val;
                    final boolean[] check = {false};
                    boolean isFound[] = {false};
                    System.out.print("សូមបញ្ចូលលេខរៀងដើម្បីស្វែងរក ៖ "); val = scan.nextInt();
                    list.forEach((stu)->{
                        if (val == stu.getId()){
                            if (check[0] == false) Student.title();
                            stu.output();
                            check[0] = true;
                            isFound[0] = true;
                        }
                    });
                    if (isFound[0]) {
                        System.out.println("ស្វែងរកឃើញ");
                    }else{
                        System.err.println("ស្វែងរកមិនឃើញ");
                    }
                }
                case 4-> {
                    int val;
                    boolean isFound[] = {false};
                    System.out.print("សូមបញ្ចូលលេខរៀងដើម្បីស្វែងរកទិន្នន័យសម្រាប់កែប្រែ ៖ "); val = scan.nextInt();
                    list.forEach((stu)->{
                        if (val == stu.getId()){
                            stu.input();
                            isFound[0] = true;
                        }
                    });
                    if (isFound[0]) {
                        System.out.println("កែប្រែបានដោយជោគជ័យ");
                    }else{
                        System.err.println("ស្វែងរកមិនឃើញ");
                    }
                }
                case 5-> {
                    // RemoveIf
                    int val;
                    boolean isFound = false;
                    System.out.print("សូមបញ្ចូលលេខរៀងដើម្បីស្វែងរកទិន្នន័យសម្រាប់លុប ៖ "); val = scan.nextInt();
                    isFound = list.removeIf((stu)-> stu.getId() == val);
                    if (isFound) {
                        System.out.println("លុបបានដោយជោគជ័យ");
                    }else{
                        System.err.println("ស្វែងរកមិនឃើញ");
                    }
                }
                case 6-> {
                    // list.add(index,element) -> specific index
//                   // list.add(element) -> append data
                    int val;
                    boolean isFound = false;
                    System.out.print("សូមបញ្ចូលលេខរៀងដើម្បីស្វែងរកទិន្នន័យសម្រាប់បញ្ចូល ៖ "); val = scan.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getId() == val){
                            student = new Student();
                            student.input();
                            list.add(i,student);

                            break;
                        }
                    }
                    if (isFound) {
                        System.out.println("បញ្ចូលបានដោយជោគជ័យ");
                    }else{
                        System.err.println("ស្វែងរកមិនឃើញ");
                    }
                }
                case 7-> {
                    Collections.sort(list,Comparator.comparing(Student::getId));
                }
            }
        }while (op!=9);
    }
}
