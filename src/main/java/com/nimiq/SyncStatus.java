package com.nimiq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Synchronization status.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyncStatus {

    /**
     * Whether the node is syncing with the network.
     */
    private boolean syncing;

    /**
     * The block at which the import started. (will only be reset, after the sync
     * reached his head)
     */
    private int startingBlock;

    /** The current block, same as blockNumber. */
    private int currentBlock;

    /** The estimated highest block. */
    private int highestBlock;

    public SyncStatus() {
        this.syncing = true;
    }

    public SyncStatus(boolean syncing) {
        this.syncing = syncing;
    }

    public boolean isSyncing() {
        return syncing;
    }

    public int getStartingBlock() {
        return startingBlock;
    }

    public void setStartingBlock(int startingBlock) {
        this.startingBlock = startingBlock;
    }

    public int getCurrentBlock() {
        return currentBlock;
    }

    public void setCurrentBlock(int currentBlock) {
        this.currentBlock = currentBlock;
    }

    public int getHighestBlock() {
        return highestBlock;
    }

    public void setHighestBlock(int highestBlock) {
        this.highestBlock = highestBlock;
    }

    @Override
    public String toString() {
        return "SyncStatus [currentBlock=" + currentBlock + ", highestBlock=" + highestBlock + ", startingBlock="
                + startingBlock + ", syncing=" + syncing + "]";
    }
}
