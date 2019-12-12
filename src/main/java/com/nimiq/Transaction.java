
package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Details on a transaction.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

    /** Hex-encoded hash of the transaction. */
    private String hash;

    /** Hex-encoded hash of the block containing the transaction. */
    private String blockHash;

    /** Height of the block containing the transaction. */
    private int blockNumber;

    /** UNIX timestamp of the block containing the transaction. */
    private int timestamp;

    /** Number of confirmations of the block containing the transaction. */
    private int confirmations;

    /** Index of the transaction in the block. */
    private int transactionIndex;

    /** Hex-encoded address of the sending account. */
    private String from;

    /** Nimiq user friendly address (NQ-address) of the sending account. */
    private String fromAddress;

    /** Hex-encoded address of the recipient account. */
    private String to;

    /** Nimiq user friendly address (NQ-address) of the recipient account. */
    private String toAddress;

    /** Integer of the value (in smallest unit) sent with this transaction. */
    private long value;

    /** Integer of the fee (in smallest unit) for this transaction. */
    private long fee;

    /** Hex-encoded contract parameters or a message. */
    private String data;

    /** Bit-encoded transaction flags. */
    private int flags;

    /**
     * Whether this transaction has been successfully verified and found valid.
     * <b>Note:</b> This field only makes sense when the Transaction object was
     * returned by {@link NimiqClient#getRawTransactionInfo(String)}
     */
    private boolean valid = true;

    /**
     * Whether this transaction is currently in the mempool. <b>Note:</b> This field
     * only makes sense when the Transaction object was returned by
     * {@link NimiqClient#getRawTransactionInfo(String)}
     */
    // FIXME: https://github.com/nimiq/core-js/issues/529
    private boolean inMempool;

    public Transaction() {
    }

    public Transaction(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(int transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isInMempool() {
        return inMempool;
    }

    public void setInMempool(boolean inMempool) {
        this.inMempool = inMempool;
    }

    @Override
    public String toString() {
        return "Transaction [blockHash=" + blockHash + ", blockNumber=" + blockNumber + ", confirmations="
                + confirmations + ", data=" + data + ", fee=" + fee + ", flags=" + flags + ", from=" + from
                + ", fromAddress=" + fromAddress + ", hash=" + hash + ", timestamp=" + timestamp + ", to=" + to
                + ", toAddress=" + toAddress + ", transactionIndex=" + transactionIndex + ", value=" + value + "]";
    }
}
