SUMMARY = "API documentation for sqlite-jdbc"
DESCRIPTION = "API documentation for sqlite-jdbc."
LICENSE = "Apache-2.0"

PV = "3.41.2.1"

RPM_NAME = "sqlite-jdbc-javadoc-3.41.2.1-1.1.noarch.rpm"
RPM_HASH = "46aa48a1249895f48a64fd6c2f4e45825f62fdc97ff2398f6c82a70b8a52e3b9060dfb5612e6f9459408bdfb82eeed1642e86e4c278d89cb648cfda707eac507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite-jdbc-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
