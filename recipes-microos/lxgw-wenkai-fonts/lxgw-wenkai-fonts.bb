SUMMARY = "An open-source Chinese font derived from Fontworks' Klee One."
DESCRIPTION = "An open-source Chinese font derived from Fontworks' Klee One."
LICENSE = "OFL-1.1"

PV = "1.250"

RPM_NAME = "lxgw-wenkai-fonts-1.250-1.1.noarch.rpm"
RPM_HASH = "39d91e2a2f6a9ab995a863ba0bc3f0c67020335f3583b9148c3c6a589d14dcb6edc1969e614a0d6bd11d7ca9274a03bd9426f0acee07079870f0d3af3ccb4dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxgw-wenkai-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
