/*write a java program to reverse the given string*/
class Reverse
  {
    public static void main(String args[])
    {
      String str="susmitha";
      String reverse=" ";
      for (int i=str.length()-1;i>=0;i--)
        {
          reverse +=str.charAt(i);
        }
      System.out.println("original string:"+str);
      System.out.println("reversed string:"+reverse);
        }
    }