import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TradingProcessor implements TradingSystem {
    private List<Transaction> activeTransactions;
    private List<Transaction> historicalData;

    public TradingProcessor() {
        this.activeTransactions = new ArrayList<>();
        this.historicalData = new ArrayList<>();
    }

    @Override
    public void processTransaction(Transaction transaction) {  //Adding to both list.
        activeTransactions.add(transaction);
        historicalData.add(transaction);
    }

    @Override
    public void rollbackTransaction(Long transactionId) {
        historicalData.removeIf(transaction -> transaction.getTransactionId().equals(transactionId)); //Remove transaction by id.
    }

    @Override
    public Iterator<Transaction> getTransactionsByTimeWindow(Duration window) {
        LocalDateTime currentTime = LocalDateTime.now();
        List<Transaction> transactionFiltered = new ArrayList<>();
        for (Transaction transaction : activeTransactions) {
            if(Duration.between(transaction.getTimestamp(),currentTime).compareTo(window) <= 0) {  //Checking the duration of the transaction.
                transactionFiltered.add(transaction);
            }
        }
        return transactionFiltered.iterator();
    }

    @Override
    public double getAggregateAmount(String symbol, Duration window) {
        LocalDateTime currentTime = LocalDateTime.now();
        double totalAmount = 0.0;

        for (Transaction transaction : activeTransactions) {
            if(transaction.getSymbol().equals(symbol) &&  //Checking the symbol is matching or not
                    Duration.between(transaction.getTimestamp(),currentTime).compareTo(window) <= 0) {   //Checking the duration of the transaction, same above condition.
                totalAmount += transaction.getAmount();
            }
        }
        return totalAmount;
    }

    public void displayAll() {
        for (Transaction transaction : historicalData) {
            transaction.displayTransaction();
        }
    }
}