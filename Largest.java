    import java.io.*;
    import java.util.*;
    public class Largest
    {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        { 
            b[i]=scan.nextInt();
        }
        Arrays.sort(b);
        System.out.print(b[a-1]);
    }
    
}
