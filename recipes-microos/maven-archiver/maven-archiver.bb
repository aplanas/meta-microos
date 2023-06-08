SUMMARY = "Maven Archiver"
DESCRIPTION = "The Maven Archiver is used by other Maven plugins \
to handle packaging"
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-archiver-3.5.0-2.12.noarch.rpm"
RPM_HASH = "d6d25e4a3f44bdf2145f1281c3803792e839e86eedc93b51f44fe4be72268b84f60a64a7bfdb7e46456c58933e485fd02e4317cda90bdc1baaf80a2c6aab5907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver mvn(org.apache.maven:maven-archiver) mvn(org.apache.maven:maven-archiver:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-model) mvn(org.codehaus.plexus:plexus-archiver) mvn(org.codehaus.plexus:plexus-interpolation) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
