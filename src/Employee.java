import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class Employee {

    private String id;
    private String name;
    private Integer salary;
    private String location;

    @SerializedName("qualifications_ids")
    private Integer[] qualificationIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer[] getQualificationIds() {
        return qualificationIds;
    }

    public void setQualificationIds(Integer[] qualificationIds) {
        this.qualificationIds = qualificationIds;
    }

    @Override
    public String toString() {

        String[] formattedQualificationIds = new String[this.qualificationIds.length];
        for (int i = 0; i < this.qualificationIds.length; i++)
            formattedQualificationIds[i] = String.valueOf(this.qualificationIds[i]);

        return String.format("[%s] Employee: %s - salary: %d - location: %s - qualifications: [%s]", this.id, this.name, this.salary, this.location, String.join(", ", formattedQualificationIds));
    }
}


