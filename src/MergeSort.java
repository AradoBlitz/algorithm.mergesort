import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static List<Integer> sort(List<Integer> asList) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Integer> sort(List<Integer> input, int left, int right) {
		
		if(input.get(left).equals(input.get(right)))
			return input;
		
		int middle = (int)((left+right)*0.5);
		
		sort(input,left,middle);
		sort(input,middle+1,right);
		merge(input,left,right,middle);
		
		return input;
	}

	public static void merge(List<Integer> input, int left, int right, int middle) {
		List<Integer> buffer = new ArrayList<>();
		
		int i = left;
		int j = middle + 1;
		while(i<=middle || j <= right){
			
			if(i>middle){
				buffer.add(input.get(j++));				
			} else if(j>right){
				buffer.add(input.get(i++));
			} else	if(input.get(i).intValue()>input.get(j).intValue()){
				buffer.add(input.get(j++));
			} else if(input.get(i).intValue()<input.get(j).intValue()){
				buffer.add(input.get(i++));					
			} else {
				buffer.add(input.get(i++));
				buffer.add(input.get(j++));
			}
		}					
		for(int k = 0, n = left;k<buffer.size();n++,k++)
			input.set(n, buffer.get(k));
	}

}
