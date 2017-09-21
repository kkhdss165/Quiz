//2016301007 ±Ë∞Ê»£ ƒ˚¡Ó1
import java.util.Scanner;
class Quiz
{
	boolean lupeu;
	
	Quiz()
	{
		MyCalc();
	}
	void MyCalc()
	{
		lupeu = true;
	}
	void showMenu()
	{
		System.out.println("============================================");
		System.out.println("@Calculator Options Menu");
		System.out.println("  1.Add two integers");          
		System.out.println("  2.Subtract an integer from an integer "); 
		System.out.println("  3.Multiply two integers");             
		System.out.println("  4.Divide an integer into an integer ");
		System.out.println("  5.Exit");
		System.out.println("============================================");
	}
	double getFirstNumber()
	{
		String temp;	double FstNum;
		Scanner SC = new Scanner(System.in);
		System.out.print("Input first number : ");
		temp = SC.next();
		
		do
		if ( checkIfDigit(temp) == false)
		{
			System.out.print("Input first number Again!! : ");
			temp = SC.next();
		}
		else
			return convertNumbers(temp);
		while(true);
	}
	double getSecondNumber()
	{
		String temp;	double FstNum;
		Scanner SC = new Scanner(System.in);
		System.out.print("Input Second number : ");
		temp = SC.next();
		
		do
		if ( checkIfDigit(temp) == false)
		{
			System.out.print("Input Second number Again!! : ");
			temp = SC.next();
		}
		else
			return convertNumbers(temp);
		while(true);
	}
	void addNumbers()
	{
		double A, B;
		
		A = getFirstNumber();
		
		B = getSecondNumber();
		
		System.out.println(A+" + " + B + " = " + (A+B));
	}
	void subNumbers()
	{
		double A, B;
		
		A = getFirstNumber();
		
		B = getSecondNumber();
		
		System.out.println(A+" - " + B + " = " + (A-B));
	}
	void multNumbers()
	{
		double A, B;
		
		A = getFirstNumber();
		
		B = getSecondNumber();
		
		System.out.println(A+" + " + B + " * " + (A*B));
	}
	void divNumbers()
	{
		double A, B;
		
		A = getFirstNumber();
		
		B = getSecondNumber();
		
		do
		{
			if ( B==0 )
				B = getSecondNumber();
			else break;
		}
		while(true);
			
		System.out.println(A+" / " + B + " = " + (A/B));
	}
	boolean checkIfDigit(String str)
	{
		int dotcount = 0;
        if(str==null || str.equals(""))
            return false;
        
        for(int i=0; i<str.length(); i++) 
        {
            char ch = str.charAt(i);
            
            if((ch<'0' || ch>'9') && ch !='.')
            {
            	return false;
            }
            if (ch == '.')
            {
            	if (dotcount==1 || i == 0)
            		return false;
            	else
            		dotcount++;
            }
        }
        return true;
	}
	double convertNumbers(String Num)
	{
		double temp = Double.parseDouble(Num);
		
		return temp;
	}
}
public class Quiz1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menuNum;
		Scanner SC = new Scanner(System.in);
		Quiz Q = new Quiz();
		
		while(Q.lupeu)
		{
			Q.showMenu();
			
			System.out.print("Select one of the option numbers from above (1 ~ 5): ");
			
			do
			{
			menuNum = SC.nextInt();
			
			if (menuNum >= 1 && menuNum <= 5)
				break;
			else
				System.out.print(" !! try again Select one of the option numbers from above (1 ~ 5): ");
			
			} while(true);
			
			switch(menuNum)
			{
			case 1: Q.addNumbers(); break;
			case 2: Q.subNumbers(); break;
			case 3: Q.multNumbers(); break;
			case 4: Q.divNumbers(); break;
			case 5: System.out.print("Exit!!"); return; 
			}
		}
	}
}
