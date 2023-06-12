SUMMARY = "Jakarta Commons Discovery"
DESCRIPTION = "The Discovery component is about discovering, or finding, \
implementations for pluggable interfaces.  Pluggable interfaces are \
specified with the intent that multiple implementations are, or will \
be, available to provide the service described by the interface. \
Discovery provides facilities for finding and instantiating classes and \
for lifecycle management of singleton (factory) classes."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "jakarta-commons-discovery-0.5-1.1.noarch.rpm"
RPM_HASH = "9223f48072794665fd889c9bbf611f1dac5b0d6e39068ffcb3a9003a1159b746e12f1bbd47e1eef7998a5d1162f9fa4811367d7403ca94c3a4829e2ff80c95c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-discovery \
jakarta-commons-discovery \
mvn(commons-discovery:commons-discovery) \
mvn(commons-discovery:commons-discovery:pom:) \
osgi(org.apache.commons.discovery)"
RDEPENDS:${PN} += "commons-logging \
java-headless \
javapackages-filesystem"

inherit rpm
