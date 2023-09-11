import java.util.Scanner;

public class InputOutput
{
    public static void main(String[] args) throws Exception
    {
        //System.out.println("Hello world");
        //System.out.print("Rad 2");
        //System.out.println("Hej hej");

        Scanner input =new Scanner (System.in);
        //System.out.println("Skriv ett nummer");
        //int nummer = input.nextInt();
        //input.nextLine();
        //System.out.print("Du skrev nummret: " + nummer);


        System.out.println("Vad är ditt efter namn? ");
        String namn = input.nextLine();
         input.nextLine();
        System.out.println("Trevligt mr "+ namn +" Vad är dit för namn?");
        String text2 = input.nextLine();
        System.out.println("god dag "+ namn +" "+ text2+ " "+ namn);

        input.close();

    }
}