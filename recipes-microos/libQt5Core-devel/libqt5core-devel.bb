SUMMARY = "Development files for the Qt5 core library"
DESCRIPTION = "Development files for the Qt5 core library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Core-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "2e97cc1b551450afd9f36741bffc97fe5400b4f1403bc0eb7ba70c0e5ff8c8d62cb3e9284c3160f4c6ecc1e726f1ba9a906cd232880937d9a38f1b9d76b2dd62"

RPROVIDES:${PN} += "cmake(Qt5) cmake(Qt5Core) libQt5Core-devel libQt5Core-devel(aarch-64) pkgconfig(Qt5Core)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core5 libqt5-qtbase-common-devel"

inherit rpm
