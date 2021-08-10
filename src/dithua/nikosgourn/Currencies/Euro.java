package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class Euro extends Nomisma implements ICurrency {

    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();
    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("US"), 1.1761);
        exchangeRate.put(Utils.currencies.get("JP"),129.50);
        exchangeRate.put(Utils.currencies.get("BG"),1.9558);
        exchangeRate.put(Utils.currencies.get("CZ"),25.391);
        exchangeRate.put(Utils.currencies.get("DN"),7.4370);
        exchangeRate.put(Utils.currencies.get("UK") , 0.8460);
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );
    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }

}
