SUMMARY = "Maven Ant Mojo Support"
DESCRIPTION = "This package provides Maven Ant Mojo Support, which write Maven plugins with \
Ant scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-ant-3.6.0-5.1.noarch.rpm"
RPM_HASH = "56deb6444b316e5d56c7888a97ff612adb3b8e7aa7a9617bd31865df32b889b1b47a8e2a69e1d34be377f915ad938443474c129da418291d734ff077aeda8645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-ant \
mvn(org.apache.maven.plugin-tools:maven-script-ant) \
mvn(org.apache.maven.plugin-tools:maven-script-ant:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant) \
mvn(org.apache.ant:ant-launcher) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-ant-factory) \
mvn(org.codehaus.plexus:plexus-archiver)"

inherit rpm
