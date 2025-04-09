package Practice_Problems.ValidateJson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class validatejson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            String filePath = "C:\\Users\\rp950\\OneDrive\\Desktop\\capgemini-bridgelabz\\CSVDataHandling\\src\\Intermediate\\FilterRecords\\Data.txt";
            Object json = mapper.readValue(filePath,Object.class);
            System.out.println("this is valid Json file");

        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
