public class Test {
    int a;
    static String s;

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(s);
    }

    public void print(){
        System.out.println(s);
        System.out.println(a);
    }

}
class Test1{
    static Test t = new Test();
    public void check(){
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(Test.s);
    }

    public static void read(){
        System.out.println(Test.s);

        System.out.println(t.a);
    }
}