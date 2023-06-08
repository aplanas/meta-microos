SUMMARY = "API documentation for maven-plugin-build-helper"
DESCRIPTION = "This package provides API documentation for maven-plugin-build-helper."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "maven-plugin-build-helper-javadoc-3.2.0-2.8.noarch.rpm"
RPM_HASH = "ed3ffc0076ac8d2e43df22c17332b0ca073d5e3af8a6de46a62cf87c2328afd3bfa3122654e11309d719541320eb3946abb68a97020eb0d1387ce125ab0ee8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-build-helper-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
