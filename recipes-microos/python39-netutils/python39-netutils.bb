SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-netutils-1.2.0-1.3.noarch.rpm"
RPM_HASH = "6b5015040bab9969929bbf3c25cd41148b58f6fcfda53f6d0aea58a875076780fbd81192c8693095aa1a71e4e95ee5c3d8ac146572bee2cfa4d69ecfed0d269f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(netutils) python39-netutils python3dist(netutils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
