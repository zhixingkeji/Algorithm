import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//      test1();
//      test2();
//        test5();
        test6();
    }


    public static void test1(){
        System.out.println("请输入通话时间:");
        Scanner scanner = new Scanner(System.in);

        int fenzhong = scanner.nextInt();

        double feiyong = 20.0;
        System.out.println("所需话费是");
        if(fenzhong <= 100) {
            System.out.println(feiyong);
        }else {
            feiyong = 20.0 + 0.15 * (fenzhong -100);
            System.out.println(feiyong);
        }
    }

    public static void test6() {
        System.out.println("请输入等级:");
        Scanner scanner = new Scanner(System.in);

        String math = scanner.next();

        if(math.equals("A")) {
            System.out.println("成绩>=90");
        }else if(math.equals("B")) {
            System.out.println("成绩>=70");
        }else if (math.equals("C")) {
            System.out.println("成绩>=60");
        }else if(math.equals("D")){
            System.out.println("成绩<60");
        }


    }


    public static void test2() {
        System.out.println("请输入成绩:");
        Scanner scanner = new Scanner(System.in);

        float math = scanner.nextFloat();

        if(math >= 90) {
            System.out.println('A');
        }else if(math >=70) {
            System.out.println('B');
        }else if (math >= 60) {
            System.out.println('C');
        }else {
            System.out.println('D');
        }


    }

    public static void test5() {
        System.out.println("请输入汽车的名称:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("请输入汽车的价格:");
//        Scanner scanner = new Scanner(System.in);
        String price = scanner.next();

        System.out.println("请输入汽车的长度:");
//        Scanner scanner = new Scanner(System.in);
        String chang = scanner.next();

        System.out.println("请输入汽车的宽度:");
//        Scanner scanner = new Scanner(System.in);
        String kuan = scanner.next();


        System.out.println("汽车名称是:" + name);
        System.out.println("汽车价格是:" + price);
        System.out.println("汽车长度是:" + chang);
        System.out.println("汽车宽度是:" + kuan);



    }
}
