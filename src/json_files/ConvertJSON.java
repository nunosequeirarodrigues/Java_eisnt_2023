package json_files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.lang.StringEscapeUtils;

import java.util.List;
import java.util.stream.Stream;
public class ConvertJSON {
    public static void main(String[] args) {
        System.out.println("Ler Json >>>");

        String fileName = "c:\\work\\JSON_UTF8.json";

        //readUnicodeJava11(fileName);
        readUnicodeFiles(fileName);

        System.out.println("Ler Json <<< ");
    }

    public static void readUnicodeFiles(String fileName) {
        String fileout =  "c:\\work\\JSON_PT.json";
        Path outpath = Paths.get(fileout);
        Path path = Paths.get(fileName);
        try {

            // Java 11
            String s = Files.readString(path, StandardCharsets.UTF_8);
            System.out.println(s);
            String text = s;
            text = StringEscapeUtils.unescapeJava(text);
            System.out.println(text);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement jsonElement = JsonParser.parseString(text);
            String prettyJson = gson.toJson(jsonElement);
            Files.write(outpath, prettyJson.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
