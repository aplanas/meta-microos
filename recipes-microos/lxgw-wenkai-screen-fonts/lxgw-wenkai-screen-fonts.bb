SUMMARY = "Chinese font derived from Klee One"
DESCRIPTION = "A Chinese font derived from Fontworks's Klee One."
LICENSE = "OFL-1.1"

PV = "1.250.2"

RPM_NAME = "lxgw-wenkai-screen-fonts-1.250.2-2.1.noarch.rpm"
RPM_HASH = "61d9532440da081ee4770bf52c4b193dcca09673b6a004e3fda3bd1aa61fbb66c7e591a0cb26a0fcf4c9c72a73050fca355e87d463c141f83a957912d64d3a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxgw-wenkai-screen-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
