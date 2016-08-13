import java.util.*;
import java.lang.*;
import java.io.*;
public class LabOne
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j;
		Scanner s = new Scanner(System.in);
		board obj = new board();
		int val,a,b,ch;
		System.out.println("!Gaming console!");
		System.out.println("1. Versus mode");
		System.out.println("2. Vs Random computer");
		System.out.println("3. Random Vs AI");
		System.out.println("4. Vs The Unbeatable");
		System.out.println("Enter your choice:");
		val = s.nextInt();
		if(val == 1)
		{
			int temp;
			while(true)
			{
				System.out.println("User 1, pick your move: ");
				a = s.nextInt();
				b = s.nextInt();
				obj.put(a,b,'O');
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("Player 2 wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Player 1 wins :D");
					System.exit(0);
				}
				System.out.println("User 2, pick your move: ");
				a = s.nextInt();
				b = s.nextInt();
				obj.put(a,b,'X');
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("Player 2 wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Player 1 wins :D");
					System.exit(0);
				}
			}
		}
		if(val == 2)
		{
			int temp;
			while(true)
			{
				System.out.println("User 1, pick your move: ");
				a = s.nextInt();
				b = s.nextInt();
				obj.put(a,b,'O');
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("Player 2 wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Player 1 wins :D");
					System.exit(0);
				}

				System.out.println("Computer, pick your move: ");
				Random rand = new Random();
				a = rand.nextInt(3);
				b = rand.nextInt(3);
				while(obj.matr[a][b] != '-')
				{
					a = rand.nextInt(3);
					b = rand.nextInt(3);
				}
				obj.put(a,b,'X');
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("Player 2 wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Player 1 wins :D");
					System.exit(0);
				}
			}
		}
		if(val == 3)
		{
				int temp;
				while(true){
				System.out.println("Computer, pick your move: ");
				Random rand = new Random();
				a = rand.nextInt(3);
				b = rand.nextInt(3);
				while(obj.matr[a][b] != '-')
				{
					a = rand.nextInt(3);
					b = rand.nextInt(3);
				}
				obj.put(a,b,'O');
				obj.print();
				temp = obj.checkstate();
				if(temp == 'O')
				{
					System.out.println("Computer wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'X')
				{
					System.out.println("AI wins :D");
					System.exit(0);
				}
				System.out.println("AI, pick your move: ");
				if(obj.matr[0][0] == obj.matr[0][1] && obj.matr[0][0] == 'X' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[0][2] && obj.matr[0][0] == 'X' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[0][1] && obj.matr[0][1] == 'X' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][1] && obj.matr[1][0] == 'X' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][2] && obj.matr[1][0] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][2] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';	
				else if(obj.matr[2][0] == obj.matr[2][1] && obj.matr[2][0] == 'X' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[2][0] == obj.matr[2][2] && obj.matr[2][0] == 'X' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[2][2] == obj.matr[2][1] && obj.matr[2][1] == 'X' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[1][0] && obj.matr[0][0] == 'X' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[2][0] && obj.matr[0][0] == 'X' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][0] && obj.matr[1][0] == 'X' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[0][1] == obj.matr[1][1] && obj.matr[0][1] == 'X' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[0][1] == obj.matr[2][1] && obj.matr[0][1] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[2][1] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][2] && obj.matr[0][2] == 'X' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[2][2] && obj.matr[0][2] == 'X' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[2][2] == obj.matr[1][2] && obj.matr[1][2] == 'X' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[1][1] && obj.matr[0][0] == 'X' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[2][2] && obj.matr[0][0] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][1] == obj.matr[2][2] && obj.matr[1][1] == 'X' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[2][0] == obj.matr[0][2] && obj.matr[0][2] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[0][0] == obj.matr[0][1] && obj.matr[0][0] == 'O' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[0][2] && obj.matr[0][0] == 'O' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[0][1] && obj.matr[0][1] == 'O' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][1] && obj.matr[1][0] == 'O' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][2] && obj.matr[1][0] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][2] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';	
				else if(obj.matr[2][0] == obj.matr[2][1] && obj.matr[2][0] == 'O' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[2][0] == obj.matr[2][2] && obj.matr[2][0] == 'O' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[2][2] == obj.matr[2][1] && obj.matr[2][1] == 'O' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[1][0] && obj.matr[0][0] == 'O' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[2][0] && obj.matr[0][0] == 'O' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][0] && obj.matr[1][0] == 'O' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[0][1] == obj.matr[1][1] && obj.matr[0][1] == 'O' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[0][1] == obj.matr[2][1] && obj.matr[0][1] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[2][1] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][2] && obj.matr[0][2] == 'O' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[2][2] && obj.matr[0][2] == 'O' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[2][2] == obj.matr[1][2] && obj.matr[1][2] == 'O' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[1][1] && obj.matr[0][0] == 'O' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[2][2] && obj.matr[0][0] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][1] == obj.matr[2][2] && obj.matr[1][1] == 'O' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[2][0] == obj.matr[0][2] && obj.matr[0][2] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else
				{
					int []arr = {0,0,0,0,0,1,2,2,2,2,2};
					 a = rand.nextInt(7);
					 b = rand.nextInt(7);
					while(obj.matr[arr[a]][arr[b]] != '-')
					{
						a = rand.nextInt(7);
						b = rand.nextInt(7);
					}
					obj.put(arr[a],arr[b],'X');
				}
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("AI wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Computer wins :D");
					System.exit(0);
				}
			}
		}
		if(val == 4)
		{
			int temp;
			while(true)
			{
				System.out.println("User 1, pick your move: ");
				a = s.nextInt();
				b = s.nextInt();
				obj.put(a,b,'O');
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("Player 2 wins :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Player 1 wins :D");
					System.exit(0);
				}
				System.out.println("AI, pick your move: ");
				if(obj.matr[0][0] == obj.matr[0][1] && obj.matr[0][0] == 'X' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[0][2] && obj.matr[0][0] == 'X' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[0][1] && obj.matr[0][1] == 'X' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][1] && obj.matr[1][0] == 'X' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][2] && obj.matr[1][0] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][2] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';	
				else if(obj.matr[2][0] == obj.matr[2][1] && obj.matr[2][0] == 'X' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[2][0] == obj.matr[2][2] && obj.matr[2][0] == 'X' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[2][2] == obj.matr[2][1] && obj.matr[2][1] == 'X' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[1][0] && obj.matr[0][0] == 'X' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[2][0] && obj.matr[0][0] == 'X' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][0] && obj.matr[1][0] == 'X' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[0][1] == obj.matr[1][1] && obj.matr[0][1] == 'X' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[0][1] == obj.matr[2][1] && obj.matr[0][1] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[2][1] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][2] && obj.matr[0][2] == 'X' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[2][2] && obj.matr[0][2] == 'X' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[2][2] == obj.matr[1][2] && obj.matr[1][2] == 'X' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[1][1] && obj.matr[0][0] == 'X' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[2][2] && obj.matr[0][0] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][1] == obj.matr[2][2] && obj.matr[1][1] == 'X' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][1] && obj.matr[1][1] == 'X' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[2][0] == obj.matr[0][2] && obj.matr[0][2] == 'X' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[0][0] == obj.matr[0][1] && obj.matr[0][0] == 'O' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[0][2] && obj.matr[0][0] == 'O' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[0][1] && obj.matr[0][1] == 'O' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][1] && obj.matr[1][0] == 'O' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[1][0] == obj.matr[1][2] && obj.matr[1][0] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][2] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';	
				else if(obj.matr[2][0] == obj.matr[2][1] && obj.matr[2][0] == 'O' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[2][0] == obj.matr[2][2] && obj.matr[2][0] == 'O' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[2][2] == obj.matr[2][1] && obj.matr[2][1] == 'O' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[1][0] && obj.matr[0][0] == 'O' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[0][0] == obj.matr[2][0] && obj.matr[0][0] == 'O' && obj.matr[1][0] == '-')
					obj.matr[1][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][0] && obj.matr[1][0] == 'O' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[0][1] == obj.matr[1][1] && obj.matr[0][1] == 'O' && obj.matr[2][1] == '-')
					obj.matr[2][1] = 'X';
				else if(obj.matr[0][1] == obj.matr[2][1] && obj.matr[0][1] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[2][1] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[0][1] == '-')
					obj.matr[0][1] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][2] && obj.matr[0][2] == 'O' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[2][2] && obj.matr[0][2] == 'O' && obj.matr[1][2] == '-')
					obj.matr[1][2] = 'X';
				else if(obj.matr[2][2] == obj.matr[1][2] && obj.matr[1][2] == 'O' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[1][1] && obj.matr[0][0] == 'O' && obj.matr[2][2] == '-')
					obj.matr[2][2] = 'X';
				else if(obj.matr[0][0] == obj.matr[2][2] && obj.matr[0][0] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][1] == obj.matr[2][2] && obj.matr[1][1] == 'O' && obj.matr[0][0] == '-')
					obj.matr[0][0] = 'X';
				else if(obj.matr[2][0] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[0][2] == '-')
					obj.matr[0][2] = 'X';
				else if(obj.matr[0][2] == obj.matr[1][1] && obj.matr[1][1] == 'O' && obj.matr[2][0] == '-')
				{
					obj.matr[2][0] = 'X';
				}
				else if(obj.matr[2][0] == obj.matr[0][2] && obj.matr[0][2] == 'O' && obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[1][1] == '-')
					obj.matr[1][1] = 'X';
				else if(obj.matr[0][0] == 'O' && obj.matr[2][2] == 'O' && obj.matr[2][1] == '-' && obj.matr[1][0] == '-' && obj.matr[0][1] == '-' && obj.matr[1][2] == '-')
				{
						obj.matr[0][1] = 'X';
				}
				else if(obj.matr[0][2] == 'O' && obj.matr[0][2] == 'O' && obj.matr[2][1] == '-' && obj.matr[1][0] == '-' && obj.matr[0][1] == '-' && obj.matr[1][2] == '-')
					obj.matr[0][1] = 'X';
				else
				{
					Random rand = new Random();
					int []arr = {0,0,0,0,0,1,2,2,2,2,2};
					 a = rand.nextInt(7);
					 b = rand.nextInt(7);
					while(obj.matr[arr[a]][arr[b]] != '-')
					{
						a = rand.nextInt(7);
						b = rand.nextInt(7);
					}
					obj.put(arr[a],arr[b],'X');
				}
				obj.print();
				temp = obj.checkstate();
				if(temp == 'X')
				{
					System.out.println("AI won :D");
					System.exit(0);
				}
				else if(temp == 't')
				{
					System.out.println("Match is tied");
					System.exit(0);
				}
				else if(temp == 'O')
				{
					System.out.println("Player 1 wins :D");
					System.exit(0);
				}
			}
		}	
	}
}