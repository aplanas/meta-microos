SUMMARY = "Maven Install Plugin"
DESCRIPTION = "Copies the project artifacts to the user's local repository."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "maven-install-plugin-3.1.1-1.1.noarch.rpm"
RPM_HASH = "fdd0ab475ea71e4b943c4ff5af80a6927c96f92d162a583ff7f8de5c358740971dc3ba81260e0923a81e73105ca58aa6a7fe48b04f56cd81b73dc24be5d68fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-install-plugin mvn(org.apache.maven.plugins:maven-install-plugin) mvn(org.apache.maven.plugins:maven-install-plugin:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-utils) mvn(org.eclipse.aether:aether-util)"

inherit rpm
