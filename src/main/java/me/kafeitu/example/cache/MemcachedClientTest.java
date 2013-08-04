package me.kafeitu.example.cache;

import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

/**
 * @author: Henry Yan
 */
public class MemcachedClientTest {
    public static void main(String[] args) throws IOException {

        MemcachedClient c = new MemcachedClient(
                new InetSocketAddress("localhost", 11211));

        // Store a value (async) for one hour
        c.set("name", 3600, "咖啡兔");
        // Retrieve a value.
        Object myObject = c.get("name");
        System.out.println(myObject);
    }
}
