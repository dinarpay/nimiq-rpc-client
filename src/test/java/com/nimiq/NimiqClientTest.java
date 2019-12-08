
package com.nimiq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * NimiqClientTest<br/>
 * Assumes a Nimiq node is started locally:
 * 
 * <pre>
 * nodejs index.js --protocol=dumb --type=full --network=main --rpc
 * </pre>
 */
public class NimiqClientTest {

    private static NimiqClient client;

    @BeforeClass
    public static void createClient() throws MalformedURLException {
        URL url = new URL("http://localhost:8648/");
        client = new NimiqClientFactory(url).getClient();
    }

    // Network

    @Test
    public void testPeerCount() {
        assertTrue(client.peerCount() > 0);
    }

    // TODO @Test public void testSyncing() { }

    @Test
    public void testConsensus() {
        assertEquals("established", client.consensus());
    }

    // TODO @Test public void testPeerList() { }

    // TODO @Test public void testPeerState() { }

    // Transactions

    // TODO @Test public void testSendRawTransaction() { }

    // TODO @Test public void testCreateRawTransaction() { }

    // TODO @Test public void testSendTransaction() { }

    // TODO @Test public void testGetRawTransactionInfo() { }

    // TODO @Test public void testGetTransactionByBlockHashAndIndex() { }

    // TODO @Test public void testGetTransactionByBlockNumberAndIndex() { }

    // TODO @Test public void testGetTransactionByHash() { }

    // TODO @Test public void testGetTransactionReceipt() { }

    // TODO @Test public void testGetTransactionsByAddress() { }

    // TODO @Test public void testMempoolContent() { }

    // TODO @Test public void testMempool() { }

    // TODO @Test public void testMinFeePerByte() { }

    // Miner

    // TODO @Test public void testMining() { }

    // TODO @Test public void testHashrate() { }

    // TODO @Test public void testMinerThreads() { }

    // TODO @Test public void testMinerAddress() { }

    // TODO @Test public void testPool() { }

    // TODO @Test public void testPoolConnectionState() { }

    // TODO @Test public void testPoolConfirmedBalance() { }

    // TODO @Test public void testGetWork() { }

    // TODO @Test public void testGetBlockTemplate() { }

    // TODO @Test public void testSubmitBlock() { }

    // Accounts

    // TODO @Test public void testAccounts() { }

    // TODO @Test public void testCreateAccount() { }

    // TODO @Test public void testGetBalance() { }

    // TODO @Test public void testGetAccount() { }

    // Blockchain

    @Test
    public void testBlockNumber() {
        assertTrue(client.blockNumber() > 0);
    }

    // TODO @Test public void testGetBlockTransactionCountByHash() { }

    // TODO @Test public void testGetBlockTransactionCountByNumber() { }

    // TODO @Test public void testGetBlockByHash() { }

    @Test
    public void testGetBlockByNumber() {
        int number = 100105;
        Block block = client.getBlockByNumber(number);
        assertEquals(number, block.getNumber());
    }

    // Misc

    // TODO @Test public void testConstant() { }

    // TODO @Test public void testLog() { }

}
