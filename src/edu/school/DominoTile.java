package edu.school;


public class DominoTile {
	private int left;
	private int right;



	public DominoTile(int left, int right) {
		if(left >= 0 && left <= 6) 
		this.left = left;
		if(right >= 0 && right <= 6) 
		this.right = right;
		
}
	
	public DominoTile() {
		this.left = 0;
		this.right = 0;
	}
	
	public int getLeft()
	{
		return left;
	}
	public int getRight()
	{
		return right;
	}
	
	
	public void chageValues() {
		int temp;
		temp = this.right;
		this.right = this.left;
		this.left = temp;
		
		 
		
		}
	//(5,5)(5.3)
	public boolean equals(DominoTile tile) {
		if(tile.left == this.left  && tile.right == this.right ) {
			return true;
		}
		if(tile.left == this.right  && tile.right == this.left ) {
			return true;
		}
		
		return false;
		
		
	}
	
	
	
}

