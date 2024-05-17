

public class Methods {
    static void foo(int n){
        if(n>0){
            foo(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }

}
