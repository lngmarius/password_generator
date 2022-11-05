package com.mycompany.password_generator;



public class Password_generator {

    public String[] chars=new String[100];
    
    Password_generator()
    {
        int j=0;
        for(int i=33;i<127;i++)
        { this.chars[j]=Character.toString((char)i);
        j++;
        }
        
    }

    void Afiseaza()
    {
    for(int i=0;i<93;i++)
        System.out.println(chars[i]);
    }
    
    public String getChar(int n)
    {
    return this.chars[n];
    }
    
   String Random(int n)
   {
   
   String s=new String(); 
   for(int i=0;i<n;i++)
     s=s+getChar((int)(Math.random()*93)+1);
   
   return s;
   }
    
    
    
    
    public static void main(String[] args) {
    
    Password_generator vect = new Password_generator();
    vect.Afiseaza();
    System.out.println("------------");
    //test
     System.out.println((vect.Random(32)));
    }
}
