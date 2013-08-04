package me.kafeitu.example.cache;

import redis.clients.jedis.Jedis;

/**
 * @author: Henry Yan
 */
public class RedisClientTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set("name", "咖啡兔");
        String value = jedis.get("name");
        System.out.println(value);
    }
}
