SUMMARY = "Documentation for qt6-quickeffectmaker in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffectmaker-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "725b84d88040b92663b4c6d1b7ef59f37295862b9c7ece75f654bc7cc8cd86d47235302e1e3df56538abff61b7ca80dfb0f9263b190b22c073de928b6d59d148"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-qch \
qt6-quickeffectmaker-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
