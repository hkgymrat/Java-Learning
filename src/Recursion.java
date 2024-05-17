
class employee{
    int id;
    String name;
    public void printDetails(){
            System.out.println("My id is"+ id);
            System.out.println("My name is"+ name);
    }
}
public class Recursion {
    public static void main(String[] args) {
        employee Him = new employee();
        employee Sur = new employee();

        Him.id = 20;
        Him.name = "Himanshu";
        Sur.id = 25;
        Sur.name = "Surjeet";
    }
}


