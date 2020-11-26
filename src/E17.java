import javax.crypto.SecretKey;

public class E17 {
    public static void main(String[] args) {

        SecretKey sKey = Xifrar.keygenKeyGeneration(256);

        sKey.getAlgorithm();
        //Te da el algoritmo de la clave en formato String
        System.out.println("sKey.getAlgorithm(): "+ sKey.getAlgorithm());

        sKey.getFormat();
        //Da el nombre del formato de codificación de la clave en String
        System.out.println("sKey.getFormat(): " + sKey.getFormat());

        sKey.getEncoded();
        //Devuelve una clave en su formato de codificación primaria en array de bytes
        System.out.println("sKey.getEnconded(): " + sKey.getEncoded());
    }

    }

