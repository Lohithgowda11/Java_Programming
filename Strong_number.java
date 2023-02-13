package programming;

public class Strong_number 
{
	public static void main(String[] args) 
	{
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem= no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		if(copy==sum)
			System.out.println("Strong number");
		else
		System.out.println("not a Strong number");
		
	}
	static int fact(int rem)
	{
		int fa=1;
		for(int i=rem;i>=1;i--)
		{
			fa=fa*i;
		}
		return fa;
	}

}
