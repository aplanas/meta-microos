SUMMARY = "Compatibility Maven monitor artifact"
DESCRIPTION = "Maven monitor artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-monitor-2.2.1-3.8.noarch.rpm"
RPM_HASH = "84b2e60ccad1003bae84757d22878e9fa330e285d30415d4b9ead8c242fb202bb84ee6ac0a7be6d955e40d42ffede882135d652def0bdd3fde1f919629f18d1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-monitor mvn(org.apache.maven:maven-monitor) mvn(org.apache.maven:maven-monitor:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
