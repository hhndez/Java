package com.others.exam2;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q48 {
    private ZoneId zone = ZoneId.of("Asia/Colombo");

    //Q49

    Timestamp ts = Timestamp.from(Instant.now());
//    Timestamp ts1 = Timestamp.valueOf(Instant.now());
}
