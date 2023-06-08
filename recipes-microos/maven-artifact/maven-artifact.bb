SUMMARY = "Compatibility Maven artifact artifact"
DESCRIPTION = "Maven artifact manager artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-artifact-2.2.1-3.8.noarch.rpm"
RPM_HASH = "78fd05e222dd9e843aff009b2376a574a25723d55afde64576563844f448f7787c1c16c6a52a3cf02c5e5f11732a1f256103f1f45469559ddb0129a8e7536dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact mvn(org.apache.maven:maven-artifact:2.0.2) mvn(org.apache.maven:maven-artifact:2.0.6) mvn(org.apache.maven:maven-artifact:2.0.7) mvn(org.apache.maven:maven-artifact:2.0.8) mvn(org.apache.maven:maven-artifact:2.2.1) mvn(org.apache.maven:maven-artifact:pom:2.0.2) mvn(org.apache.maven:maven-artifact:pom:2.0.6) mvn(org.apache.maven:maven-artifact:pom:2.0.7) mvn(org.apache.maven:maven-artifact:pom:2.0.8) mvn(org.apache.maven:maven-artifact:pom:2.2.1)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
