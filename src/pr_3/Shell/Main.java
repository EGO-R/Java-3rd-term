package pr_3.Shell;

public class Main {
    public static void main(String[] args) {
        Double D = Double.valueOf(1.5);

        String str = "135.6";
        double d_from_str = Double.parseDouble(str);

        double d_from_D = D;
        float f_from_D = D.floatValue();
        int i_from_D = D.intValue();
        long l_from_D = D.longValue();
        short s_from_D = D.shortValue();
        byte b_from_D = D.byteValue();

        System.out.println(D);

        String d = Double.toString(d_from_D);
    }
}
