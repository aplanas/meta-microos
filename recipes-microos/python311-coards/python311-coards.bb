SUMMARY = "A parser for COADS-compliant dates"
DESCRIPTION = "This module parses time values represented using the COARDS \
convention."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python311-coards-1.0.5-2.14.noarch.rpm"
RPM_HASH = "e227c4b450d67e88e7bfabac15b86e63d1b7e633a4ea4c68217b99b9cca7e302acc246cb38eba132e7ec4f839db87742366b38589236d16aee2f7ff79e10bed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(coards) python311-coards python3dist(coards)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
