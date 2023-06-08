SUMMARY = "API documentation for segment"
DESCRIPTION = "This package contains the API documentation for segment."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "segment-javadoc-2.0.1-1.18.noarch.rpm"
RPM_HASH = "31d202a733782f079bb425abf6f507d986b26379b395406b790e3b1f95951a99430925e690c2ea6d1a77a16d756f346ec919e6648a4710f382a0ce430666ec06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "segment-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
