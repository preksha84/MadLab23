/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
      
      //int mul=1;
      int times=Integer.parseInt(args[0]);
   for(int i=1;i<=10;i++)
   {
     //  mul=times*i;
       System.out.println(times+" * "+ i +"="+times*i);
   }
}
}

