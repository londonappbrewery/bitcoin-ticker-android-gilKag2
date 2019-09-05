package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mPrice;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try{
            BitcoinDataModel model = new BitcoinDataModel();

            model.mPrice = Double.toString(jsonObject.getDouble("last"));
            return  model;
        } catch (JSONException e) {e.printStackTrace();}
        return null;
    }

    public String getPrice() {
        return mPrice;
    }

}
