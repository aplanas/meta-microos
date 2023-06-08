SUMMARY = "Documentation for qt6-networkauth in QCH format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-networkauth-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6f23eeac32904199c6aebc761d9f96586f08c885ac93e691ee1ac8eccd931052c17ac7e4c0fbf4fbc4c9e2575160877b6a4c0f83ea094b2a46eb56c6bae70b62"

RPROVIDES:${PN} += "qt6-networkauth-docs-qch qt6-networkauth-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
