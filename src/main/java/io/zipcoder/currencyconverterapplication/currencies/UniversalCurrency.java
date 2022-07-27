package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {

    CurrencyType univ = CurrencyType.UNIVERSAL_CURRENCY;
    @Override
    public CurrencyType getType() {
        return univ;
    }
}
