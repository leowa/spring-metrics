package com.example.spring.metrics.springmetrics;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Component
public class Keywords {
    private final Jedis client;
    private static final String HOT_KEYS = "hots:keys";

    public Keywords(RedisOption option) {
        this.client = new Jedis(option.host, Integer.parseInt(option.port));
    }

    public HotKeyword put(String key) {
        if (!this.client.exists(key)) {
            this.client.lpush(HOT_KEYS, key);
        }
        return new HotKeyword(key, this.client.incr(key));
    }

    public HotKeyword get(String key) {
        if (!this.client.exists(key)) {
            return null;
        }
        return new HotKeyword(key, this.client.incrBy(key, 0));
    }

    public String[] list() {
        return this.client.lrange(HOT_KEYS, 0, -1).toArray(new String[]{});
    }
}
