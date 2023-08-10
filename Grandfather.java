class Grandfather
  {
    void hair()
    {
      System.out.println("the hairstyle");
    }
  }
class Father extends Grandfather
{
  void eyes()
  {
    System.out.println("the eye colour");
  }
}
class Son extends Father
  {
    void face()
    {
      System.out.println("the shape of face");
    }
  }
class hybrid
  {
    public static void main(String args[])
    {
      Son s=newSon();
      
    }
  }