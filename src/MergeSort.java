import java.util.List;

public class MergeSort {

	public static List<Integer> sort(List<Integer> asList) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Integer> sort(List<Integer> input, int i, int j) {
		
		int buff;
		if(input.get(i).intValue()>input.get(j).intValue()){
			buff=input.get(i);
			input.set(i, input.get(j));
			input.set(j, buff);
		}
		return input;
	}

}
