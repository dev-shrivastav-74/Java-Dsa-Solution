package Array.twoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class SolutionTest {

    @Test
    void twoSumTest() {

        // Arrange
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        // Act
        int[] actual = Solution.twoSum(nums, target);

        // Assert
        assertArrayEquals(expected, actual);
    }
}