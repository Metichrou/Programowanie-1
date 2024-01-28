public class Main {
    public static int silnia(int x) {
        int silnia=1;
        for (int i=1;i<=x;i++) {
            silnia=silnia*i;
        }
        return silnia;
    }
    public static int liczba(int n) {
        int liczba=-1;
        for (int j = 3; j <= n; j++) {
            liczba += (int) (silnia(j - 2) - j * Math.floor((double) silnia(j - 2) / j));
        }

        return liczba;
    }

    public static void main(String[] args) {
        int n;
        if (args.length > 0) {
            String strNumber = args[0];
            try {
                n = Integer.parseInt(strNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: Wprowadzony argument nie jest liczbą, proszę wprowadzić poprawną liczbę");
                return;
            }
        } else {
            System.out.println("Wprowadź argumenty wraz z wywołaniem programu");
            return;
        }
            if(n<=3) {
                System.out.println("Wprowadz liczbe wieksza od 3");
                return;
            }
            System.out.println(liczba(n));
        }
    }
