import java.util.*;
import java.lang.*;
import java.io.*;
class board	
{
	public char matr[][] = new char[3][3];
	Scanner s = new Scanner(System.in);
	int i,j; 
	public board()
	{
		int i,j;
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				matr[i][j] = '-';
			}
		}
	}
	public void put(int x, int y, char val)
	{
		if(x < 0 || x > 2 || y < 0 || y > 2 || matr[x][y] != '-')
		{
			System.out.println("Invalid input, Please Enter Again!");
			int a = s.nextInt();
			int b = s.nextInt();
			put(a,b,val);
		}
		else
			matr[x][y] = val;
	}
	public void print()
	{
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.print(matr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	public char checkstate()
	{
		if(matr[0][0] == matr[0][1] && matr[0][0] == matr[0][2] && matr[0][0] != '-')
			return matr[0][0];
		else if(matr[1][0] == matr[1][1] && matr[1][0] == matr[1][2] && matr[1][0] != '-')
			return matr[1][0];
		else if(matr[2][0] == matr[2][1] && matr[2][0] == matr[2][2] && matr[2][0] != '-')
			return matr[2][0];
		else if(matr[0][0] == matr[1][0] && matr[0][0] == matr[2][0] && matr[0][0] != '-')
			return matr[0][0];
		else if(matr[0][1] == matr[1][1] && matr[0][1] == matr[2][1] && matr[0][1] != '-')
			return matr[0][1];
		else if(matr[0][2] == matr[1][2] && matr[0][2] == matr[2][2] && matr[0][2] != '-')
			return matr[0][2];
		else if(matr[0][0] == matr[1][1] && matr[1][1] == matr[2][2] && matr[0][0] != '-')
			return matr[0][0];
		else if(matr[2][0] == matr[1][1] && matr[1][1] == matr[0][2] && matr[2][0] != '-')
			return matr[2][0];
		for(i = 0; i <= 2; i++)
		{
			for(j = 0; j <= 2; j++)
			{
				if(matr[i][j] == '-')
					return 'b';
			}
		}
		return 't';
	}
	public char[][] get()
	{
		return matr;
	}
	
}