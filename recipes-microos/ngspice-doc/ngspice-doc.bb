SUMMARY = "Documentation for the ngspice Mixed-signal simulator"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. \
 \
This package contains the user manual in PDF format."
LICENSE = "CC-BY-SA-4.0 & BSD-3-Clause"

PV = "40"

RPM_NAME = "ngspice-doc-40-1.1.noarch.rpm"
RPM_HASH = "8714c7f5001e5ec5b13d8ebfaf84e83f46d073a690ac113c6a7207c254ab54fc2f14b5531f031803eb66f2e9c77ca840545bcbcf8c2f3bd33a8d097f9f987441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ngspice-doc"
RDEPENDS:${PN} += ""

inherit rpm
