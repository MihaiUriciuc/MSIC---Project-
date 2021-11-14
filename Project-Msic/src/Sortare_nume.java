import java.util.Scanner;

public class Sortare_nume extends Rau_platnic{
	public static String sortString;{
	int n = 50;
	String tempString;
	
    for (int i = 0; i < n; i++) 
    {
        for (int j = i + 1; j <n ; j++) 
        {
            if (names[i].compareTo(names[j])>0) 
            {
                tempString = names[i];
                names[i] = names[j];
                names[j] = tempString;
            }
            
        }
    }
    for (int i = 0; i < n - 1; i++) 
    {
        System.out.print(names[i] + ",");
    }
    System.out.print(names[n - 1]);
	}

}
