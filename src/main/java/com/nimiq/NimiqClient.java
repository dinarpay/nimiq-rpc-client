package com.nimiq;

/**
 * This class allows to call RPC API of a Nimiq node.
 * 
 * @see https://github.com/nimiq/core-js/wiki/JSON-RPC-API
 * @see https://github.com/nimiq/core-js/blob/master/clients/nodejs/modules/JsonRpcServer.js
 */
public interface NimiqClient {

    // Network

    /**
     * Returns number of peers currently connected to the client.
     * 
     * @return the number of connected peers.
     */
    public int peerCount();

    // TODO public ? syncing();

    /**
     * Returns information on the current consensus stat
     * 
     * @return String describing the consensus state. "established" is the value for
     *         a good state, other values indicate bad state
     */
    public String consensus();

    // TODO public ? peerList();

    // TODO public ? peerState();

    // Transactions

    // TODO public ? sendRawTransaction();

    // TODO public ? createRawTransaction();

    // TODO public ? sendTransaction();

    // TODO public ? getRawTransactionInfo();

    // TODO public ? getTransactionByBlockHashAndIndex();

    // TODO public ? getTransactionByBlockNumberAndIndex();

    // TODO public ? getTransactionByHash();

    // TODO public ? getTransactionReceipt();

    // TODO public ? getTransactionsByAddress();

    // TODO public ? mempoolContent();

    // TODO public ? mempool();

    // TODO public ? minFeePerByte();

    // Miner

    // TODO public ? mining();

    // TODO public ? hashrate();

    // TODO public ? minerThreads();

    // TODO public ? minerAddress();

    // TODO public ? pool();

    // TODO public ? poolConnectionState();

    // TODO public ? poolConfirmedBalance();

    // TODO public ? getWork();

    // TODO public ? getBlockTemplate();

    // TODO public ? submitBlock();

    // Accounts

    // TODO public ? accounts();

    // TODO public ? createAccount();

    // TODO public ? getBalance();

    // TODO public ? getAccount();

    // Blockchain

    /**
     * Returns the height of most recent block.
     * 
     * @return The current block height the client is on.
     */
    public int blockNumber();

    // TODO public ? getBlockTransactionCountByHash();

    // TODO public ? getBlockTransactionCountByNumber();

    // TODO public ? getBlockByHash();

    /**
     * Returns information about a block by block number.
     * 
     * @param number The height of the block to gather information on.
     * @return A block object or null when no block was found. FIXME: Actually
     *         throws 'Invalid height'
     */
    public Block getBlockByNumber(int number);

    /**
     * Returns information about a block by block number.
     * 
     * @param number              The height of the block to gather information on.
     * @param includeTransactions If true it returns the full transaction objects,
     *                            if false only the hashes of the transactions.
     * @return A block object or null when no block was found. FIXME: Actually
     *         throws 'Invalid height'
     */
    public Block getBlockByNumber(int number, boolean includeTransactions);

    // Misc

    // TODO public ? constant();

    // TODO public ? log();

}
