import java.util.*;
public class main{
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
       //int num = sc.nextInt();
        for(int num=10;num<=99;num++){
            int count=0;
            for(int i=2;i<num;i++){
                if(num%i==0){
                        count=1;}}
               if(count==0){    
                System.out.println(num);
            }
        }
    }
}
           
