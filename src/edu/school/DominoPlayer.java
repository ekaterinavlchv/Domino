package edu.school;

public class DominoPlayer {
	
	private String nickname; 
	private DominoTile[] tiles; 
	private int tilesInHands; 
	private DominoTable table;
	
	public String getNickname()
	{
		return nickname;
	}
	
	public DominoTile[] getTiles()
	{
		return tiles;
	}
	
	public int getTilesInHands()
	{
		return tilesInHands;
	}
	
	public DominoTable getTable()
	{
		return table;
	}
	
	public void setNickname(String nickname) 
	{
		if (nickname != null && !nickname.isEmpty()) 
		{
			this.nickname = nickname;
		}
		
	}	
	
	
	public DominoPlayer(String nickname, DominoTile[] tiles, DominoTable table)
	{
		setNickname(nickname);
		this.tiles = tiles;
		this.table = table;
		
	}
	
	private int getTileIndex(DominoTile t)
	{
		for(int i = 0 ; i < tiles.length ; i++)
		{
			if(tiles[i] == t)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	public void addTileAtLeft(DominoTile t)
	{
		
	}
	





}



