import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test Algorithm classes
 */

public class TestAlgorithm {

    private LongestIncreaseSubsequence longestIncreaseSubsequence;

    @Test
    public void testLISNSquare(){
        //case 1
        int[] nums = new int[]{10,9,2,5,3,7,101,18};

        int result = longestIncreaseSubsequence.lisWithNSquareSolution(nums);

        Assert.assertEquals(result, 4);
        Assert.assertNotEquals(result, 3);

        //case 2
        int[] numsEmpty = new int[]{};

        int resultEmpty = longestIncreaseSubsequence.lisWithNSquareSolution(numsEmpty);

        Assert.assertEquals(resultEmpty, 0);

        //case 3
        int[] numsWithOne = new int[]{1};
        int resultWithOne = longestIncreaseSubsequence.lisWithNSquareSolution(numsWithOne);
        Assert.assertEquals(resultWithOne, 1);

        System.out.println("Test of N^2 finished");
    }

    @Test
    public void testLISNLogN() {
        //test with 4 elem
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int result = longestIncreaseSubsequence.listWithNLogNSolution(nums);
        Assert.assertEquals(result, 4);

        //test with 6 elem
        int[] nums1 = new int[]{10,9,2,5,3,7,101,18,1,3,4,5,6,7};
        int result1 = longestIncreaseSubsequence.listWithNLogNSolution(nums1);
        Assert.assertEquals(result1, 6);

        //test empty elem
        int[] numEmpty = new int[]{};
        int resultEmpty = longestIncreaseSubsequence.listWithNLogNSolution(numEmpty);
        Assert.assertEquals(resultEmpty, 0);

        //test one elem
        int[] numOne = new int[]{1};
        int resultOne = longestIncreaseSubsequence.listWithNLogNSolution(numOne);
        Assert.assertEquals(resultOne, 1);

        System.out.println("Test of NlogN finished");
    }
}
