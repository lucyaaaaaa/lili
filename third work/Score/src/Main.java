import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stu = new Scanner(System.in);
        System.out.println("请输入成绩");
        try {
            int score = stu.nextInt();
            stu.close();
            if(score<0||score>100){
                throw new Exception();
            }else System.out.println("成绩为："+score);
        }catch(Exception e) {
            System.out.println("输入的成绩不在规定范围内");
        }
    }
}