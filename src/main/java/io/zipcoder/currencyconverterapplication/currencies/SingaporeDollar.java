package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {

    CurrencyType singa = CurrencyType.SINGAPORE_DOLLAR;
    @Override
    public CurrencyType getType() {
        return singa;
    }
}
