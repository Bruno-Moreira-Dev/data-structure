package atribuicao.referencia;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("A=" + a + " b= " + b);
        a = 2;
        System.out.println("A=" + a + " b= " + b);

        MeuObj objA = new MeuObj(1);

        System.out.println("objA=" + objA + " objB= " + objA);
        objA.setNum(2);
        System.out.println("objA=" + objA + " objB= " + objA);
    }
}