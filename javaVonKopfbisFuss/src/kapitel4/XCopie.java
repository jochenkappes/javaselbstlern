package kapitel4;

public class XCopie
{

  public static void main(String[] ags){

    int orig = 42;
    XCopie x = new XCopie();
    int y = x.los(orig);

    System.out.println(orig + " " + y);

  }

  private  int los(int arg)
  {
  arg = arg * 2;
  return arg;
  }

}
