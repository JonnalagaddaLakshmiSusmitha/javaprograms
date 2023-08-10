public class week3
  {
    private int x;
    public int y;
    protected int z;
    int w;//default access modifier
  }
public class week4
  {
    public static void main(String args[])
    {
      week3 Obj=new week3();
      Obj.x=10;
      Obj.y=6;
      Obj.z=18;
      Obj.w=22;
      System.out.println("y ="+Obj.y + " ",z="+Obj.z + ",w=" + Obj.w");
    }
  }