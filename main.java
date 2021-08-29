import java.util.*;
import java.lang.*;

class StringCalculator
{
        public static int Add(String numbers) throws Exception
        {
                String num[] = numbers.split("[^0-9-]|\n");
                int sum =0, Num = 0;
                if(numbers.length()==0)
                {
                        return 0;
                }
                for(String no : num)
                {
                                Num = Integer.parseInt(no);
                                if(Num<0)
                                {
                                        throw new Exception("negatives not allowed: " + getAllNegatives(num));
                                }
                                else
                                {
                                        sum += Num;
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
                String inp  = new String();
                inp = in.nextLine();
                int sum;
                sum = Add(inp);
                System.out.println(sum);

        }
}
