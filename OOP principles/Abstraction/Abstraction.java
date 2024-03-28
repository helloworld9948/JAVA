abstract class It{  
   It(){System.out.println("Information Technology");}  
   abstract void run();  
   void year(){System.out.println("second year");}  
 }  

class Branch extends It{  
    void run(){System.out.println("running safely..");}  
}  

class TestAbstraction2{  
    public static void main(String args[]){  
        It obj = new Branch();  
        obj.run();  
        obj.year();  
    }  
}  
