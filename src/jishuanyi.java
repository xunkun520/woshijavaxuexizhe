import java.util.Scanner;

public class jishuanyi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个，第二个数字：");
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        char op = scanner.next().charAt(0);

        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            if (b != 0) {
                System.out.println(a + " / " + b + " = " + (a / b));
            } else {
                System.out.println("除数不能为0");
            }
        } else {
            System.out.println("输入的操作符无效");
        }
    }
}

