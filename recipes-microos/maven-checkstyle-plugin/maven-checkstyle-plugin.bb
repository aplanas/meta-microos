SUMMARY = "Plugin that generates a report regarding the code style used by the developers"
DESCRIPTION = "Generates a report on violations of code style and optionally fails the build \
if violations are detected."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-checkstyle-plugin-3.0.0-1.20.noarch.rpm"
RPM_HASH = "55a4c537f9ea093ec318c27a59e5309ca6703485a0aef05fd57dad1f3697ce095f2459dcd7e8155a9bd779aa6d0e6f2078161c686b335d786407a477e5bcd619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-checkstyle-plugin \
mvn(org.apache.maven.plugins:maven-checkstyle-plugin) \
mvn(org.apache.maven.plugins:maven-checkstyle-plugin:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.puppycrawl.tools:checkstyle) \
mvn(commons-collections:commons-collections) \
mvn(org.apache.maven.doxia:doxia-decoration-model) \
mvn(org.apache.maven.doxia:doxia-integration-tools) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.apache.maven.doxia:doxia-site-renderer) \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven.reporting:maven-reporting-impl) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.velocity:velocity) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-interpolation) \
mvn(org.codehaus.plexus:plexus-resources) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.codehaus.plexus:plexus-velocity)"

inherit rpm
