package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        //lisez le contenu du fichier et affichez son contenu.
        Path path = Paths.get("C:\\Users\\litin\\Downloads\\OneDrive_1_25-05-2023\\recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        List<String> subLines = lines.subList(1,101);
        for( String ele:subLines){
            System.out.println(ele);
        }

        Path pathTarget = Paths.get("C:\\Users\\litin\\Downloads\\OneDrive_1_25-05-2023\\recensement100.csv");
        Files.write(pathTarget,subLines);

    }
}
