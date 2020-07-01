package cn.xiaozhou.cachedemo.config;

import cn.xiaozhou.cachedemo.CacheDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {CacheDemoApplication.class})
@RunWith(SpringRunner.class)
public class CacheTest {
    @Autowired
    RedisUtil redisUtil;

    @Test
    public void testCache(){
        redisUtil.sSet("test","str");
    }
}
