import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//         // name
        List<User> userList = new ArrayList<>();
        userList.add(new User("A", 1000));
        userList.add(new User("B", 200));
        userList.add(new User("C", 1200));

        User val = userList.stream().max(Comparator.comparingInt(User::getSalary)).get();
        System.out.println(val.name);
//         double maxSal = userList.stream().max(User:sal);
//         User maxSalUser = userList.stream().filter()
        
//         max(User: salary).filter

// // a, b, c, d, e, f
// //output: a, c, e

List<String> list = new ArrayList<>();
// list.add('a');
// list.add('b');
List<Integer> nums = new ArrayList(Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10));



    for (int i = nums.size()-1; i >=0; i--) {
        if (i % 2 != 0) {
            nums.remove(i);
        }
    }
    System.out.println(nums);
    System.out.println(nums.size());
    System.out.println(nums.get(1));
}

    static int fun() {
        try {
            //some logic
            return 10;
            }
            catch(Exception ex) {
            //some logic
            return 20;
            }
            finally{
            //some logic
            return 30;
            }
    
    }

}

    
//         int x = fun();
// }

class User {
    String name;
    Integer salary;

    User(String name, int salary) {
        this.name = name;
        this.salary = salary;
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

    
}


