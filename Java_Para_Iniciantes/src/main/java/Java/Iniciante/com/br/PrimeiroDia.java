package Java.Iniciante.com.br;

public class PrimeiroDia {

    public static void main(String[] args) {
        int numeroInteiro = 20000000; //o _ vai ajudar na divisão do numero também tem short, byte para usar como valor inteiro;
        long numeroLong = 3;
        float numeroFloat = 354;
        double numeroDouble = 2.4;
        char stringChar = 'G';
        boolean logico = true;
        System.out.println("Valores Primitivos:\n inteiro:"+numeroInteiro+
                            "\n double:"+numeroDouble+
                            "\n char:"+stringChar);

        String nomeCompleto = "Georgia Midonz";
        System.out.println("Olá "+ nomeCompleto.toUpperCase());

    }
}
