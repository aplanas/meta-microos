SUMMARY = "Javadoc for jackson-datatypes-collections"
DESCRIPTION = "This package contains API documentation for jackson-datatypes-collections."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatypes-collections-javadoc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "782509acd1b4f5f746f3dc218f720c78122cf0845a493de9cc9ea72ad3fcc06d147812e69888778a33ad47fa2e03be1cab2e7c13f20c9226cf32b9f4c78baaa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
