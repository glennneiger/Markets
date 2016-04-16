# Markets
Markets is an Android app for creating automatic option trades using the TradeKing API. Trades are opened and closed based on the position of various technical indicators. TradeKing’s API uses the FIXML protocol for creating orders. Any exchange traded option symbols can be entered, analyzed, and traded.

# Assumptions
Markets makes a few assumptions to speed up the rate at which trades are opened and closed.
* Put and call options are opened depending on direction of the trend.
* Premium is never sold, contracts are only purchased.
* Strike price: purchased at-the-money for both put and calls.
* Expiry Date: if running on Monday or Tuesday, the current week’s expiration. If trading Wednesday - Friday, the following weeks expiration. This is to keep delta up so fewer movements of the underlying are required.
* Quantity: 10 contracts - usually only requires a few cents movement in the contract price to overcome the brokers commissions.
* Limit orders are used for both opening and closing trades.
* only one trade can be opened at a time.

# Indicators
The following indicators are currently being calculated by the app. By default the indicators are calculated for the one minute time-frame. This can be adjusted using a different time interval in the timeless API call.
* RSI
* MACD/Signal
* Slow Stochastics
* 50 period EMA
* 200 period EMA

# Setup
Markets currently only operates with the TradeKing API. TradeKing has no minimum for access to their API which is ideal for starting algo trading. A TradeKing brokerage account is required.

Create a class titled APIKeys then copy the body of the APIKeysTemplate class into it. Populate your TradeKing API keys and account number and you’re good to go.
```java
public class APIKeys {

    //TradeKing API Keys
    public static final String CONSUMER_KEY = "";
    public static final String CONSUMER_SECRET = "";
    public static final String OAUTH_TOKEN = "";
    public static final String OAUTH_TOKEN_SECRET = "";

    //TradeKing account number
    public static final String ACCOUNT_NUMBER = "";

    public APIKeys(){

    }
}
```

# Process
A more detailed process document with code outline to come later.

The idea is trade assumptions are created ahead of time so when opening trade conditions are met, an order can be opened quickly. When closing conditions are met, the trade can be closed equally quickly. The above assumptions outline the default contracts that will be traded, these can and should be adjusted to fit your needs.

There are two phases the app works through. Phase one consists mainly of analyzing the current symbol technical indicators and wait for an appropriate time to enter a trade. When that time comes, the analysis loop stops, instantiates the trade object and creates the opening trade. If the trade is opened successfully phase two begins. Phase two analyzes the current conditions against the open trade. When conditions are met (good or bad) the phase two analysis loop stops and the closing trade is executed. 

Pressing “Start” begins the analysis loop of phase one. Stop ends it. If a trade is already open when start is pushed, the app will begin phase two (closing analysis) immediately.

