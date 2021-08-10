package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class JapaneseYen extends Nomisma implements ICurrency{
    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();

    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("UK"), 0.00653 );
        exchangeRate.put(Utils.currencies.get("EU") , 0.0077);
        exchangeRate.put(Utils.currencies.get("US") , 0.0090);
        exchangeRate.put(Utils.currencies.get("DN") , 0.0574);
        exchangeRate.put(Utils.currencies.get("BG") , 0.0151);
        exchangeRate.put(Utils.currencies.get("CZ") , 0.1960);
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );

    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }
}
