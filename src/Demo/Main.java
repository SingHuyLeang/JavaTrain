package Demo;
import java.util.*;
public class Main {
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
                    list.sort((stu1,stu2)-> stu1.getId());
                }
            }
        }while (op!=9);
    }
}
