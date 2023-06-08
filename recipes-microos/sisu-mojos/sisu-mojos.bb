SUMMARY = "Sisu plugin for Apache Maven"
DESCRIPTION = "The Sisu Plugin for Maven provides mojos to generate \
META-INF/sisu/javax.inject.Named index files for the Sisu container."
LICENSE = "EPL-1.0"

PV = "0.3.1"

RPM_NAME = "sisu-mojos-0.3.1-1.1.noarch.rpm"
RPM_HASH = "f7e1a5d744bc4943f605b818c169b937df6f8408ac5ee760757d246483467070ea5c0367c8ca17a6770a2f186f479769ffeef2d7efa1490d54ec4d6093afc1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.eclipse.sisu:sisu-maven-plugin) mvn(org.eclipse.sisu:sisu-maven-plugin:pom:) mvn(org.sonatype.plugins:sisu-maven-plugin) mvn(org.sonatype.plugins:sisu-maven-plugin:pom:) sisu-mojos"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.shared:maven-common-artifact-filters) mvn(org.apache.maven:maven-plugin-api) mvn(org.codehaus.plexus:plexus-utils) mvn(org.eclipse.sisu:org.eclipse.sisu.inject) mvn(org.slf4j:slf4j-nop)"

inherit rpm
