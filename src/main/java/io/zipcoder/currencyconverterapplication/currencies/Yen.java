package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {

    CurrencyType ye = CurrencyType.YEN;
    @Override
    public CurrencyType getType() {
        return ye;
    }
}
