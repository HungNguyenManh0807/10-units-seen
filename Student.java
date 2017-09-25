/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kirin.bacsic;

/**
 *
 * @author zizibibi
 */
public class Student {
   
    private final  String name ="HungNguyen" ;
    private final  int age =19 ;
     
    
    public void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
    }
    
    public int addNumber(int a, int b){
        int Sum = a + b ;
        return Sum;        
}

    public static void main(String[] args) {
        Student st = new Student() ;
        st.showStudent();
        System.out.println("Sum of two number: " + st.addNumber(3, 4));
        
        
      
        
        
        
    }
}
 
