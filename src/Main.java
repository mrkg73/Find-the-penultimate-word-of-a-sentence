import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        Scanner  scan = new Scanner(sc.nextLine());
        sc.close();
     ArrayList<String> words= new ArrayList<>();

        while(scan.hasNext())
        {
            words.add(scan.next());
       }
        System.out.println(words.get(words.size()-2));
    }

}
