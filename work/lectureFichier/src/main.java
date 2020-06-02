import com.sun.deploy.net.MessageHeader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Stagiaire\\work\\lectureFichier\\src\\chanson.txt");
        BufferedReader bufferedReader = null;
        String[] mots;
        ArrayList<String> writeLine = new ArrayList<>();
        int compteur = 0;
        try {
            bufferedReader = Files.newBufferedReader(path);
            String lines = null;
            while ((lines = bufferedReader.readLine()) != null) {
                mots = lines.split(" ");

              //  System.out.println(lines);
                for (String mot : mots ) {
                    compteur ++;
                    System.out.println( mot + " " + mot.length() );


                    writeLine.add(mot.concat(" ").concat(String.valueOf(mot.length())));


                }


            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        writeLine.add("le nombre de mots total est " + compteur);

        Path path1 =Paths.get("C:\\Users\\Stagiaire\\work\\lectureFichier\\src\\occurence.txt");
        boolean exist=Files.exists(path1);
        if(!exist) {
            try {
                Files.createFile(path1);
                Files.write(path1, writeLine, StandardOpenOption.APPEND);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }




        System.out.println("le nombre de mot est " + compteur);


        TreeMap<String,int> treeMap= new TreeMap<String, int>();
        for(String mot : mots){

        }


    }





}


