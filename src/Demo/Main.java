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
            }
        }while (op!=9);
    }
}
