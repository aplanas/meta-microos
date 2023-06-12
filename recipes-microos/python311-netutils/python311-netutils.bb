SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python311-netutils-1.4.1-1.1.noarch.rpm"
RPM_HASH = "8e5d1741bd5176b055b57043734cbda55c5033f693b2fcb7cacba2c5a4aa5bde611743a22068add86ae15cbd8cfedf01d528a6a0bebefab46fdc521cb14aeba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(netutils) python311-netutils python3dist(netutils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
