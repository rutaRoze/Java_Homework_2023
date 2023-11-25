package lt.techin.bank;

import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

public class MyTest extends BaseTest {
    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return new BankRoze(currencyConverter);
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return new CurrencyConvertRoze(currencyRatesProvider);
    }
}
