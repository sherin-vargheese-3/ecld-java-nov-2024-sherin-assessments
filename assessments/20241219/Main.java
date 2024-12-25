import java.time.Duration;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TradingProcessor tradingProcessor = new TradingProcessor();

        try {
            // Add transactions
            tradingProcessor.processTransaction(new Transaction(1001L, "$", 1500.0, TransactionType.BUY));
            tradingProcessor.processTransaction(new Transaction(1002L, "$", 1000.0, TransactionType.BUY));
            tradingProcessor.processTransaction(new Transaction(1003L, "$", 100.0, TransactionType.SELL));

            System.out.println("Display all transactions-------------------");
            tradingProcessor.displayAll();

            // Get transactions in the last 1 hour
            Duration oneHour = Duration.ofHours(1);
            System.out.println("Transactions by time window of last hour-------------------");
            Iterator<Transaction> transactionsIterator = tradingProcessor.getTransactionsByTimeWindow(oneHour);
            while (transactionsIterator.hasNext()) {
                transactionsIterator.next().displayTransaction();
            }

            // Get aggregate amount for a symbol
            System.out.println("Aggregate amount-------------------");
            System.out.println("Total amount: $" + tradingProcessor.getAggregateAmount("$",oneHour));
            System.out.println();

            // Rollback a transaction
            System.out.println("Rollback Transaction-------------------");
            tradingProcessor.rollbackTransaction(1002L);
            System.out.println("Display all transactions after the rollback of transaction id 1002: ");
            tradingProcessor.displayAll();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
