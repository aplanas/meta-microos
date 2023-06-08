SUMMARY = "Maven Plugins POM"
DESCRIPTION = "This package provides Maven Plugins parent POM used by different \
Apache Maven plugins."
LICENSE = "Apache-2.0"

PV = "28"

RPM_NAME = "maven-plugins-pom-28-1.11.noarch.rpm"
RPM_HASH = "de031bc17b093770c1a21d5c8a0b591fefe380f18d42a5668d3f43589223c6147dc93aceb4a0da54b7bf7e6b0b729473faa4ce54b3bf0341b5f8c16435637cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugins-pom mvn(org.apache.maven.plugins:maven-plugins:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven:maven-parent:pom:)"

inherit rpm
