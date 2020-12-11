package ArrayAssignment;


class ArraySearch
{
public static void main(String[] args) {
		
		String[] arrayString = new String[] { "one","two","three","four","five"};
		String searchString = "two";

		
		for(int index = 0; index<arrayString.length;index++){

			if(arrayString[index].equals(searchString)){

			
				System.out.println(index);
			}
}
}