import java.util.*;
import java.lang.*;

class StringCalculator
{
        public static int Add(String numbers) throws Exception
        {
                String num[] = numbers.split("[^0-9-]+|\n+");                                                     // spliting the string by multiple occurences of delimiters
                int sum =0, Num = 0;                                                                              // final sum and individual number
                if(numbers.length()==0)
                {
                        return 0;
                }
                for(String no : num)
                {
                        try
                        {
                                Num = Integer.parseInt(no);
                                if(Num<0)
                                        throw new Exception("negatives not allowed: " + getAllNegatives(num));  // getting all negative numbers
                                else if(Num>1000)                                                               // neglecting numbers greater than 1000
                                        continue;
                                else
                                        sum += Num;                                                             // adding
                        }
                        catch(NumberFormatException e)
                        {
                                continue;
                        }
                }
                return sum;
        }
        public static String getAllNegatives(String num[])
        {
                StringBuffer neg = new StringBuffer();
                for(String no : num)
                {
                        if(Integer.parseInt(no)<0)
                                neg.append(no + " ");
                }
                return neg.toString();
        }
        public static void main(String args[]) throws Exception
        {
                Scanner in = new Scanner(System.in);
                String inp  = new String();                                                                   // getting input
                inp = in.nextLine();
                int sum;                                                                                      // final sum
                sum = Add(inp);                                                                               // calling function Add
                System.out.println(sum);

        }
}
