package com.gshoogeveen.euler.solutions;

import com.gshoogeveen.euler.input.ReadSudoku;
import com.gshoogeveen.euler.sudoku.Sudoku;

public class Problem_096
{

	public static void main(String[] args)
	{
		Sudoku sudoku = new Sudoku(ReadSudoku.readSudokuFromFile("p096_sudoku.txt"));
		sudoku.show();
		sudoku.solve();
	}

}
