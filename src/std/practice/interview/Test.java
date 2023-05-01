package std.practice.interview;

public class Test {

    public static void main(String[] args) {
//        Super s = new SubClass();
//        s.foo();

//        box b1 = new box();
//        box b2 = new box();

//        b1.height = 1;
//        b1.weight = 1;

//        b2 = b1;

//        System.out.println(b2.height);

        int xx = 9;

        if (xx == 9) {
//            int x = 8;
            System.out.println(xx);
        }


        String s1 = "yes";
        String s2 = "yes";
        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s3 == s1);
        System.out.println(s1 != s2);

//        int x[] = int[10];

        int a = 5;
        int b = 10;

        a = a ^ b ^ (b = a);

        System.out.println("a : " + a + " | " + " b: " + b);

        System.out.println(8 ^ 8);

        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance1.hashCode());

        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance2.hashCode());

        int x = 10;
        int y = x++;
        int z = ++x;
        int result = x + y + z;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("result: " + result);
    }
}

//class box {
//    int height;
//    int weight;
//}
//
//
//class Super {
//    void foo() {
//        System.out.println("Super");
//    }
//}
//
//class SubClass {
//    static void foo() {
//        System.out.println("SubClass");
//    }
//}