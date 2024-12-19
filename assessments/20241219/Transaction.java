import java.time.LocalDateTime;

class Transaction {

    private Long transactionId;
    private String symbol;
    private double amount;
    private TransactionType type;
    private LocalDateTime timestamp;

    public Transaction(Long transactionId, String symbol, double amount, TransactionType type) {
        this.transactionId = transactionId;
        this.symbol = symbol;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

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

    public void displayTransaction() {
        System.out.println("Transaction Id: " + getTransactionId());
        System.out.println("Transaction Amount: " + getSymbol() + getAmount());
        System.out.println("Transaction Type: " + getType());
        System.out.println("Transaction Timestamp: " + getTimestamp());
        System.out.println();
    }
}
