package Practice_Problems.MergeTwoJsonObject;

import org.json.JSONObject;

public class mergejsonobject {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject();
        obj1.put("name" , "rahul");
        obj1.put("email" , "xyz@gmail.com");

        JSONObject obj2= new JSONObject();
        obj2.put("name" , "pshnat");
        obj2.put("email" , "psh@gmail.com");

        JSONObject merged = new JSONObject();
        merged.put("object1", obj1);
        merged.put("object2", obj2);

        System.out.println(merged.toString(2));

    }
}
