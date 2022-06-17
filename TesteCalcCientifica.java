public class TesteCalcCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();

        //calc.raiz(25);
        System.out.printf("\nRaiz de um inteiro: "+calc.raiz(81));
        //calc.raiz(25.0);
        System.out.printf("\nRaiz de um double: "+calc.raiz(25.0));
        //calc.raiz("25");
        System.out.printf("\nRaiz de uma String: "+calc.raiz("9"));


        System.out.printf("\n\nPotencia de dois valores byte: "+calc.potencia(79, 0));
        System.out.printf("\nPotencia de duas Strings: "+calc.potencia("5", "2"));
        System.out.printf("\nPotencia de um inteiro por um double: "+calc.potencia(2, 3.0));
    }
}
