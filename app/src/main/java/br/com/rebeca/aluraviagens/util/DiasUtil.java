package br.com.rebeca.aluraviagens.util;

public class DiasUtil {

    public static final String PLURAl = " dias";
    public static final String SINGULAR = " dia";

    public static String formataDiasEmTexto(int quantidadeDeDias) {
        if(quantidadeDeDias > 1){
            return  quantidadeDeDias + PLURAl;
        }
        return  quantidadeDeDias + SINGULAR;
    }
}
