package edu.school;

public class DominoTableTest {

	public static void main(String[] args)
	{
		DominoTable table = new DominoTable();
		table.addLeft(new DominoTile(3, 4));
		table.print();
		table.addRight(new DominoTile(4, 5));
		table.addLeft(new DominoTile(4, 6));
		table.addRight(new DominoTile(3, 5));
		table.addLeft(new DominoTile(2, 4));
		table.print();
	}

}
