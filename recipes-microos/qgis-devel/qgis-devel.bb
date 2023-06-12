SUMMARY = "Development Libraries for QGIS"
DESCRIPTION = "Development packages for QGIS, including the C header files."
LICENSE = "GPL-2.0-only"

PV = "3.30.2"

RPM_NAME = "qgis-devel-3.30.2-1.1.aarch64.rpm"
RPM_HASH = "3696ff2bf090ebce1b367a586019b14cde6fb3bec1e410017180bc7aafc0feaf6f1814e964985fce0292a34b40250ac1a17294417e95e76d28fb2cf065417513"

RPROVIDES:${PN} += "qgis-devel qgis-devel(aarch-64)"
RDEPENDS:${PN} += "python3-qt5-devel qgis"

inherit rpm
