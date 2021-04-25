package com.trl.vertex_kafka.constants;

public final class Constants {

    private Constants() {
        super();
    }

    public static class Kafka {
        public static final String DEFAULT_BOOTSTRAP_SERVERS = "localhost:9091";
        public static final String DEFAULT_GROUP_ID = "default-group-id";
        public static final String DEFAULT_TOPIC = "default-topic";

        private Kafka() {
            super();
        }
    }

    public static class HttpServer {
        public static final String DEFAULT_HOST = "localhost";
        public static final Integer DEFAULT_PORT = 8080;

        private HttpServer() {
            super();
        }
    }

    public static class Log {
        public static final String LOG_HEADER = "\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";

        private Log() {
            super();
        }
    }

}
