SUMMARY = "Development files for the Qt 5 3D Quick Scene 2D library"
DESCRIPTION = "Development files for the Qt 5 3D Quick Scene 2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickScene2D-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "8fd5f7f23153456f81bdbedf57aa2904ce39ba18987c1617d2d92cc2624d562d75c557e4c7f7b6c6673522218a2800bffacd9677e8531e4476a51d80d7e9d86b"

RPROVIDES:${PN} += "cmake(Qt53DQuickScene2D) libQt53DQuickScene2D-devel libQt53DQuickScene2D-devel(aarch-64) pkgconfig(Qt53DQuickScene2D)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt53DQuickScene2D5 pkgconfig(Qt53DCore) pkgconfig(Qt53DQuick) pkgconfig(Qt53DRender) pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Qml)"

inherit rpm
