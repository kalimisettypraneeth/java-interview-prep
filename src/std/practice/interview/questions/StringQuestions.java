package std.practice.interview.questions;

public class StringQuestions {

    public static void main(String[] args) {

        String str1 = "Sai";
        String str2 = "Sai";
        String str3 = new String("Sai");
        String str4 = str1;
        String str5 = new String("Sai");

        System.out.print("str1 == str2 ");
        System.out.println(str1 == str2);

        System.out.print("str2 == str1 ");
        System.out.println(str2 == str1);

        System.out.print("str1 == str3 ");
        System.out.println(str1 == str3);

        System.out.print("str1 == str4 ");
        System.out.println(str1 == str4);

        System.out.print("str3 == str5 ");
        System.out.println(str3 == str5);

        System.out.print("str1.equals(str2) ");
        System.out.println(str1.equals(str2));

        System.out.print("str2.equals(str1) ");
        System.out.println(str2.equals(str1));

        System.out.print("str1.equals(str3) ");
        System.out.println(str1.equals(str3));

        System.out.print("str1.equals(str4) ");
        System.out.println(str1.equals(str4));

        System.out.print("str3.equals(str5) ");
        System.out.println(str3.equals(str5));

        System.out.print("str1.toString().equals(str3.toString()) ");
        System.out.println(str1.toString().equals(str3.toString()));

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        System.out.println(sb.equals(s));
        System.out.println(sb.toString().equals(s.toString()));
//        System.out.println(sb == s);
    }
}
