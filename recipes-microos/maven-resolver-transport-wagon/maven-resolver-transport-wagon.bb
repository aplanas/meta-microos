SUMMARY = "Maven Artifact Resolver Transport Wagon"
DESCRIPTION = "A transport implementation based on Maven Wagon."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-transport-wagon-1.9.8-1.1.noarch.rpm"
RPM_HASH = "c410a4b71edccc78323fc39215b2212d9155300857a048e705a58659d5494d788f91a3d47593da396f96880c9028490512d793d33f596a179f9c5c270da2f925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-wagon \
mvn(org.apache.maven.resolver:maven-resolver-transport-wagon) \
mvn(org.apache.maven.resolver:maven-resolver-transport-wagon:pom:) \
mvn(org.eclipse.aether:aether-connector-wagon) \
mvn(org.eclipse.aether:aether-connector-wagon:pom:) \
mvn(org.eclipse.aether:aether-transport-wagon) \
mvn(org.eclipse.aether:aether-transport-wagon:pom:) \
osgi(org.apache.maven.resolver.transport.wagon)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.resolver:maven-resolver-api) \
mvn(org.apache.maven.resolver:maven-resolver-spi) \
mvn(org.apache.maven.resolver:maven-resolver-util) \
mvn(org.apache.maven.wagon:wagon-provider-api) \
mvn(org.slf4j:slf4j-api)"

inherit rpm
