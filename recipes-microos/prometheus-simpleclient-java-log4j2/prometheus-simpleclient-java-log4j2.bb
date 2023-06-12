SUMMARY = "Prometheus Java Simpleclient log4j2"
DESCRIPTION = "Metrics collector for log4j2 appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-log4j2-0.8.0-6.10.noarch.rpm"
RPM_HASH = "d3104b249b63d77f30ed1aa8bb7512ab647f4d7025724fcd7ea42d54672219fdab09987d7fc03e6946a1d701a03cf5c88d9ec199913fea9bddfd8eca2dae940a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_log4j2) \
mvn(io.prometheus:simpleclient_log4j2:pom:) \
osgi(io.prometheus.simpleclient_log4j2) \
prometheus-simpleclient-java-log4j2"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(io.prometheus:simpleclient) \
mvn(org.apache.logging.log4j:log4j-core)"

inherit rpm
