import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E18 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/naomi/code/code");
        byte[] enByte = Files.readAllBytes(path);

        SecretKey sKey = Xifrar.passwordKeyGenerator("password", 256);
        //generem la secret key amb la contrasenya "password"

        byte[] encryptedData = Xifrar.encryptData(sKey, enByte);
        System.out.println(encryptedData);
        //encriptem amb aquesta clau


        SecretKey fakeKey = Xifrar.passwordKeyGenerator("fake", 256);
        //generem una altra clau pero amb una contraseña diferent

        String decryptedData = Xifrar.decryptData(encryptedData, fakeKey);
        //desencriptem amb la última clau
        System.out.println(decryptedData);

        //Bad padding exception
    }
}
