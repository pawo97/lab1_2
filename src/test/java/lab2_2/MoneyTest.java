package lab2_2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyTest {

    @Test
    public void isReturnedValueMultiplied() {
        Money money = new Money(100);
        Money multipliedValue = money.multiplyBy(3);
        Money endValue = new Money(300);
        assertThat(multipliedValue.equals(endValue), is(true));
    }

}
