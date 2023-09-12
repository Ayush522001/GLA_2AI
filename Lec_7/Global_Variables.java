package Lec_7;

public class Global_Variables {
    static int val=100;
    public static void main(String[] args) {
        System.out.println("Hey");
        int x=20;
        fun(12);
        System.out.println(val);
        System.out.println("Hello");
    }
    public static void fun(int x){
//        int val=19;
        val=120;
        System.out.println(val);
//        System.out.println(x);
    }
}
