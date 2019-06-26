import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class readjson {
 
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {

            Object obj = parser.parse(new FileReader("C:\\Users\\Shrikant\\eclipse-workspace\\Test\\src\\data.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("name");
            System.out.print(name);
            
            String author = (String) jsonObject.get("author");
            JSONArray companyList = (JSONArray) jsonObject.get("arr");
 
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator iterator = companyList.iterator();
            while (iterator.hasNext()) {
            	
            	JSONObject aa = (JSONObject) iterator.next();
            	            	
                System.out.println("---------"+aa.toString());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}