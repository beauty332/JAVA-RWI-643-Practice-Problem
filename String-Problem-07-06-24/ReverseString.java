class ReverseString {
    public static void main (String[] args) {
       
        String str= "RailWorld", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Railworld");
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr;
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
