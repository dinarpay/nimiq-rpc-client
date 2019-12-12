package com.nimiq;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * A block template object.
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockTemplate {

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Header {

        /** Version in block header. */
        private int version;

        /** 32-byte hex-encoded hash of the previous block. */
        private String prevHash;

        /** 32-byte hex-encoded hash of the interlink. */
        private String interlinkHash;

        /** 32-byte hex-encoded hash of the accounts tree. */
        private String accountsHash;

        /** Compact form of the hash target for this block. */
        private int nBits;

        /** Height of the block in the block chain (also known as block number). */
        private int height;

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getPrevHash() {
            return prevHash;
        }

        public void setPrevHash(String prevHash) {
            this.prevHash = prevHash;
        }

        public String getInterlinkHash() {
            return interlinkHash;
        }

        public void setInterlinkHash(String interlinkHash) {
            this.interlinkHash = interlinkHash;
        }

        public String getAccountsHash() {
            return accountsHash;
        }

        public void setAccountsHash(String accountsHash) {
            this.accountsHash = accountsHash;
        }

        public int getnBits() {
            return nBits;
        }

        public void setnBits(int nBits) {
            this.nBits = nBits;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Header [accountsHash=" + accountsHash + ", height=" + height + ", interlinkHash=" + interlinkHash
                    + ", nBits=" + nBits + ", prevHash=" + prevHash + ", version=" + version + "]";
        }
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Body {

        /** 32-byte hex-encoded hash of the block body. */
        private String hash;

        /** 20-byte hex-encoded miner address. */
        private String minerAddr;

        /** Hex-encoded value of the extra data field. */
        private String extraData;

        /** Array of hex-encoded transactions for this block. */
        private String[] transactions;

        /** Array of hex-encoded pruned accounts for this block. */
        private String[] prunedAccounts;

        /**
         * Array of hex-encoded hashes that verify the path of the miner address in the
         * merkle tree. This can be used to change the miner address easily.
         */
        private String[] merkleHashes;

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getMinerAddr() {
            return minerAddr;
        }

        public void setMinerAddr(String minerAddr) {
            this.minerAddr = minerAddr;
        }

        public String getExtraData() {
            return extraData;
        }

        public void setExtraData(String extraData) {
            this.extraData = extraData;
        }

        public String[] getTransactions() {
            return transactions;
        }

        public void setTransactions(String[] transactions) {
            this.transactions = transactions;
        }

        public String[] getPrunedAccounts() {
            return prunedAccounts;
        }

        public void setPrunedAccounts(String[] prunedAccounts) {
            this.prunedAccounts = prunedAccounts;
        }

        public String[] getMerkleHashes() {
            return merkleHashes;
        }

        public void setMerkleHashes(String[] merkleHashes) {
            this.merkleHashes = merkleHashes;
        }

        @Override
        public String toString() {
            return "Body [extraData=" + extraData + ", hash=" + hash + ", merkleHashes=" + Arrays.toString(merkleHashes)
                    + ", minerAddr=" + minerAddr + ", prunedAccounts=" + Arrays.toString(prunedAccounts)
                    + ", transactions=" + Arrays.toString(transactions) + "]";
        }
    }

    /** Block header. */
    private Header header;

    /** Hex-encoded block interlink. */
    private String interlink;

    /** Block body. */
    private Body body;

    /** Compact form of the hash target to submit a block to this client. */
    private int target;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getInterlink() {
        return interlink;
    }

    public void setInterlink(String interlink) {
        this.interlink = interlink;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "BlockTemplate [body=" + body + ", header=" + header + ", interlink=" + interlink + ", target=" + target
                + "]";
    }
}
