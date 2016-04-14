package algorithms.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CountLuck {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Getting number of test
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		
		//iterating tests
		for(int i=0;i<numTest;i++){
			//assigning row and column size
			int rowSize = in.nextInt();
			int colSize = in.nextInt();
			
			//all forest map will be represented in this two dimensional char array
			char[][] forest = new char[rowSize][colSize];
			//input will be taken line by line as string and will be assigned to this variable as char array
			char[] point;
			
			//row and column(x,y) coordinates of our hero(Hermione Granger) will be stored in these variables
			int coordRow = -1;
			int coordCol = -1;
			
			//iterating forest array(map) row by row
			for(int row=0;row<rowSize;row++){
				
				//point variable stores the value of column as char array, temporarily
				point = in.next().toCharArray();
				//point variable is assigned to one dimension of forest at once
				forest[row] = point;
				
				//checking for beginning coordinate of our hero(Hermione Granger)
				for(int col=0;col<colSize;col++){
					if(forest[row][col] == 'M'){
						coordRow = row;
						coordCol = col;
					}
				}
			}
			
			//number of wand wave needed to do by our hero
			int waveWandRequired = in.nextInt();
			
			//coordinates of points will be stored in CoorNode object
			//firstCoordinate stores coordinate of Hermione
			CoordNode firstCoordinate = new CoordNode(coordRow, coordCol);
			//adding coordinate of Hermione to queue and calling method to implement depth first search
			LinkedList<CoordNode> queue = new LinkedList<CoordNode>();
			queue.add(firstCoordinate);
			int wavewand = depthFirstSearch(queue, forest);
			
			//checking for number of waving wand whether equals to defined before and printing result
			if(waveWandRequired == wavewand)
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
			
		}
		
	}
	
	
	/**
	 * Implements depth first search and returns number of waving wand
	 * @param queue stores coordinates of our hero(Hermione)
	 * @param forest stores map of forest
	 * @return how many times our hero(Hermione) encountered with multiple ways
	 */
	public static int depthFirstSearch(LinkedList<CoordNode> queue, char[][] forest){
		int multipleOption = 0;
		
		while(queue.size() > 0){
			CoordNode removedNode = queue.removeFirst();
			
			if(checkMultipleOptions(forest, removedNode.getCoordX(), removedNode.getCoordY())){
				multipleOption++;
			}
			
			CoordNode[] nodeList = expandNode(forest, removedNode);
			for(CoordNode newCoordNode:nodeList){
				if(newCoordNode != null){
					queue.addFirst(newCoordNode);
				}
			}
			
			if(forest[queue.getFirst().getCoordX()][queue.getFirst().getCoordY()] == '*')
				break;
			
			forest[removedNode.getCoordX()][removedNode.getCoordY()] = 'M';
		}

		return multipleOption;
	}
	
	/**
	 * @param forest stores map of forest
	 * @param currentCoord is the variable will be expanded. 
	 * Neighbors of this point will be added to an array. Value of point(. or *) is not important
	 * @return CoordNode[] Neighbors of currentNode(left, up, right, down) will be returned in array
	 */
	public static CoordNode[] expandNode(char[][] forest, CoordNode currentCoord){
		int[] rowCol = getRowColSize(forest);
		int rowSize = rowCol[0];
		int colSize = rowCol[1];
		int row = currentCoord.getCoordX();
		int col = currentCoord.getCoordY();

		CoordNode[] nodeList = new CoordNode[4];
		
		if(col > 0){
			if(forest[row][col-1] == '.' || forest[row][col-1] == '*'){
				CoordNode left = new CoordNode(row, col-1);
				nodeList[0] = left;
			}
		}
		if(row > 0){
			if(forest[row-1][col] == '.' || forest[row-1][col] == '*'){
				CoordNode  up = new CoordNode(row-1, col);
				nodeList[1] = up;
			}
		}
		if(col < colSize-1){
			if(forest[row][col+1] == '.' || forest[row][col+1] == '*'){
				CoordNode right = new CoordNode(row, col+1);
				nodeList[2] = right;
			}
		}
		if(row < rowSize-1){
			if(forest[row+1][col] == '.' || forest[row+1][col] == '*'){
				CoordNode  down = new CoordNode(row+1, col);
				nodeList[3] = down;
			}
		}
		
		forest[row][col] = 'X';
		
		return nodeList;
	}
	
	
	/**
	 * @param forest stores map of forest
	 * @param row(x) coordinate of the point will be checked for multiple option(waving wand)
	 * @param col(y) coordinate of the point will be checked for multiple option(waving wand)
	 * @return boolean According whether coordinate has multiple way option or not
	 */
	public static boolean checkMultipleOptions(char[][] forest, int row, int col){
		int[] rowCol = getRowColSize(forest);
		int rowSize = rowCol[0];
		int colSize = rowCol[1];
		int options = 0;
		
		if(row > 0){
			if(forest[row-1][col] == '.' || forest[row-1][col] == '*'){
				options++;
			}
		}
		if(row < rowSize-1){
			if(forest[row+1][col] == '.' || forest[row+1][col] == '*'){
				options++;
			}
		}
		if(col < colSize-1){
			if(forest[row][col+1] == '.' || forest[row][col+1] == '*'){
				options++;
			}
		}
		if(col > 0){
			if(forest[row][col-1] == '.' || forest[row][col-1] == '*'){
				options++;
			}
		}

		if(options > 1)
			return true;
		else
			return false;
	}
	
	/**
	 * @param arr is the array size of it will be returned
	 * @return int[] first element represents row size, second represents column size
	 */
	public static int[] getRowColSize(char[][] arr){
		int[] rowCol = new int[2];
		rowCol[0] = arr.length;
		rowCol[1] = arr[0].length;
		return rowCol;
	}
	
	public static void printArray(char[][] arr){
		int i=0;
		for(char[] firstDim:arr){
			for(char secondDim:firstDim){
				System.out.print(secondDim);
			}
			System.out.println();
		}
	}
	
	public static void printLinkedList(LinkedList<CoordNode> queue){
		for(int i=0;i<queue.size();i++){
			System.out.println("x:" + queue.get(i).getCoordX() + "\ty:" + queue.get(i).getCoordY());
		}
	}

}

//Points in the forest will be represented as CoordNode object
class CoordNode{
	
	private int coordX;
	private int coordY;
	
	CoordNode(int x, int y){
		coordX = x;
		coordY = y;
	}
	
	public int getCoordX(){
		return coordX;
	}
	
	public int getCoordY(){
		return coordY;
	}
	
}
