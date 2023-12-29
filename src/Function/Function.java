package Function;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Function {
    public static void main(String[] args) {
        Function fun = new Function();
        fun.simple();
        System.out.println(fun.date());
    }
    public void simple(){
        System.out.println("សូរស្ដីពិភពលោក");
    }
    public String date(){
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd MMM yyyy");
        return df.format(d);
    }
}
