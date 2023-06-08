SUMMARY = "Javadoc for maven-compiler-plugin"
DESCRIPTION = "API documentation for maven-compiler-plugin."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "maven-compiler-plugin-javadoc-3.10.1-1.11.noarch.rpm"
RPM_HASH = "32a45be28adc6ada318e6a00ace520f8f34ee3afbdbc470180b14b56b7946f2e71d8ff00847250a47e93562674a7946073a9d532117970a31715f9f1f1410d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-compiler-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
