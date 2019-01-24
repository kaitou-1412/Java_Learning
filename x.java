import java.util.*;
class x
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.An apple a day keeps the doctor away.");
        System.out.println("An");
        System.out.println("An apple");
        System.out.println("An apple a");
        System.out.println("An apple a day");
        System.out.println("An apple a day keeps");
        System.out.println("An apple a day keeps the");
        System.out.println("An apple a day keeps the doctor");
        System.out.println("An apple a day keeps the doctor away.");
        System.out.println();
        System.out.println("2.An apple a day keeps the doctor away.");
        System.out.println("An");
        System.out.println("apple");
        System.out.println("a");
        System.out.println("day");
        System.out.println("keeps");
        System.out.println("the");
        System.out.println("doctor");
        System.out.println("away.");
        System.out.println();
        System.out.println("Enter Choice(1 or 2)");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                   System.out.println("Enter sentence:-");
                   String s1=sc.nextLine();
                   for(int i=s1.indexOf(" ");i<s1.length();i++)
                   {
                       if(s1.charAt(i)==' ')
                       {
                            System.out.println(s1.substring(0,i)); 
                       }
                   }
                   System.out.println(s1);
                   break;
            case 2:
                   String s2="An apple a day keeps the doctor away";                                                             
                   int i;
                   for(i=0;i<s2.length();i++)
                   {
                       if(s2.charAt(i)==' ')
                       {
                            System.out.println(s2.substring(0,i));
                            break;
                       }
                   }
                   for(int a=i+1;a<s2.length();a++)
                   {
                   int z;    
                   if(s2.charAt(a)==' ')
                       {
                            z=a;
                       }    
                   for(int j=i;j<s2.length();j++)
                   {
                        if(s2.charAt(j)==' ')
                        {
                            System.out.println(s2.substring(i+1,a));
                        }
                   }
                   }
                   break;
            default:System.out.println("Enter correct choice");       
        }
   }
}