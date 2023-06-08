SUMMARY = "Maven Artifact Resolver Connector Basic"
DESCRIPTION = "A repository connector implementation for repositories using URI-based layouts."
LICENSE = "Apache-2.0"

PV = "1.9.8"

RPM_NAME = "maven-resolver-connector-basic-1.9.8-1.1.noarch.rpm"
RPM_HASH = "6855626c6f07a7804544ef825b24f3325e2be2289543e05d425597f512bb99427898a1001b617954f873501e453f0b6a2fe69d5d9f779f7c787053fea16ed800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-connector-basic mvn(org.apache.maven.resolver:maven-resolver-connector-basic) mvn(org.apache.maven.resolver:maven-resolver-connector-basic:pom:) mvn(org.eclipse.aether:aether-connector-basic) mvn(org.eclipse.aether:aether-connector-basic:pom:) osgi(org.apache.maven.resolver.connector.basic)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.resolver:maven-resolver-api) mvn(org.apache.maven.resolver:maven-resolver-spi) mvn(org.apache.maven.resolver:maven-resolver-util) mvn(org.slf4j:slf4j-api)"

inherit rpm
