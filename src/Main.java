import java.util.Scanner;
public class Main
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        Scanner  scan = new Scanner(sc.nextLine());
        sc.close();
        String word, word2="";

        while(scan.hasNext())
        {
              word=scan.next();
           if(scan.hasNext())    word2=word;
       }
        System.out.println(word2);
    }

}
