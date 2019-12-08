package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Details on a block.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

    /** Height of the block. */
    private int number;

    /** Hex-encoded 32-byte hash of the block. */
    private String hash;

    /** Hex-encoded 32-byte Proof-of-Work hash of the block. */
    private String pow;

    /** Hex-encoded 32-byte hash of the predecessor block. */
    private String parentHash;

    /** The nonce of the block used to fulfill the Proof-of-Work. */
    private int nonce;

    /** Hex-encoded 32-byte hash of the block body merkel root. */
    private String bodyHash;

    /** Hex-encoded 32-byte hash of the accounts tree root. */
    private String accountHash;

    /** Hex-encoded 20 byte address of the miner of the block. */
    private String miner;

    /** User friendly address (NQ-address) of the miner of the block. */
    private String minerAddress;

    /** Block difficulty, encoded as decimal number in string. (TODO) */
    private String difficulty;

    /** Hex-encoded value of the extra data field, maximum of 255 bytes. */
    private String extraData;

    /** Block size in byte. */
    private int size;

    /** UNIX timestamp of the block */
    private int timestamp;

    /** Number of confirmations of the block */
    private int confirmations;

    /**
     * Array of transactions. Either represented by the transaction hash or a
     * Transaction object.
     */
    // TODO private transactions;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPow() {
        return pow;
    }

    public void setPow(String pow) {
        this.pow = pow;
    }

    public String getParentHash() {
        return parentHash;
    }

    public void setParentHash(String parentHash) {
        this.parentHash = parentHash;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getBodyHash() {
        return bodyHash;
    }

    public void setBodyHash(String bodyHash) {
        this.bodyHash = bodyHash;
    }

    public String getAccountHash() {
        return accountHash;
    }

    public void setAccountHash(String accountHash) {
        this.accountHash = accountHash;
    }

    public String getMiner() {
        return miner;
    }

    public void setMiner(String miner) {
        this.miner = miner;
    }

    public String getMinerAddress() {
        return minerAddress;
    }

    public void setMinerAddress(String minerAddress) {
        this.minerAddress = minerAddress;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

}
