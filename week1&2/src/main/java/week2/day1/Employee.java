package week2.day1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable<Employee>{
    int id;
    String firstName;
    String lastName;
    String email;

    public String toCSV(){
        return id +", "+firstName+", "+lastName+", "+email;
    }

    public static Employee parseEmployee(String csvEmployee){
        String[] values = csvEmployee.split(",");
        int id = Integer.parseInt(values[0].trim());
        String firstName = values[1].trim();
        String lastName = values[2].trim();
        String email = values[3].trim();
        return new Employee(id, firstName, lastName, email);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.id - otherEmployee.id;
    }
}
