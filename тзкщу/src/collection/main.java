package collection;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class main {

public static ArrayList<Integer> Stroka(String str){
    String[] parts =str.split(" ");
    ArrayList<Integer> data = new ArrayList<>();
    int i=0;
    while (i<parts.length){
        data.add (Integer.parseInt(parts[i]));
        i++;
    }
    return data;


    }
    public static HashSet<Integer> Stroka2 (String str){
    String[] parts = str.split(" ");
    HashSet<Integer> data = new HashSet<>();
    int i=0;
    while (i<parts.length){
        data.add(Integer.parseInt(parts[i]));
        i++;
    }
    return data;
    }

    public  static Collection<Integer> Stroka (String str, Collection<Integer> data){
        String[] parts = str.split(" ");
        int i=0;
        while (i<parts.length){
            data.add(Integer.parseInt(parts[i]));
            i++;
        }
        return data;
    }
    public static  HashSet<String> Stroka3 (String filename) throws FileNotFoundException{
        HashSet<String> set = new HashSet<>();

        File file = new File (filename);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            set.add(line);

        }

        return set;
    }


}
