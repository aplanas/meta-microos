SUMMARY = "An open-source Chinese font derived from Fontworks' Klee One."
DESCRIPTION = "An open-source Chinese font derived from Fontworks' Klee One."
LICENSE = "OFL-1.1"

PV = "1.300"

RPM_NAME = "lxgw-wenkai-fonts-1.300-1.1.noarch.rpm"
RPM_HASH = "eb8dd10a87835e304819bd99154b89822b7488ee039f96874028a4e21b66ca6a934f0c960b2d9a4b20790fdebe322aada22944d3e685e865387e32bfc4015a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxgw-wenkai-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
