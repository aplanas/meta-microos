SUMMARY = "Compatibility Maven profile artifact"
DESCRIPTION = "Maven profile artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-profile-2.2.1-3.8.noarch.rpm"
RPM_HASH = "09474b5738e39d3a5bdd0e9c8e7a3a50995afbf425a49a61dbf0d6c9172bf449b7ada11b506db8d9625c4eafb3dde136382986c5e6036541faa00b110610ed24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-profile mvn(org.apache.maven:maven-profile) mvn(org.apache.maven:maven-profile:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven:maven-model) mvn(org.codehaus.plexus:plexus-container-default) mvn(org.codehaus.plexus:plexus-interpolation) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
