SUMMARY = "Maven Invoker Plugin"
DESCRIPTION = "The Maven Invoker Plugin is used to run a set of Maven projects. The plugin \
can determine whether each project execution is successful, and optionally \
can verify the output generated from a given project execution."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-invoker-plugin-3.2.2-1.9.noarch.rpm"
RPM_HASH = "779dbefe6b05ae102b5243253627ac19e196d30b0ce6157fb8f5b0238f7fa5bb19ece15b9528f14438b9eae10de8a7337111d17748fac78d5bf6d642ce69a449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-plugin \
mvn(org.apache.maven.plugins:maven-invoker-plugin) \
mvn(org.apache.maven.plugins:maven-invoker-plugin:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache-extras.beanshell:bsh) \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-decoration-model) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.apache.maven.doxia:doxia-site-renderer) \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven.reporting:maven-reporting-impl) \
mvn(org.apache.maven.shared:maven-artifact-transfer) \
mvn(org.apache.maven.shared:maven-common-artifact-filters) \
mvn(org.apache.maven.shared:maven-invoker) \
mvn(org.apache.maven.shared:maven-script-interpreter) \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.maven:maven-settings) \
mvn(org.codehaus.plexus:plexus-i18n) \
mvn(org.codehaus.plexus:plexus-interpolation) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
