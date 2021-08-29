import java.util.*;
import java.lang.*;

class StringCalculator
{
        static final String delimiter = "[^0-9-]";
        public static int Add(String numbers) throws Exception
        {
                String num[] = numbers.split(delimiter);
                int sum =0, Num = 0;

                for(String no : num)
                {
                        try
                        {
                                Num = Integer.parseInt(no);
                                sum += Num;
                        }
                        catch(NumberFormatException e)
                        {
                                continue;
                        }
                }
                return sum;
        }
        public static void main(String args[]) throws Exception
        {
                Scanner in = new Scanner(System.in);
                String inp  = new String();
                inp = in.nextLine();
                int sum;
                sum = Add(inp);
                System.out.println(sum);

        }
}
