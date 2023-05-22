package CurrencyConverter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;

class CurrencyConverterTest {


    @Test
    public void isAddSuccess() {
        //given
        CurrencyConverter addMethod = new CurrencyConverter();

        //when
        addMethod.addCountryAndExchangeRate("USD", 1.00);

        //then
        assertThat(addMethod, hasEntry("USD", 1.00));

//        Map<String, String> map = new HashMap<>();
//        map.put("mike", "jag");
//        assertThat(map, hasEntry("mike", "jag"));
    }

}
