class Animal
  {
    void sound()
    {
      System.out.println("different animals can make different sounds");
    }
  }
class dog extends Animal{
  void sound()
  {
    System.out.println("dog sounds like bow bow");
  }
}
class Cat extends Animal{
  void sound()
  {
    System.out.println("cat sounds like meow meow");
  }
}
class Animal1
  {
    public static void main(String args[])
    {
      Animal animal=new Animal();
        animal.sound();
      Animal dog=new dog();
      dog.sound();
      Animal cat=new Cat();
      cat.sound();
    }
  }