import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        // write your code here

        try {
            // read json to buffer
            BufferedReader buffer = new BufferedReader(new FileReader("/workspace/Lesson23/src/Employees.json"));

            Gson gson = new Gson();

            //convert the json string back to ArrayList
            EmployeeList employeeList = gson.fromJson(buffer, EmployeeList.class);

            System.out.println(employeeList);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
