SUMMARY = "Maven File Management API"
DESCRIPTION = "Provides a component for plugins to easily resolve project dependencies."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-file-management-3.0.0-3.8.noarch.rpm"
RPM_HASH = "6238d81d22ba28e5ac7813909d1dcdc43c24ebbaeda4352afcce3a901244e39ea898c364229ba2eef9576fdbc8ef53e5f1e2e1eea16ff6c87835a0694f6888a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management \
mvn(org.apache.maven.shared:file-management) \
mvn(org.apache.maven.shared:file-management:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.shared:maven-shared-io) \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
