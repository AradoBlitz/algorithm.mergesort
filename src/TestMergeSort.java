import static java.util.Arrays.asList;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class TestMergeSort {

	@Test
	public void sortAll() throws Exception {
		
		assertThat(MergeSort.sort(asList(8,3,2,6,9,7,1,5,4)),equalTo(asList(1,2,3,4,5,6,7,8,9)));
	}
}
