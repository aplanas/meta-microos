SUMMARY = "Prometheus Java Simpleclient guava"
DESCRIPTION = "Metrics collector for guava based caches."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-guava-0.8.0-6.10.noarch.rpm"
RPM_HASH = "1246fa432dc4627da34bd6183e362192406f6e268f50cde6be739f6dd259f1958ce124b9d8c5af3e263319927340a53774adba8b37c51e1b86855eb28ca4b332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_guava) \
mvn(io.prometheus:simpleclient_guava:pom:) \
osgi(io.prometheus.simpleclient_guava) \
prometheus-simpleclient-java-guava"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.guava:guava) \
mvn(io.prometheus:simpleclient)"

inherit rpm
