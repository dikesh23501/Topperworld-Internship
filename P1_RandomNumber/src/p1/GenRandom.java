package p1;
import java.util.Random;
public class GenRandom 
{
	public static int getRand(int min,int max)
	{
		Random random=new Random();
		return random.ints(min,max).findFirst().getAsInt();
	}
}
