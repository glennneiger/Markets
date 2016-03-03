package com.chariotinstruments.markets;

/**
 * Created by user on 3/2/16.
 */
public class StockQuote {

    private String symbol;
    private double askPrice;
    private double askSize; //in 100s
    private double bidPrice;
    private double bidSize; //in 100s
    private double dayHighPrice;
    private double dayLowPrice;
    private long cumulativeVolume;
    private long time;

    public StockQuote(String symbol){
        this.symbol = symbol;
    }

    public void setStockQuoteData(double askPriceIn, double askSizeIn, double bidPriceIn, double bidSizeIn, double dayHighPriceIn, double dayLowPriceIn, long cumulativeVolumeIn, long timeIn){
        this.askPrice = askPriceIn;
        this.askSize = askSizeIn;
        this.bidPrice = bidPriceIn;
        this.bidSize = bidSizeIn;
        this.dayHighPrice = dayHighPriceIn;
        this.dayLowPrice = dayLowPriceIn;
        this.cumulativeVolume = cumulativeVolumeIn;
        this.time = timeIn;
    }

    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String sym){
        symbol = sym;
    }

    public double getAskPrice(){
        return askPrice;
    }

    public void setAskPrice(double ask){
        askPrice = ask;
    }

    public double getAskSize(){
        return askSize;
    }

    public void setAskSize(double ask){
        askSize = ask;
    }

    public double getBidPrice(){
        return bidPrice;
    }

    public void setBidPrice(double bid){
        bidPrice = bid;
    }

    public double getBidSize(){
        return bidSize;
    }

    public void setBidSize(double bid){
        bidSize = bid;
    }

    public double getDayHighPrice(){
        return dayHighPrice;
    }

    public void setDayHighPrice(double dayHigh){
        dayHighPrice = dayHigh;
    }

    public double getDayLowPrice(){
        return dayLowPrice;
    }

    public void setDayLowPrice(double dayLow){
        dayLowPrice = dayLow;
    }

    public long getCumulativeVolume(){
        return cumulativeVolume;
    }

    public void setCumulativeVolume(long cumIn){
        cumulativeVolume = cumIn;
    }

    public Long getTime(){
        return time;
    }

    public void setTime(long timeIn){
        time = timeIn;
    }
}
