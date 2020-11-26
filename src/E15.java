import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E15 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/naomi/code/code");  //al fitxer hi posa "hola bon dia" en text pla
        byte[] enByte = Files.readAllBytes(path);  //transforma el text pla a array de bytes

        SecretKey sKey = Xifrar.keygenKeyGeneration(256);  //generem la secret key sense password

        byte[] encryptedData = Xifrar.encryptData(sKey, enByte);   //encriptem amb la clau que acabem de crear
        System.out.println(encryptedData);

        String decryptedData = Xifrar.decryptData(encryptedData, sKey);
        //desencriptem amb la mateixa clau per a obtenir el missatge
        System.out.println(decryptedData);

    }
}
