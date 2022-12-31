import java.util.ArrayList;
class Main
{
public static void main(String args[])
{
 ArrayList<String> Languages =new ArrayList<>();
Languages.add("Java");
Languages.add("Python");

System.out.println("ArrayList : "+Languages);
Languages.remove("Python");
System.out.println("ArrayList : "+Languages);
}
}
