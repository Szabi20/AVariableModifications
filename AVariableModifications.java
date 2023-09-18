public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        int avaltoz =a+7;
        System.out.println(avaltoz);
        // increase the value of variable "a" by 10 and print the new value


        int b = 100;
        int bvaltoz=b-7;
        System.out.println(bvaltoz);
        // decrease the value of b by 7 and print the new value


        int c = 44;
        int cvaltoz=c+c;
        System.out.println(cvaltoz);
        // double the value of c and print the new value


        int d = 125;
        int dvaltoz=d/5;
        System.out.println(dvaltoz);
        // divide the value of d by 5 and print the new value


        int e = 8;
        int eszamit=e/4;
        System.out.println(eszamit);
        // cube the value of e and print the new value


        int f1 = 123;
        int f2 = 345;
        if(f1>f2){
            boolean igaz=true;
             System.out.println(igaz);

        }else{
            boolean hamis=false;
            System.out.println(hamis);
        }
        // determine if f1 is greater than f2 (print as a boolean)


        int g1 = 350;
        int g2 = 200;

        int nagyob=g2*2;
        if(g1==nagyob){
            boolean igaz=true;
             System.out.println(igaz);

        }else{
            boolean hamis=false;
            System.out.println(hamis);
        }
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)


        int h = 135798745;
        if(h%11==0){
             boolean igaz=true;
             System.out.println(igaz);
        }else{
            boolean hamis=false;
            System.out.println(hamis);
        }
        // determine if h has 11 as a divisor (print as a boolean)


        int i1 = 10;
        int i2 = 3;

        int szamolas=(i1*4);
        int szamolas2=(i2*4);
         int szamolas11=(i1*3);
        int szamolas12=(i2*3);
        if(szamolas>szamolas2){
            boolean igaz=true;
             System.out.println("i1 nagyobb mint i2"+igaz);
        }else{
             boolean hamis=false;
            System.out.println(hamis);
        }
         if(szamolas11<szamolas12){
            boolean igaz=true;
             System.out.println("i1 kisebb"+igaz);
        }else{
             boolean hamis=false;
            System.out.println("i1 nagyobb kocka"+hamis);
        }
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)


        int j = 1521;

        if(j%3==0&&j%5==0){
             boolean igaz=true;
             System.out.println(igaz);
        }else{
            boolean hamis=false;
            System.out.println(hamis);
        }
        // determine if j is divisible by 3 or 5 (print as a boolean)


    }
}
