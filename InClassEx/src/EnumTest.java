// Ryan Sweitzer
// 1-21-16
// The program shows examples for enumerations

public class EnumTest{
		enum Direction{ 
			NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
			private char abbr;
			
			private Direction(char letter){
				abbr = letter;
			}
			
			@Override
			public String toString(){
				return "Your direction is " + name() + " " + abbr;
			}
		
		
		}
		public static void main(String[] args){// type m, Ctrl + shift
			
			Direction myDirection = Direction.NORTH;
			Direction yourDirection = Direction.SOUTH;
			yourDirection = Direction.EAST;
			System.out.println("" + yourDirection + yourDirection.ordinal());
			
		}
}