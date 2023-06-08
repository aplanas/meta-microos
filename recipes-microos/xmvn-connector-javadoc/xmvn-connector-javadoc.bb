SUMMARY = "API documentation for xmvn-connector"
DESCRIPTION = "This package provides API documentation for xmvn-connector."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-javadoc-4.2.0-2.1.noarch.rpm"
RPM_HASH = "36a01ffc2866993f696dd65a00be4e65708eb9b737e687c2fdfc5546cfa594bdc3ab14acf2379df6df503b537964339d74c24f48483e1bc6bcdfdd2f61e3844f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
