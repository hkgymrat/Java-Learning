class MyMainEmployee{
    private int salary;
    private String name;
    public MyMainEmployee(String n, int s){
        name = n;
        salary = s;
    }
    public MyMainEmployee(){
        name = "Surjeet";
        salary = 10000;
    }
    public MyMainEmployee(String n){
        name = n;
    }
    public MyMainEmployee(int s){
        salary = s;
    }
    public void setSalary(int s){this.salary = s;}
    public int getSalary(){return salary;}
    public void setName(String n){this.name = n;}
    public String getName(){return name;}

}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee hi = new MyMainEmployee("Himanshu", 120000);
        System.out.println(hi.getSalary());
        System.out.println(hi.getName());
        MyMainEmployee him = new MyMainEmployee();
        System.out.println(him.getSalary());
        System.out.println(him.getName());
        MyMainEmployee hima = new MyMainEmployee("Rahul");
        System.out.println(hima.getSalary());
        System.out.println(hima.getName());
        MyMainEmployee himan = new MyMainEmployee(100000);
        System.out.println(himan.getSalary());
        System.out.println(himan.getName());

    }
}
