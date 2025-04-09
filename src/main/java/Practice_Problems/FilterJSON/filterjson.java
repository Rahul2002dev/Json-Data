package Practice_Problems.FilterJSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class filterjson {
    public static void main(String[] args)throws Exception {
        String path = new String(
                Files.readAllBytes(Paths.get("C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\JSON-Data\\src\\main\\java\\Practice_Problems\\FilterJSON\\Data.json"))
        );

        // Parse the file into a JSONObject
        JSONObject obj = new JSONObject(path);

        // Get the array from the "users" key
        JSONArray users = obj.getJSONArray("users");

        // New array for filtered users
        JSONArray filtered = new JSONArray();

        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            int age = user.getInt("age");

            if (age > 25) {
                filtered.put(user);
            }
        }

        // Create final object to print
        JSONObject result = new JSONObject();
        result.put("users_under_25", filtered);

        System.out.println(result.toString(2));
    }
}
