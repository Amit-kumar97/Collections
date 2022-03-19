package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class simple 
{
    public static void main(String[] args) 
    {

        List list = new ArrayList();
        list.add(new String[]{"This", "is"});
        list.add(new String[]{"a", "test."});

        for (int i = 0; i < list.size(); i++)
        {
            String[] element = (String[]) list.get(i);

            boolean space = false;
            for (int j = 0; j < element.length; j++)
            {
                if (space)
                {
                    System.out.print(" ");
                }
                System.out.print(element[j]);
                space = true;
            }
            System.out.print(" ");
        }
    }
}
