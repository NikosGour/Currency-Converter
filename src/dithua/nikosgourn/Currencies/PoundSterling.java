package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class PoundSterling extends Nomisma implements ICurrency {
    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();

    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("EU") , 1.1815);
        exchangeRate.put(Utils.currencies.get("US") , 1.3857);
        exchangeRate.put(Utils.currencies.get("JP"),153.13 );
        exchangeRate.put(Utils.currencies.get("BG"), 2.3112 );
        exchangeRate.put(Utils.currencies.get("DN"), 8.7891 );
        exchangeRate.put(Utils.currencies.get("CZ"), 29.9961 );
//        exchangeRate.put(new , );
//        exchangeRate.put(new , );
//        exchangeRate.put(new , );

    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }
}
