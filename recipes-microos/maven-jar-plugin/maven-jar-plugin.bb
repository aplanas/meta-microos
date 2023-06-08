SUMMARY = "Maven JAR Plugin"
DESCRIPTION = "Builds a Java Archive (JAR) file from the compiled \
project classes and resources."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-jar-plugin-3.2.2-3.7.noarch.rpm"
RPM_HASH = "ba4c5f32bb2ea1dedabc059d94f6f4e9d013e11b20f78a613e578f3e4a7e10f929856d07e50362405aac4c47e94238821c2d95368ce6a996748a875a30e00e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jar-plugin mvn(org.apache.maven.plugins:maven-jar-plugin) mvn(org.apache.maven.plugins:maven-jar-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.shared:file-management) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven:maven-archiver) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
