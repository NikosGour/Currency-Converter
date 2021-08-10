package dithua.nikosgourn.Currencies;

import dithua.nikosgourn.assets.Utils;

import java.util.HashMap;

public class DanishKrone extends Nomisma implements ICurrency{
    public static HashMap<Nomisma, Double> exchangeRate = new HashMap<>();

    @Override
    public void setExchangeRates() {
        exchangeRate.put(Utils.currencies.get("UK"),  0.1137);
        exchangeRate.put(Utils.currencies.get("EU") , 0.1344);
        exchangeRate.put(Utils.currencies.get("US") , 0.1576);
        exchangeRate.put(Utils.currencies.get("JP") , 17.4081);
        exchangeRate.put(Utils.currencies.get("BG") , 0.2629);
        exchangeRate.put(Utils.currencies.get("CZ") , 3.4126);
//        exchangeRate.put(Utils.currencies.get("") , );
//        exchangeRate.put(Utils.currencies.get("") , );

    }

    @Override
    public HashMap<Nomisma, Double> getExchangeRate() {
        return exchangeRate;
    }
}
