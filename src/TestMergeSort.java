import static java.util.Arrays.asList;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Ignore;
import org.junit.Test;

public class TestMergeSort {

	List<Integer> input = asList(8,3,2,6,9,7,1,5,4);
	
	
	@Test
	public void sortAll() throws Exception {
		
		
		assertThat(MergeSort.sort(input,0,8),equalTo(asList(1,2,3,4,5,6,7,8,9)));
	}
	
	@Test
	public void sortSingleElement() throws Exception {
		
		assertThat(MergeSort.sort(input,0,0),equalTo(asList(8,3,2,6,9,7,1,5,4)));
		assertThat(MergeSort.sort(input,1,1),equalTo(asList(8,3,2,6,9,7,1,5,4)));
	}
	
	@Test
	public void sortTwoSizeArrays() throws Exception {
		
		assertThat(MergeSort.sort(input,0,1),equalTo(asList(3,8,2,6,9,7,1,5,4)));
		assertThat(MergeSort.sort(input,2,3),equalTo(asList(3,8,2,6,9,7,1,5,4)));
	}
	
	@Test
	public void sortFourElements() throws Exception {
		input = MergeSort.sort(input,0,1);
		assertThat(MergeSort.sort(input,0,3),equalTo(asList(2,3,6,8,9,7,1,5,4)));
	}
	
	@Test
	public void mergeSample() throws Exception {
		List<Integer> input = Arrays.asList(3, 8, 2, 6, 9, 7, 1, 5, 4);
		
		
		
		MergeSort.merge(input,0,3,1);			
		assertThat(input,equalTo(asList(2,3,6,8,9,7,1,5,4)));
		
		//Прошел успешно
		MergeSort.merge(this.input,0,1,0);			
		assertThat(this.input,equalTo(asList(3,8,2,6,9,7,1,5,4)));
		
		//Зациклил программу
		MergeSort.merge(this.input,2,3,2);			
		assertThat(this.input,equalTo(asList(3,8,2,6,9,7,1,5,4)));
		
		
	}
}
