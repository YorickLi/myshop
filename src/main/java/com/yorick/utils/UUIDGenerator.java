package com.yorick.utils;

import java.util.UUID;

/**
 * Created by yorick on 2017/8/29.
 */
public class UUIDGenerator {

    /**
     * 生成一个 36位的UUId字符串
     * @return
     */
    public static String generate36UUID() {

        UUID uuid = UUID.randomUUID();
        return uuid.toString();

    }

}
