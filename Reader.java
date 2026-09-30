import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Reader 
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name: ");
        String name = read.readLine();

        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(read.readLine());

        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(read.readLine());

        float result = (float) n1 + n2;

        System.out.printf("%-10s%n%.2f", name, result);
    }
}