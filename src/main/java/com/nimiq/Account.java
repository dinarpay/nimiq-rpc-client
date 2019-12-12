package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Details on an account.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    public enum Type {
        BASIC, VESTING, HTLC;
    }

    /** Hex-encoded 20 byte address. */
    private String id;

    /** User friendly address (NQ-address). */
    private String address;

    /** Balance of the account (in smallest unit). */
    private long balance;

    /**
     * The account type associated with the account (BASIC: 0, VESTING: 1, HTLC: 2).
     */
    private Type type;

    // Vesting contract fields

    /** Hex-encoded 20 byte address of the owner of the vesting contract. */
    private String owner;

    /** User friendly address (NQ-address) of the owner of the vesting contract. */
    private String ownerAddress;

    /** The block that the vesting contracted commenced. */
    private int vestingStart;

    /**
     * The number of blocks after which some part of the vested funds is released.
     */
    private int vestingStepBlocks;

    /** The amount (in smallest unit) released every vestingStepBlocks blocks. */
    private long vestingStepAmount;

    /**
     * The total amount (in smallest unit) that was provided at the contract
     * creation.
     */
    private long vestingTotalAmount;

    // HTLC fields

    /** Hex-encoded 20 byte address of the sender of the HTLC. */
    private String sender;

    /** User friendly address (NQ-address) of the sender of the HTLC. */
    private String senderAddress;

    /** Hex-encoded 20 byte address of the recipient of the HTLC. */
    private String recipient;

    /** User friendly address (NQ-address) of the recipient of the HTLC. */
    private String recipientAddress;

    /** Hex-encoded 32 byte hash root. */
    private String hashRoot;

    /** Number of hashes this HTLC is split into. */
    private int hashCount;

    /**
     * Block after which the contract can only be used by the original sender to
     * recover funds.
     */
    private int timeout;

    /**
     * The total amount (in smallest unit) that was provided at the contract
     * creation.
     */
    private long totalAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getVestingStart() {
        return vestingStart;
    }

    public void setVestingStart(int vestingStart) {
        this.vestingStart = vestingStart;
    }

    public int getVestingStepBlocks() {
        return vestingStepBlocks;
    }

    public void setVestingStepBlocks(int vestingStepBlocks) {
        this.vestingStepBlocks = vestingStepBlocks;
    }

    public long getVestingStepAmount() {
        return vestingStepAmount;
    }

    public void setVestingStepAmount(long vestingStepAmount) {
        this.vestingStepAmount = vestingStepAmount;
    }

    public long getVestingTotalAmount() {
        return vestingTotalAmount;
    }

    public void setVestingTotalAmount(long vestingTotalAmount) {
        this.vestingTotalAmount = vestingTotalAmount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getHashRoot() {
        return hashRoot;
    }

    public void setHashRoot(String hashRoot) {
        this.hashRoot = hashRoot;
    }

    public int getHashCount() {
        return hashCount;
    }

    public void setHashCount(int hashCount) {
        this.hashCount = hashCount;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Account [address=" + address + ", balance=" + balance + ", id=" + id + ", type=" + type + "]";
    }
}
