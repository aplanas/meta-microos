SUMMARY = "Compatibility Maven plugin registry artifact"
DESCRIPTION = "Maven plugin registry artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-plugin-registry-2.2.1-3.8.noarch.rpm"
RPM_HASH = "11a6a1ae26f638598bf092451f5da7cc37b1bc20da18f40823ba587e9c5ab5a397f5d46d308f9ee31ddcd7680da79de3fe1d0a9a084bcc1050034d5d2bf369a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-registry \
mvn(org.apache.maven:maven-plugin-registry) \
mvn(org.apache.maven:maven-plugin-registry:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
