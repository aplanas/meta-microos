SUMMARY = "Development files for the Qt5 testing library"
DESCRIPTION = "Development files for the Qt5 testing library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Test-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "026e155bf129b4155d8ec56612108374c64d03a416474c9c906922c884c8deb8c85ac9f0ef90717fce4c3432ca1ccb53a0cb1ccd30faa4454d8b3f30e5b277a7"

RPROVIDES:${PN} += "cmake(Qt5Test) libQt5Test-devel libQt5Test-devel(aarch-64) pkgconfig(Qt5Test)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Test5 pkgconfig(Qt5Core)"

inherit rpm
