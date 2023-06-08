SUMMARY = "Development files for Qt5's State Chart XML library"
DESCRIPTION = "You need this package if you want to compile programs with QtScxml."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtscxml-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "dccebd3a538c82c15eba899b6ca84c864cb7d955b9706bee6068728f4859d37030cf4aca7766e58326413fd980fc9abf4ba1c49fd2ec380940d865acf5c26e24"

RPROVIDES:${PN} += "cmake(Qt5Scxml) libqt5-qtscxml-devel libqt5-qtscxml-devel(aarch-64) pkgconfig(Qt5Scxml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Scxml5 libqt5-qtscxml-tools pkgconfig(Qt5Core) pkgconfig(Qt5Qml)"

inherit rpm
