public class KlassaStatyczna {
    public int a;
    public int b;

    public static int sa;
    public static int sb;

    public KlassaStatyczna(int a) {
        this.a = a;
    }

    public KlassaStatyczna(int a, int b) {
        this(a);
        this.b = b;
    }

    static {
        sa = 5;
        sb = 15;
    }
}
