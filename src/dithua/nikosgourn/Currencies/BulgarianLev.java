package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class BulgarianLev extends Nomisma implements ICurrency{
    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();

    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("UK"), 0.4326 );
        exchangeRate.put(Utils.currencies.get("BG") , 0.5112);
        exchangeRate.put(Utils.currencies.get("US") , 0.5992);
        exchangeRate.put(Utils.currencies.get("JP") , 66.1711);
        exchangeRate.put(Utils.currencies.get("CZ") , 12.9774);
        exchangeRate.put(Utils.currencies.get("DN") , 3.8024);
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );

    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }
}
