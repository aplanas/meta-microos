SUMMARY = "Javadoc for maven-shared-io"
DESCRIPTION = "API documentation for maven-shared-io."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-io-javadoc-3.0.0-2.12.noarch.rpm"
RPM_HASH = "4ff732fd262b18eb6eac73ca668ba85f828c97f661faaba55688d53aa0a9f7b8f3c2a854c7312e7f150aaa149b05e64e7caf8b1734d75389ea8d857bbd1bced4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-io-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
