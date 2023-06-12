SUMMARY = "Component to assist in signing Java archives"
DESCRIPTION = "Apache Maven Jarsigner is a component which provides utilities to sign \
and verify Java archive and other files in your Maven MOJOs."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-jarsigner-3.0.0-2.21.noarch.rpm"
RPM_HASH = "86cbb9dacbce250c7b4217b9d202598b685bdab9470e2a4ab7323d7f5665dad7182d34addf5a5589fa8c1ddb753092faa5eee123e544b59db607901ff563be9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-jarsigner \
mvn(org.apache.maven.shared:maven-jarsigner) \
mvn(org.apache.maven.shared:maven-jarsigner:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-core) \
mvn(org.codehaus.plexus:plexus-component-annotations)"

inherit rpm
