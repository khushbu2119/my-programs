//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // normal approach
        sumClass s = new sumClass();
        System.out.println(s.sum(4, 6));

        // anonymous inner class
        sumInterface s1 = new sumInterface() {

            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(s1.sum(2, 4));

        // lambda
        sumInterface s2 = (a, b) -> a + b;           // lambda internally creates anonymous inner class of functional interface
        System.out.println(s2.sum(3,8));
    }
}

@FunctionalInterface
interface sumInterface {
    int sum(int a, int b);

}

class sumClass implements sumInterface {

    @Override
    public int sum(int a, int b){
        return a + b;
    }
}