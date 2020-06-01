public class Main {

    public static void main(String[] args) {
        var st = new KlassaStatyczna(1, 5);
        System.out.println("a: " + st.a);
        System.out.println("b: " + st.b);
        System.out.println("sa: " + KlassaStatyczna.sa);
        System.out.println("sb: " + KlassaStatyczna.sb);

        var st2 = new KlassaStatyczna(1);
        System.out.println("a: " + st2.a);
        System.out.println("b: " + st2.b);
        System.out.println("sa: " + KlassaStatyczna.sa);
        System.out.println("sb: " + KlassaStatyczna.sb);
    }
}
