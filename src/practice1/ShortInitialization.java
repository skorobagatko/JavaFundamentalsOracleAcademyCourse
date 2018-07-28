package practice1;

public class ShortInitialization {

    public static void main(String[] args) {
        float f = 1.f;
        double d = 1.;
        int i = 1;
        byte b = 1;

        short s1 = 25 + 40;
        short s2 = 2 + (int) 2.;
        short s3 = (short) (i + f);
        short s4 = (short) (s1 + b);
        short s5 = (short) (f + d);
    }

}
