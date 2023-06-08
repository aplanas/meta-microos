SUMMARY = "Apache Maven JLink Plugin"
DESCRIPTION = "The Maven JLink Plugin is intended to create Modular Run-Time Images. \
http://openjdk.java.net/jeps/282, http://openjdk.java.net/jeps/220"
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jlink-plugin-3.0.0~alpha1-2.21.noarch.rpm"
RPM_HASH = "5d90728170ddd9146c4a1a0f53e0599d431b3740f54eb0853d312888db8647f2bd401c48e1d1e8336bb2aef14f02dd1e7ea8232e6aebbcc5de600435882633e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jlink-plugin mvn(org.apache.maven.plugins:maven-jlink-plugin) mvn(org.apache.maven.plugins:maven-jlink-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.commons:commons-lang3) mvn(org.apache.maven:maven-archiver) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-archiver) mvn(org.codehaus.plexus:plexus-java)"

inherit rpm
