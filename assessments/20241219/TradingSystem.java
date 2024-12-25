import java.time.Duration;
import java.util.Iterator;

public interface TradingSystem {
    void processTransaction(Transaction transaction);
    void rollbackTransaction(Long transactionId);
    Iterator<Transaction> getTransactionsByTimeWindow(Duration window);
    double getAggregateAmount(String symbol, Duration window);
}
