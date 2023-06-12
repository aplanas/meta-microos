SUMMARY = "Tests for maven-scm"
DESCRIPTION = "Tests for maven-scm."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "maven-scm-test-1.12.0-3.3.noarch.rpm"
RPM_HASH = "7ed81a4aa54cb058aa41a0a82f188eaa6187805585420711f242fbb79525cad4e08f16e36b11d72b672369c1afedd7fc411ad7ed09107105007c438298fbb679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm-test \
mvn(org.apache.maven.scm:maven-scm-provider-cvstest) \
mvn(org.apache.maven.scm:maven-scm-provider-cvstest:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-gittest) \
mvn(org.apache.maven.scm:maven-scm-provider-gittest:pom:) \
mvn(org.apache.maven.scm:maven-scm-provider-svntest) \
mvn(org.apache.maven.scm:maven-scm-provider-svntest:pom:) \
mvn(org.apache.maven.scm:maven-scm-test) \
mvn(org.apache.maven.scm:maven-scm-test:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
maven-scm \
mvn(junit:junit) \
mvn(org.apache.maven.scm:maven-scm-api) \
mvn(org.apache.maven.scm:maven-scm-manager-plexus) \
mvn(org.apache.maven.scm:maven-scm-provider-git-commons) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.sonatype.plexus:plexus-sec-dispatcher)"

inherit rpm
