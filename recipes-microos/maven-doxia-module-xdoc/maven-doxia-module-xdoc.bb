SUMMARY = "XDoc module for maven-doxia"
DESCRIPTION = "This package provides XDoc module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-xdoc-1.9.1-6.7.noarch.rpm"
RPM_HASH = "bccfcb61c73fce05d0f601b9ad2ab547eb7cc17d759c266058727ddcdb1fb2159e958e15e604d23a22c67a199a7a6c9b796b9c73127cd8a4bd894e48a2a2e681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xdoc mvn(org.apache.maven.doxia:doxia-module-xdoc) mvn(org.apache.maven.doxia:doxia-module-xdoc:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.maven.doxia:doxia-core) mvn(org.apache.maven.doxia:doxia-sink-api) mvn(org.codehaus.plexus:plexus-component-annotations) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
