SUMMARY = "Maven Plugin Testing Mechanism"
DESCRIPTION = "The Maven Plugin Testing Harness provides mechanisms to manage tests on Mojo."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-harness-3.3.0-5.12.noarch.rpm"
RPM_HASH = "eec9fa0a9bcf05c5da795b2220111459bc696c61efeaef12e27d80b9c3fbc72a872bcdb597f5ac8ae48a071e9c2c34d89bb86a985d7c41414de7a0823f4142ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-harness mvn(org.apache.maven.plugin-testing:maven-plugin-testing-harness) mvn(org.apache.maven.plugin-testing:maven-plugin-testing-harness:pom:) mvn(org.apache.maven.shared:maven-plugin-testing-harness) mvn(org.apache.maven.shared:maven-plugin-testing-harness:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io) mvn(org.codehaus.plexus:plexus-archiver)"

inherit rpm
