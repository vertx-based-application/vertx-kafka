load("@rules_jvm_external//:defs.bzl", "maven_install")

def maven():
    maven_install(
        name = "maven",
        artifacts = [
            "org.postgresql:postgresql:42.2.14",
            "org.slf4j:slf4j-api:1.7.26",
            "org.slf4j:slf4j-simple:1.7.28",
            "org.apache.logging.log4j:log4j-core:2.13.0",
            "org.apache.logging.log4j:log4j-api:2.13.0",
            "org.apache.logging.log4j:log4j-slf4j-impl:2.13.0",
            "org.apache.kafka:kafka-clients:2.7.0",
        ],
        repositories = [
            "https://maven.google.com",
            "https://repo1.maven.org/maven2",
        ],
        fetch_sources = True,
        version_conflict_policy = "pinned",
    )

    maven_install(
        name = "vertx_4_0_3",
        artifacts = [
            "io.vertx:vertx-core:4.0.3",
            "io.vertx:vertx-jdbc-client:4.0.3",
            "io.vertx:vertx-kafka-client:4.0.3",
            "io.vertx:vertx-rx-java2:4.0.3",
            "io.vertx:vertx-web-client:4.0.3",
            "io.vertx:vertx-web:4.0.3",
            "io.vertx:vertx-pg-client:4.0.3",
            "io.vertx:vertx-sql-client:4.0.3",
        ],
        repositories = [
            "https://maven.google.com",
            "https://repo1.maven.org/maven2",
        ],
        fetch_sources = True,
        version_conflict_policy = "pinned",
    )

    maven_install(
    	    name = "maven_test",
    	    artifacts = [
    		    "io.vertx:vertx-junit5:4.0.3",
    		    "org.assertj:assertj-core:3.16.1",
    		    "org.junit.jupiter:junit-jupiter-engine:5.6.2",
    		    "org.junit.jupiter:junit-jupiter-api:5.6.2",
    		    "org.junit.platform:junit-platform-console:1.5.2",
    		    "org.apache.httpcomponents:httpclient:4.5.7",
    		    "org.mockito:mockito-junit-jupiter:2.23.0",
    		    "org.mockito:mockito-core:2.23.0",
    	    ],
    	    repositories = [
    		    "https://repo1.maven.org/maven2",
    	    ],
    	    fetch_sources = True,
        )
