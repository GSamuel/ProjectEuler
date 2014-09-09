package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.input.ReadList;
import com.gshoogeveen.euler.list.CycleArray;

public class Problem_59
{
	//SOLVED//
	public static void main(String[] args)
	{
		int[] list = ReadList.readListFromFile("p059_cipher.txt");
		char[] file = new char[list.length];
		for(int i=0; i < list.length; i++)
			file[i] = (char)list[i];

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Character[] alphabet2 = new Character[alphabet.length];
		
		for (int i = 0; i < alphabet.length; i++)
			alphabet2[i] = new Character(alphabet[i]);

		CycleArray<Character> cycle1 = new CycleArray<Character>(alphabet2);
		CycleArray<Character> cycle2 = new CycleArray<Character>(alphabet2);
		CycleArray<Character> cycle3 = new CycleArray<Character>(alphabet2);

		for(int i =0; i < alphabet.length; i++)
		{
			Character keyone = cycle1.next();
			for(int j =0; j < alphabet.length; j++)
			{
				Character keytwo = cycle2.next();
				for(int k =0; k < alphabet.length; k++)
				{
					Character keythree = cycle3.next();
					Character[] key = {keyone,keytwo,keythree};
					char[] newText = XOR(file, key);
					if(new String(newText).contains(" the "))
					{
						int count = 0;
						for(char c: newText)
							count += c;
						
						show(key);
						show(newText);
						System.out.println("The answer is:"+count);
					}
					
				}
			}
		}
		
	}
	private static char[] XOR(char[] file, Character[] key)
	{
		CycleArray<Character> keycycle = new CycleArray<Character>(key);
		
		char[] newText = new char[file.length];
		for(int i =0; i <file.length; i++)
			newText[i] = (char) (file[i]^keycycle.next());
			
		return newText;
	}

	private static void show(Character[] file)
	{
		for(int i =0; i < file.length; i++)
			System.out.print(file[i]);
		System.out.println();		
	}
	
	private static void show(char[] file)
	{
		for(int i =0; i < file.length; i++)
			System.out.print(file[i]);
		System.out.println();
	}
}
