public class Main {
    int i = 3;

    public void foo() {
        System.out.println(i);
        ++<caret>i;
    }
}