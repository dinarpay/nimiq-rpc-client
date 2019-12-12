package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * A transaction receipt object.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionReceipt {

    /** Hex-encoded hash of the transaction. */
    private String transactionHash;

    /** The transactions index position in the block. */
    private int transactionIndex;

    /** Hex-encoded hash of the block where this transaction was in. */
    private String blockHash;

    /** Block number where this transaction was in. */
    private int blockNumber;

    /**
     * Number of confirmations for this transaction (number of blocks on top of the
     * block where this transaction was in).
     */
    private int confirmations;

    /** Timestamp of the block where this transaction was in. */
    private int timestamp;

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public int getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(int transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "TransactionReceipt [blockHash=" + blockHash + ", blockNumber=" + blockNumber + ", confirmations="
                + confirmations + ", timestamp=" + timestamp + ", transactionHash=" + transactionHash
                + ", transactionIndex=" + transactionIndex + "]";
    }
}
