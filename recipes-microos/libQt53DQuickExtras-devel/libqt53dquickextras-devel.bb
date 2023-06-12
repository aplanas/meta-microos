SUMMARY = "Development files for the Qt 5 3D QuickExtras library"
DESCRIPTION = "Development files for the Qt 5 Logic 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickExtras-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "99a9dc011ca8bd37abdd6d07d82b642cb28544b8c8cb2b10df5f0ab70059b3af622685df5aeb7f4d24bfaf3408610ce5064ee35a573281f528a8b273ab94d972"

RPROVIDES:${PN} += "cmake(Qt53DQuickExtras) \
libQt53DQuickExtras-devel \
libQt53DQuickExtras-devel(aarch-64) \
pkgconfig(Qt53DQuickExtras)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickExtras5 \
pkgconfig(Qt53DCore) \
pkgconfig(Qt53DExtras) \
pkgconfig(Qt53DInput) \
pkgconfig(Qt53DLogic) \
pkgconfig(Qt53DQuick) \
pkgconfig(Qt53DRender) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Qml)"

inherit rpm
