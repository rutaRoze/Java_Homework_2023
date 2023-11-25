package lt.techin.bank;

import lt.itakademija.exam.*;

public class CurrencyConvertRoze implements CurrencyConverter {

    private CurrencyRatesProvider provider;


    public CurrencyConvertRoze(CurrencyRatesProvider currencyRatesProvider) {
        this.provider = currencyRatesProvider;
    }

    @Override
    public Money convert(Currency currencyFrom, Currency currencyTo, Money amount) {
        Money exchangeRate = provider.getRate(currencyFrom, currencyTo);
        if (exchangeRate == null) {
            throw new CurrencyConversionException("No rate for currency");
        }

        Money convertedMoney = exchangeRate.multiply(amount);

        return convertedMoney;
    }
}
