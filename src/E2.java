import javax.crypto.SecretKey;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class E2 {

    public static void main(String[] args) throws IOException {

        Path ruta = Paths.get("/home/naomi/code/textamagat");
        byte[] textAmagat = Files.readAllBytes(ruta);
        //llegeix el text amagat en array de bytes

        File claus = new File("/home/naomi/code/clausA4.txt");

        FileReader fileReader = new FileReader(claus);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        //'line' correspon a cada línia del fitxer

        while (line != null) {

            try {
                System.out.println("Contraseña probada: "+line);
                SecretKey key = Xifrar.passwordKeyGenerator(line, 128);
                //es genera una secret key que té de password la línia que está llegint

                String decryptedText = Xifrar.decryptData(textAmagat, key);
                //s'intenta desencriptar amb aquesta clau

                System.out.println("TEXT AMAGAT: "+decryptedText);
                //si se desencripta, s'imprimeix el missatge

            }catch (Exception ex){
                //en cas que la contrasenya sigui errònia, cosa que causa el bad padding exception
                ex.getMessage();
            }

            line = bufferedReader.readLine();
        }
    }
}
