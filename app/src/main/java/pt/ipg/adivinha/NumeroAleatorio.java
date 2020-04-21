package pt.ipg.adivinha;

import java.util.Random;

public class NumeroAleatorio {
    private static Random random = new Random();

    public static int proximoNumero(){
        return random.nextInt(11);
    }
}
