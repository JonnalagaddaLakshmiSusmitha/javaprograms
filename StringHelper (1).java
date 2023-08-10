class Strings
  {
    void concatenate(String str1,String str2)
    {
      System.out.println("after concate"+str1.concat(str2));
    }
    void concatenate(String str1,String str2,String str3)
    {
      String str=str1.concat(str2);
       System.out.println("after concate"+str.concat(str3));
    }
  }
class StringHelper
  {
    public static void main(String args[])
    {
      Strings s=new Strings();
      s.concatenate("hello","java");
      s.concatenate("welcome","intern","java");
    }
  }