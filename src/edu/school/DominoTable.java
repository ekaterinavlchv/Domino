package edu.school;

public class DominoTable
{
	private DominoTile[] tiles;	
	private int lastElementIndex;
	
	public DominoTable()
	{
		tiles = new DominoTile[28];
	}
	
	public boolean addRight(DominoTile tile)
	{
		if(tile == null)
		{
			return false;
		}
		
		if(lastElementIndex >= 28)
		{
			return false;
		}
		
		if(lastElementIndex == 0)
		{
			tiles[lastElementIndex] = tile;
			lastElementIndex++;
			return true;
		}
		
		if(tiles[lastElementIndex - 1].getRight() == tile.getLeft()
				|| tiles[lastElementIndex - 1].getRight() == tile.getRight())
		{
			tiles[lastElementIndex] = tile;
			lastElementIndex++;
			return true;
		}
		else
		{
			return false;
		}
		//lastElementIndex = 0;
		//....
		//tiles[lastElementIndex] = tile, 0
		//lastElementIndex++; -> 1
		
		//1
		//....
		//tiles[lastElementIndex] = tile, 1
		//lastElementIndex++; -> 2
		
		//..... 27
		//tiles[lastElementIndex] = tile, 27
		//lastElementIndex++; 28
	}
	
	public boolean addLeft(DominoTile tile)
	{
		if(tile == null) 
		{
			return false;
		}
		
		if(lastElementIndex >= 28)
		{
			return false;
		}
		
		if(lastElementIndex == 0)
		{
			tiles[lastElementIndex] = tile;
			lastElementIndex++;
			return true;
		}
		
		if(tiles[0].getLeft() == tile.getRight() || tiles[0].getLeft() == tile.getLeft())
		{
			DominoTile[] tempTiles = new DominoTile[tiles.length];
			tempTiles[0] = tile;
			
			for(int i = 0; i < lastElementIndex; i++)
			{
				tempTiles[i + 1] = tiles[i];
			}
			
			tiles = tempTiles;
			
			lastElementIndex++;
			return true;
		}
		else
		{
			return false;
		}
	}

	void print()
	{
		for(int i = 0; i < lastElementIndex; i++)
		{
			System.out.println(tiles[i]);
		}
	}
}