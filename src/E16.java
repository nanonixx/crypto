import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E16 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/naomi/code/code");
        byte[] enByte = Files.readAllBytes(path);

        SecretKey sKey = Xifrar.passwordKeyGenerator("password", 256);
        //generem una secret key pero aquesta vegada amb una contrasenya

        byte[] encryptedData = Xifrar.encryptData(sKey, enByte); //fem el mateix que a l'excercici anterior
        System.out.println(encryptedData);

        String decryptedData = Xifrar.decryptData(encryptedData, sKey);
        System.out.println(decryptedData);


    }

}
