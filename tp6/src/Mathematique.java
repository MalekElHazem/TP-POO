public class Mathematique {
    public static class ParametreNullException extends Exception {
        public ParametreNullException (String msg){
            super(msg);
        }
    }
    public static class NegatifException extends Exception {
        public NegatifException (String msg){
            super(msg);
        }
    }

    static double f(double n, double x) throws ParametreNullException , NegatifException{
        if (n == 0){
            throw new ParametreNullException("n = 0");
        }
        if (x < 0){
            throw new NegatifException("n negatif");
        }
        return Math.sqrt(x)/n;
    }
    public static void main(String[] args) {
        try {
            double n = Double.parseDouble(args[0]);
            double x = Double.parseDouble(args[1]);
            System.out.println(f(n, x));

        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("exeption out of bound");
        }catch (NumberFormatException n){
            System.out.println("exeption number format");
        }catch (ParametreNullException y){
            System.out.println(y.getMessage());
        }catch (NegatifException e){
            System.out.println(e.getMessage());
        }/*catch (ArithmeticException s){
            s.printStackTrace();
            System.out.println("exeption number ");
        }*/finally {
            System.out.println("« bloc finally exécuté quel que soit le résultat d’exécution»");
        }
    }
}
