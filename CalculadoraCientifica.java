public class CalculadoraCientifica {
    public double raiz(int int1){
        return Math.sqrt (int1);
    }

    public double raiz(double d1){
        return Math.sqrt (d1);
    }

    public double raiz(String s1){
        return Math.sqrt (Double.parseDouble(s1));
    }

    public double potencia(byte a, byte b){
        return Math.pow(a, b);
    }

    public double potencia(String s1, String s2){
        return Math.pow (Double.parseDouble(s1), Double.parseDouble(s2));
    }

    public double potencia(int a, double b){
        return Math.pow (a, b);
    }



}
