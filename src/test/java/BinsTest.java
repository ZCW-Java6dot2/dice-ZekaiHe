
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinsTest {
    @Test
    void testConstructor(){
        //given
        Integer expectedMin = 2;
        Integer expectedMax = 12;
        Bins bins = new Bins(expectedMin,expectedMax);
        //when
        Integer actualMin = bins.getBinMin();
        Integer actualMax = bins.getBinMax();
        //then
        Assertions.assertEquals(expectedMin,actualMin);
        Assertions.assertEquals(expectedMax,actualMax);
    }

    @Test
    void incrementBinAndGetBinTest(){
        //given
        Integer minRoll = 2;
        Integer maxRoll = 12;

        //when
        Integer result = 2; //snake eyes
        Integer rolls = 10;
        Bins bins = new Bins(minRoll,maxRoll);
        for(int i=1; i<=rolls; i++){
            bins.incrementBin(result);
        }
        Integer actual = bins.getBin(result-2);
        //then
        Assertions.assertEquals(rolls,actual);
    }
}
