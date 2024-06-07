
class printWords { 
    public static void main(String s) 
    { 
    
     for (String word : s.split(" ")) 
    
      if (word.length() % 2 == 0) 

       System.out.println(word); 
    } 
    public static void main(String[] args) 
    { 
    
     String s = "i am Beauty Kumari"; 
     main(s); 
    } 
   }