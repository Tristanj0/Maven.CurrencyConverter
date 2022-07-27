package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {

    CurrencyType cash = CurrencyType.US_DOLLAR;
    @Override
    public CurrencyType getType() {
        return cash;
    }
}
