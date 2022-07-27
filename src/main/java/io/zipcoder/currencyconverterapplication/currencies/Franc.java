package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {

    CurrencyType fran = CurrencyType.FRANC;
    @Override
    public CurrencyType getType() {
        return fran;
    }
}
