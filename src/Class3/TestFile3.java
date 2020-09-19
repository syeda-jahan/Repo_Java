package Class3;

public class TestFile3 {
    public static void main(String[] args) {
        /**
         * F -> C
         *
         * F -> K
         *
         * K -> C
         *
         * K -> F
         *
         * C -> F
         *
         * C -> K
         */

        double fTemp = 100.00 ; // cT = (fT - 32) × 5/9
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " deg F = " + cTemp + " deg C.");

        double fTemp1 = 100.00 ; // T(K) = (T(°F) + 459.67)× 5/9
        double kTemp = ((fTemp1+459.67) * 5/9);
        System.out.println(fTemp1 +" deg F = " + kTemp + " deg K.");

        double kTemp2 = 500.00 ; // T(°C) = T(K) - 273.15
        double cTemp2 = ( kTemp2 - 273.15);
        System.out.println( kTemp2 + " deg K = " + cTemp2 + " deg C.");

        double kTemp3 = 500.00 ; // T(°F) = T(K) × 9/5 - 459.67
        double fTemp2 = ( (kTemp3 * 9/5 ) - 459.67 );
        System.out.println( kTemp3 + " deg K = " + fTemp2 + " deg F.");

        double cTemp3 = 50.00 ; // T(°F) = T(°C) × 9/5 + 32
        double fTemp3 = ((cTemp3 * 9/5) + 32 );
        System.out.println( cTemp3 + " deg C = " + fTemp3 + " deg F.");

        double cTemp4 = 50.00 ; // T(K) = T(°C) + 273.15
        double kTemp4 = cTemp4 + 273.15;
        System.out.println ( cTemp4 + " deg C = " + kTemp4 + " deg K.");

















    }

}
