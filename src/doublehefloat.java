public class doublehefloat {
    static void main(String[] args) {
        /*新建一个 Java 文件，分别输出：

0.01 * 100
把 0.01 相加 100 次

         */
        System.out.println(0.01*100);
        double sum=0;
        for(int i=0;i<=100;i++){
            sum+=0.01;
        }
        System.out.println(sum);
    }
}
