SUMMARY = "Maven plugin to remove generated files"
DESCRIPTION = "The Maven Clean Plugin is a plugin that removes files generated \
at build-time in a project's directory."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-clean-plugin-3.1.0-4.10.noarch.rpm"
RPM_HASH = "d400727b49b2e9578eaf43ef33625f3387af85fa8f5dcf6b4029e6b33509f96e7b201ff1801bc78c237223958b02244a0f612817dc960b8712acd8b11be9bedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-clean-plugin \
mvn(org.apache.maven.plugins:maven-clean-plugin) \
mvn(org.apache.maven.plugins:maven-clean-plugin:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-plugin-api)"

inherit rpm
