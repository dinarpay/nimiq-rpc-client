# Nimiq RPC client for Java

JSON RPC client library for the [Nimiq node](https://github.com/nimiq/core-js) written in Java.
You can check the original documentation [here](https://github.com/nimiq/core-js/wiki/JSON-RPC-API).

## Build and install

```
mvn -DskipTests source:jar javadoc:jar install
```

## Test

You need a test Nimiq node started like this:
```
nodejs index.js --protocol=dumb --type=full --network=test --rpc
```
There must be a wallet funded with a few hundred NIM. To run the test:
```
mvn test
```

## Usage

Add the dependency to your `pom.xml`:
```xml
<dependency>
    <groupId>com.nimiq</groupId>
    <artifactId>nimiq-rpc-client</artifactId>
    <version>1.0</version>
</dependency>
```

Here's a simple example that reports the info about the current head block and its miner account:
```java
NimiqClientFactory clientFactory = new NimiqClientFactory(new URL("http://localhost:8648/"));
NimiqClient client = clientFactory.getClient();

if (client.consensus() == ConsensusState.ESTABLISHED) {

    int blockNumber = client.blockNumber();
    Block block = client.getBlockByNumber(blockNumber, false);
    long balance = client.getBalance(block.getMinerAddress());

    System.out.printf("Head block #%d, %s mined by %s who has %.5f NIM.\n", 
        block.getNumber(), block.getHash(), block.getMinerAddress(), NimiqUtils.lunasToCoins(balance));
}
```
