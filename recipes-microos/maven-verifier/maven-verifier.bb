SUMMARY = "Test harness for Maven integration tests"
DESCRIPTION = "Provides a test harness for Maven integration tests."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "maven-verifier-1.6-3.12.noarch.rpm"
RPM_HASH = "ad9e68fc3da641aa385fe1d7115d9db659fe0aec25404aa6ac58012a4de015c996d49bed26333c3406ce16a8c30f143752d2be933ac3ed751f2258a6b1fbc56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-verifier \
mvn(org.apache.maven.shared:maven-verifier) \
mvn(org.apache.maven.shared:maven-verifier:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(junit:junit) \
mvn(org.apache.maven.shared:maven-shared-utils)"

inherit rpm
