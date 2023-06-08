SUMMARY = "Maven AntRun Plugin"
DESCRIPTION = "This plugin provides the ability to run Ant tasks from within Maven. \
It is even possible to embed Ant scripts in the POM."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-antrun-plugin-3.0.0-1.10.noarch.rpm"
RPM_HASH = "821edaf8376588fc3cd666edfd6073599213dc4f0976765543ea0a87787aa7f9d63f9ccc86998bfd1e97e9ab19272f88cb83a351368f94a72b91735e325b9643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-antrun-plugin mvn(org.apache.maven.plugins:maven-antrun-plugin) mvn(org.apache.maven.plugins:maven-antrun-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.ant:ant) mvn(org.apache.maven:maven-artifact) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
