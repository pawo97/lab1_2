package lab2_2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Currency;

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

    @Test
    public void isReturnedValuAdded() {
        Money money = new Money(100);
        Money addValue = money.add(new Money(3));
        Money endValue = new Money(103);
        assertThat(addValue.equals(endValue), is(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isReturnedValuAddedWithExcepiton() {
        Money money = new Money(100, Currency.getInstance("EUR"));
        Money addValue = money.add(new Money(3, Currency.getInstance("USD")));
        Money endValue = new Money(103, Currency.getInstance("EUR"));
    }

}
