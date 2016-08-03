package com.samples;

import java.util.Arrays;
import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.lang.System.out;
/**
 * Created by Optiplex on 25/07/16.
 */
public class StreamSample {

    public static void streamSample() {
        out.println("streamSample...");

        Stream s = Arrays.asList(1,2,3).stream();

        out.println("Resultado de skip(1).limit(1).count:");
        out.println("a:->" + s.skip(1).limit(1).count());

        out.println("Resultado de skip(1).limit(1)");
        s = Arrays.asList(1,2,3).stream();
        s.skip(1).limit(1).forEach(out::println);


        out.println("Resultado de skip(1)");
        s = Arrays.asList(1,2,3).stream();
        s.skip(1).forEach(out::println);

    }

    public static void longStream() {
        out.println("longStream...");
        LongStream in = LongStream.of(3,8,4,1,0,7,2).sorted();
        in.skip(2).limit(4).forEach(out::print);

        in = LongStream.of(3,8,4,1,0,7,2).sorted();
        LongSummaryStatistics sm = in.skip(2).limit(4).summaryStatistics();
        sm.accept(sm.getCount());
        System.out.println();
        System.out.println(sm.getSum());
    }

    public static void main (String ... args) {
        streamSample();

        longStream();

    }
}
