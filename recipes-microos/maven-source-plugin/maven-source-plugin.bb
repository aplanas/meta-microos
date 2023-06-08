SUMMARY = "Plugin for creating source JARs"
DESCRIPTION = "The Maven Source Plugin creates a JAR archive of the \
source files of the current project."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-source-plugin-3.0.1-3.10.noarch.rpm"
RPM_HASH = "8bb7d9598140788e788a7fd577fe57b4c5cd085ea54c10702f3c6b491a011aa70b1b7c07d5a7360cd1adcc50f0f6d860325f14b2cdf55f608c69c94c445d56dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-source-plugin mvn(org.apache.maven.plugins:maven-source-plugin) mvn(org.apache.maven.plugins:maven-source-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven:maven-archiver) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-model) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-archiver) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
