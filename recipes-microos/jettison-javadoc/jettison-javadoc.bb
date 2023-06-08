SUMMARY = "Javadocs for jettison"
DESCRIPTION = "This package contains the API documentation for jettison."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-javadoc-1.5.4-1.1.noarch.rpm"
RPM_HASH = "a87e77c24842005ea432e884c91ce3234e4c4953830cd657a26b1beca295cfba86dcf3c9c03b3e67b7eae4f61a9e9294d5e4cccb8a7e5b911ce5e75430f6567c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
