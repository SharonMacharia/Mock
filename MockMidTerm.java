/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockmid.term;

/**
 *
 * @author Students
 */
public class MockMidTerm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int i=12, marks=0;
    int j=15;
    int k=18;
    int sum=i+j;
    int multiply=k*i;
    int add=i+j+k;
    
    String password="Dotnet";
    String grade="A",s="";
    
    boolean b1=true;
    boolean b2=false;
    boolean b3=(10>2)?true:false;
    double weight=50;
    float f=10.4f;
    long netAsset=823456L;
    short year=2018;
    char gender='F';
    byte numChildren=2;
    
    System.out.println("Dotnet");
    System.out.println(sum);
    System.out.println(multiply);
    System.out.println(add);
    
    if(f==10.4){
     System.out.println("f is equal to 10.4f");
    }
    if (b1){
       
        int user=18;
        switch (user){
                
        case 18:
        System.out.println ("You are 18");
            break;
        case 19:
        System.out.println("You are 19");
            break;
        case 20:
        System.out.println("You are 20");
             break;
        default:
        System.out.println("You are not 18,19 or 20");
        
        if (marks>=75){
            grade="Distinction";}
        else
        if(marks>=60)
            grade="First class";
        else
        if(marks>=50)
            grade="Second class";
        else
        if(marks>=40)
            grade="Pass";
        else
            grade="Fail";
        
        }
        for (int x=1;x<10;x++){
        for (int y=0;y<x;y++){
            
            System.out.println();
            
            i=5;
            do{
                System.out.println(i);
                i++;
            }while(i<=10);
        }
    }
    };
        
    }
    public static int doSubtraction(){
             int subtraction=20;
             return subtraction;
         }
         public static boolean isEngaged(){
             boolean isEngaged=false;
             return false;
         }
         public static String getNmame(){
             String s="Sharon";
             System.out.println("Sharon:");
             return s;
         }
         
        // public static int doSubtraction(){
         //    int subtraction=20;
         //    return subtraction;
         //}
         /*public static boolean isEngaged(){
             boolean isEngaged=false;
             return false;
         }
         public static String getNmame(){
             String s="Sharon";
             System.out.println("Sharon:");
             return s;
         }*/
}
        
  

        
    
    
        
    

    

