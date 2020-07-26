package decodificador.funcion;

import java.util.ArrayList;
import java.util.List;

public class MainFunction {

    public String decoderFunction(String sequenceA, String sequenceB) {
        List<String> descomposed = new ArrayList<>();
        String aux = "";

        //Descomponer la sequencia y guardarla en descomposed
        for(int i=0; i<sequenceB.length(); i++) {
            for(int j=sequenceB.length(); j>i; j--) {
                if(!descomposed.contains(sequenceB.substring(i, j))) {
                    descomposed.add(sequenceB.substring(i, j));
                }
            }
        }

        //Buscar por la secuencia mas larga
        for(String s: descomposed) {
            if(sequenceA.contains(s)) {
                if(aux.length() < s.length()) {
                    aux = s;
                }
            }
        }

        return aux;
    }
}
