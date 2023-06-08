SUMMARY = "Abstract classes to manage report generation"
DESCRIPTION = "Abstract classes to manage report generation, which can be run both: \
 \
* as part of a site generation (as a maven-reporting-api's MavenReport), \
* or as a direct standalone invocation (as a maven-plugin-api's Mojo). \
 \
This is a replacement package for maven-shared-reporting-impl"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-impl-3.1.0-1.12.noarch.rpm"
RPM_HASH = "50a9679ae19fadbe17f9d1cdbfb550c47927805f92f3d649f1fbdc12b6af92d928f10b6afb4d0d8389e53e2c66c964e95ceda24cc5f8df5254f9f269d9358814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl mvn(org.apache.maven.reporting:maven-reporting-impl) mvn(org.apache.maven.reporting:maven-reporting-impl:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.doxia:doxia-core) mvn(org.apache.maven.doxia:doxia-decoration-model) mvn(org.apache.maven.doxia:doxia-sink-api) mvn(org.apache.maven.doxia:doxia-site-renderer) mvn(org.apache.maven.reporting:maven-reporting-api) mvn(org.apache.maven.shared:maven-shared-utils) mvn(org.apache.maven:maven-core) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
