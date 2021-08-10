package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class USDollar  extends Nomisma implements ICurrency {

    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();

    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("EU"), 0.85187);
        exchangeRate.put(Utils.currencies.get("JP"), 110.4190);
        exchangeRate.put(Utils.currencies.get("BG"), 1.666);
        exchangeRate.put(Utils.currencies.get("CZ"), 21.6);
        exchangeRate.put(Utils.currencies.get("DN"), 6.3355);
        exchangeRate.put(Utils.currencies.get("UK") , 0.7218);
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );
    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }
}
