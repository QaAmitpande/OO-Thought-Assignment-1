
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PairOfNumberTest {
    @Test
    public void CheckPairOfNumber(){

        int[]arr={1,2,-1,-2,4,5,0,-9,10,40};
        int key=4;
        List<String> expectedOutput=new ArrayList<>();
        expectedOutput.add("{1,4}");
        expectedOutput.add("{2,-2}");
        expectedOutput.add("{-1,5}");
        expectedOutput.add("{4,0}");
        expectedOutput.add("{10,40}");

        List<String> actualOutput=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(new Calculate().sum(arr[i],arr[j])==key){
                    actualOutput.add(new Calculate().getPair(arr[i],arr[j]));
                }
                else if(new Calculate().diff(arr[i],arr[j])==key){
                    actualOutput.add(new Calculate().getPair(arr[i],arr[j]));
                }
                else if (new Calculate().mul(arr[i],arr[j])==key){
                    actualOutput.add(new Calculate().getPair(arr[i],arr[j]));
                }
                else if (new Calculate().div(arr[i],arr[j])==(float) key){
                    actualOutput.add(new Calculate().getPair(arr[i],arr[j]));
                }
            }
        }
        int i=0;
        for (String expected:expectedOutput){
            System.out.println(expected);
            Assert.assertEquals(actualOutput.get(i++),expected);
        }
    }
}