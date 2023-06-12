SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python310-netutils-1.4.1-1.1.noarch.rpm"
RPM_HASH = "e4b1bb3f1812c3f4853d12e7eac1faa4a37ce393553f6fb1744d8a40b8a8dc11dd68a79b3b7fcbf3654d56675ad740ca0fdafbdd433eda334e67a6e95afafb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netutils \
python3.10dist(netutils) \
python310-netutils \
python3dist(netutils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
