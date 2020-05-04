package org.example;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.lang.Math;
/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void my_OWN_TEST_of_add(){
        float number1=8.5f;
        float number2=10.5f;

        Assert.assertEquals(Math.round(App.addNum(number1,number2)), 19);
    }

    @Test
    public void given_number_add_number2_equal_and_resultadd_return_true(){
        float number1=8.5f, number2=10.5f;
        Assert.assertEquals(Math.round(App.addNum(number1,number2)), 19);
    }

    @Test
    public void given_number1_multiply_number2__and_resul_multiply_return_true(){
        float number1=9.5f, number2=10.0f;
        Assert.assertEquals(Math.round(App.mulNum(number1,number2)),95);
    }
    @Test
    public void given_number_subtract_number2_equal_and_result_subtract_return_true(){
        float number1=19f, number2=10f;
        Assert.assertEquals(Math.round(App.subNum(number1,number2)),9);
    }
    @Test
    public void given_number_divide_number2_equal_and_result_divide_return_true(){
        float number1=90f, number2=10f;
        Assert.assertEquals(Math.round(App.divNum(number1,number2)),9);
    }
}