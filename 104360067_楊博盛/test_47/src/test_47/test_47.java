package test_47;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;

public class test_47 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入5個人的分數");
		Integer test[ ] = new Integer [5];
		
		for(int i = 0 ; i<test.length ; i++ )
		{
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		Arrays.sort(test,Collections.reverseOrder());
		
		for(int i = 0 ; i <test.length ; i++)
		{
			System.out.println("第"+(i+1)+"名的分數"+test[i]);
		}
	}
}
