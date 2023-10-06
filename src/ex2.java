public class ex2 {
    public static void ex2(){

        int index = 0;

        for (int i = 100; i <1000 ; i++) {

            if(i%5==0 || i%6==0){
                System.out.print(" "+i);
                index++;
            }
        if (index % 10 == 0)
            System.out.println();
        }
    }
}
