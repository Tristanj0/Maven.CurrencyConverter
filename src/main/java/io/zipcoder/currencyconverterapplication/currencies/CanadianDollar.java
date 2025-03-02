package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {

    CurrencyType cana = CurrencyType.CANADIAN_DOLLAR;
    @Override
    public CurrencyType getType() {
        return cana;
    }
}
