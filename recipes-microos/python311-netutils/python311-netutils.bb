SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-netutils-1.2.0-1.3.noarch.rpm"
RPM_HASH = "c361aabcf9518fea7bf8b3decf54b72eddc7b252e3d693f841a1c0d2d4491de5d17b497f0bff2925db3c7b6c4db2ae17599b1143cb9ed85d6a032db6df3852dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(netutils) python311-netutils python3dist(netutils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
