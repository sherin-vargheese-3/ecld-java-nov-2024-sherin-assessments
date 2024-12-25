import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class TradingProcessor implements TradingSystem {
    private Deque<Transaction> activeTransactions; // Efficient for sliding window
    private List<Transaction> historicalData;      // Archival storage

    public TradingProcessor() {
        this.activeTransactions = new LinkedList<>();
        this.historicalData = new ArrayList<>();
    }

    @Override
    public void processTransaction(Transaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction cannot be null");
        }
        activeTransactions.addLast(transaction);
        historicalData.add(transaction);
    }

    @Override
    public void rollbackTransaction(Long transactionId) {
        if (transactionId == null) {
            throw new IllegalArgumentException("Transaction ID cannot be null");
        }
        activeTransactions.removeIf(transaction -> transaction.getTransactionId().equals(transactionId));
        historicalData.removeIf(transaction -> transaction.getTransactionId().equals(transactionId));
    }

    @Override
    public Iterator<Transaction> getTransactionsByTimeWindow(Duration window) {
        if (window == null || window.isNegative() || window.isZero()) {
            throw new IllegalArgumentException("Invalid duration");
        }
        LocalDateTime now = LocalDateTime.now();
        List<Transaction> filtered = new ArrayList<>();
        for (Transaction transaction : activeTransactions) {
            if (Duration.between(transaction.getTimestamp(), now).compareTo(window) <= 0) {
                filtered.add(transaction);
            }
        }
        return filtered.iterator();
    }

    @Override
    public double getAggregateAmount(String symbol, Duration window) {
        if (symbol == null || window == null || window.isNegative() || window.isZero()) {
            throw new IllegalArgumentException("Invalid inputs for aggregate calculation");
        }
        LocalDateTime now = LocalDateTime.now();
        double total = 0.0;
        for (Transaction transaction : activeTransactions) {
            if (transaction.getSymbol().equals(symbol) &&
                    Duration.between(transaction.getTimestamp(), now).compareTo(window) <= 0) {
                total += transaction.getAmount();
            }
        }
        return total;
    }

    public void displayAll() {
        for (Transaction transaction : historicalData) {
            transaction.displayTransaction();
        }
    }
}
