import java.time.LocalDateTime;

public class Transaction {
    private final Long transactionId;
    private final String symbol;
    private final double amount;
    private final TransactionType type;
    private final LocalDateTime timestamp;

    public Transaction(Long transactionId, String symbol, double amount, TransactionType type) {
        if (transactionId == null || symbol == null || amount <= 0 || type == null) {
            throw new IllegalArgumentException("Invalid transaction data");
        }
        this.transactionId = transactionId;
        this.symbol = symbol;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public Long getTransactionId() {
        return transactionId;
    }
    public String getSymbol() {
        return symbol;
    }
    public double getAmount() {
        return amount;
    }
    public TransactionType getType() {
        return type;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // Display transaction details
    public void displayTransaction() {
        System.out.println("Transaction Id: " + getTransactionId());
        System.out.println("Transaction Amount: " + getSymbol() + getAmount());
        System.out.println("Transaction Type: " + getType());
        System.out.println("Transaction Timestamp: " + getTimestamp());
        System.out.println();
    }
}
