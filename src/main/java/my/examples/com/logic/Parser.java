package my.examples.com.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Parser {
    static String split = ",";
    static String line = "";
    public final static String paramPath = "C:\\Users\\Desktop\\SafeProjectProfi\\src\\main\\resources\\things.txt";
    public final static String safeValuePath = "C:\\Users\\Desktop\\SafeProjectProfi\\src\\main\\resources\\safeValue.txt";

    public List<Thing> thingParse() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(paramPath));
        List<Thing> things = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] thingsEntity = line.split(split);
            Thing thing = new Thing();
            thing.setName(thingsEntity[0]);
            thing.setSize(thingsEntity[1]);
            thing.setValue(thingsEntity[2]);
            things.add(thing);
        }
        br.close();
        return things;
    }

    public Integer safeValueParse() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(safeValuePath));
        Integer safeValue;
        Scanner scanner = new Scanner(br);
        safeValue = scanner.nextInt();
        br.close();
        return safeValue;
    }

}
