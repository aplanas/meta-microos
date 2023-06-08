SUMMARY = "Javadoc for univocity-parsers"
DESCRIPTION = "API documentation for univocity-parsers."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "univocity-parsers-javadoc-2.9.1-1.4.noarch.rpm"
RPM_HASH = "424af63e71abffae86669bbf3a6e9162a47e5d6b876fed2d2196f27d4a886227c402fc5f4dcbe2183a19648cb361a2728ce2a5a94c02d978db1cceef5d45b3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "univocity-parsers-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
