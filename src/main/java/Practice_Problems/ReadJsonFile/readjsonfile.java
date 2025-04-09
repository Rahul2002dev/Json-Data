package Practice_Problems.ReadJsonFile;
import org.json.JSONObject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
public class readjsonfile {
    public static void main(String[] args) throws Exception {
        String path = new String(Files.readAllBytes(Paths.get("C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\JSON-Data\\src\\main\\java\\Practice_Problems\\ReadJsonFile\\data.json")));
        JSONObject json = new JSONObject(path);

        String name = json.get("name").toString();
        String email = json.get("email").toString();

        System.out.println("name : " + name + "\n email : " + email);
    }
}
