import static java.util.Arrays.asList;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Ignore;
import org.junit.Test;

public class TestMergeSort {

	List<Integer> input = asList(8,3,2,6,9,7,1,5,4);
	
	@Ignore
	@Test
	public void sortAll() throws Exception {
		
		
		assertThat(MergeSort.sort(input),equalTo(asList(1,2,3,4,5,6,7,8,9)));
	}
	
	@Test
	public void sortSingleElement() throws Exception {
		assertThat(MergeSort.sort(input,0,0),equalTo(input));
		assertThat(MergeSort.sort(input,1,1),equalTo(input));
	}
}
