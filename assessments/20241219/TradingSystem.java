import java.util.Iterator;
import java.time.Duration;

public interface TradingSystem {

    void processTransaction(Transaction transaction);
    void rollbackTransaction(Long transactionId);
    Iterator<Transaction> getTransactionsByTimeWindow(Duration window);
    double getAggregateAmount(String symbol, Duration window);
}
