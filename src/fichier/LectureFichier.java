package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        //lisez le contenu du fichier et affichez son contenu.
        Path path = Paths.get("C:\\Users\\litin\\Downloads\\OneDrive_1_25-05-2023\\recensement100.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        ArrayList<Ville> list = new ArrayList<>();
//        Ville city = new Ville("name",12,"region",1235455);
        Iterator<String> iterator = lines.iterator();
        while(iterator.hasNext()){
            String target = iterator.next();
            String[] targetSplit = target.split(";");

            String name = targetSplit[6];
            int code = Integer.parseInt(targetSplit[0]);
            String region = targetSplit[1];
            long population = Long.parseLong(targetSplit[9].trim().replaceAll(" ", ""));

            Ville targetCity = new Ville(name,code,region,population);
            list.add(targetCity);
        }

//        ficher 25000
        ArrayList<Ville> list2 = new ArrayList<>();
        for (Ville ele:list) {
            if(ele.getPopulation() > 25000){
                list2.add(ele);
            }
        }


        ArrayList<String> list3 = new ArrayList<>();
        String header = "Nom;Code département;Nom de la région;Population totale";
        list3.add(header);

        for (int i = 0; i < list2.size(); i++) {
            String info =list2.get(i).getName()+ ";" + list2.get(i).getCode()+ ";" + list2.get(i).getRegion()+ ";" + list2.get(i).getPopulation() ;
            list3.add(info);
        }

        System.out.println(list3);
        Path pathTarget = Paths.get("C:\\Users\\litin\\Downloads\\OneDrive_1_25-05-2023\\recensement25.csv");
        Files.write(pathTarget,list3);

    }
}
