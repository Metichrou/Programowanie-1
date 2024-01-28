public class Main {
    public static int kolejna (int ni) {
        if (ni%2==0){
            ni/=2;
            System.out.print(", parzysta, ");
        }
        else {
            ni=ni*3+1;
            System.out.print(", nieparzysta, ");
        }
        return ni;
    }
    public static void main(String[] args) {
        int n;
        if (args.length > 0) {
            String strNumber = args[0];
            try {
                n = Integer.parseInt(strNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: Proszę wprowadzić poprawną liczbę.");
                return;
            }
        } else {
            System.out.println("Error: Wprowadź argumenty wraz z wywołaniem programu");
            return;
        } 
        if (n<=0) {
            System.out.println("Wprowadz liczbe dodatnia");
            return;
        }

        for (int i=1;i<1001;i++) {
        if (n ==1) {
            System.out.println("kolejna liczba to 1,zakończono liczenie");
            return;
        }
        if (n%2==0) {
            
        }
        System.out.print(n);
        n=kolejna(n);
        System.out.print(n+"\n");
    }
    }


}
