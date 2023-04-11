import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class QuicksortTests {

    @Test
    public void testSortedArrayQuicksort() {
        // Test case 1: Sort an already sorted array
        int[] arr1 = {1, 2, 3, 4, 5};
        QuickSort.quickSort(arr1, 0, arr1.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr1);
    }

    @Test
    public void testReverseSortedArrayQuicksort() {
        // Test case 2: Sort a reverse-sorted array
        int[] arr2 = {5, 4, 3, 2, 1};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr2);
    }

    @Test
    public void testDuplicateElementsArrayQuicksort() {
        // Test case 3: Sort an array with duplicate elements
        int[] arr3 = {3, 1, 2, 1, 3};
        QuickSort.quickSort(arr3, 0, arr3.length - 1);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, arr3);
    }

    @Test
    public void testNegativeElementsArrayQuicksort() {
        // Test case 4: Sort an array with negative elements
        int[] arr4 = {-5, 0, 2, -3, 4};
        QuickSort.quickSort(arr4, 0, arr4.length - 1);
        assertArrayEquals(new int[]{-5, -3, 0, 2, 4}, arr4);
    }

    @Test
    public void testOneElementArrayQuicksort() {
        // Test case 5: Sort an array with only one element
        int[] arr1 = {1};
        QuickSort.quickSort(arr1, 0, 0);
        assertArrayEquals(new int[]{1}, arr1);
    }

    @Test
    public void testEqualElementsArrayQuicksort() {
        // Test case 6: Sort an array with all elements equal
        int[] arr2 = {2, 2, 2, 2, 2};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, arr2);

    }

    @Test
    public void testLargeNumbersArrayQuicksort() {

        // Test case 7: Sort an array with large numbers
        int[] arr3 = {1000000, 200000, 30000, 4000, 500};
        QuickSort.quickSort(arr3, 0, arr3.length - 1);
        assertArrayEquals(new int[]{500, 4000, 30000, 200000, 1000000}, arr3);
    }

    @Test
    public void testRandomElementsLargeArrayQuicksort() {
        // Test case 8: Sort a large array with random elements
        int[] arr4 = new int[1000];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 1000);
        }
        QuickSort.quickSort(arr4, 0, arr4.length - 1);
        for (int i = 0; i < arr4.length - 1; i++) {
            assertTrue(arr4[i] <= arr4[i + 1]);
        }

    }

}
