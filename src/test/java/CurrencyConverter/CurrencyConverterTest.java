package CurrencyConverter;

import org.junit.jupiter.api.Test;

class CurrencyConverterTest {


    @Test
    void isAddSuccess() {
        //given
        CurrencyConverter addMethod = new CurrencyConverter();

        //when
        addMethod.addCountryAndExchangeRate("UDS", 1.00);

        //then
    }

}
