package org.apache.flink.streaming.examples.stephen;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/** Demo test. */
public class HelloWorld {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        DataStreamSource<String> dataStreamSource = env.socketTextStream("localhost", 9999);

        dataStreamSource.print();

        env.execute(HelloWorld.class.getSimpleName());
    }
}
