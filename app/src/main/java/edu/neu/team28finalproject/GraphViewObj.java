package edu.neu.team28finalproject;

import com.github.mikephil.charting.data.LineData;

public class GraphViewObj {

    private final String ticker;
    private final LineData entries;

    public GraphViewObj(String ticker, LineData entries) {
        this.ticker = ticker;
        this.entries = entries;
    }

    public String getTicker() {
        return this.ticker;
    }

    public LineData getEntries() {
        return entries;
    }

}