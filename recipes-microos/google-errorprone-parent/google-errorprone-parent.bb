SUMMARY = "Error Prone parent POM"
DESCRIPTION = "Error Prone is a static analysis tool for Java that catches \
common programming mistakes at compile-time."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-parent-2.11.0-2.1.noarch.rpm"
RPM_HASH = "e918b0d5bd35f5be1d1385994fba5e4ea54d76b1d565e667a0ebbc3d3e75cb2a0c4a8aad8ca24021664f4cc2151b3773f2ce0e07fa5db2cdedfc263705fa0123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-parent mvn(com.google.errorprone:error_prone_parent:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.plugins:maven-compiler-plugin) mvn(org.apache.maven.plugins:maven-jar-plugin) mvn(org.apache.maven.plugins:maven-javadoc-plugin) mvn(org.apache.maven.plugins:maven-surefire-plugin)"

inherit rpm
