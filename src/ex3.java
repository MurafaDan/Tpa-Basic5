public class ex3 {
    public static void Ex3() {
        float a=1 ; float b=3 ; float s=0;
        // pentru a afla numarul sirului facem diferenta dintre valaorea finala si initiala si imaprtim la 2
        //  99-3 =96    96/2 = 48 + 1 includem astfel si prima  valoare
        for (int i = 0; i < 49; i++) {
         s += a/b;
         a+=2;
         b+=2;
        }
        System.out.println("Suma sirului este: "+s);
    }
}
