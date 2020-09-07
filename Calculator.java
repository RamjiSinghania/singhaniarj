import java.util.Scanner;
class Calculator
{
 public static void main(String[]args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter No1");
  int No1=s.nextInt();
  System.out.println("Enter No2");
  int No2=s.nextInt();
  System.out.println("Enter Sym(+,-,*,/)");
  String Sym=s.next();
  int res;
  switch(Sym)
      
    {
        case"+":res=No1+No2;
        System.out.println("res="+res);
        break;

        case"-":res=No1-No2;
        System.out.println("res="+res);
        break;

        case"*":res=No1*No2;
        System.out.println("res="+res);
        break;

        case"/":res=No1/No2;
        System.out.println("res="+res);
        break;
   }
  }
}