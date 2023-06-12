SUMMARY = "Maven Plugin Testing"
DESCRIPTION = "The Maven Plugin Testing contains the necessary modules \
to be able to test Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-3.3.0-5.12.noarch.rpm"
RPM_HASH = "d8790b1b6ccadb6e472a12d0c0165534a0945099b25200827cfb15a38341133daa3a1892aee28dcac3f7c0c93d638686e64231f2dd8946aeb08c534c679b34cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing \
mvn(org.apache.maven.plugin-testing:maven-plugin-testing:pom:) \
mvn(org.apache.maven.shared:maven-plugin-testing:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-parent:pom:)"

inherit rpm
