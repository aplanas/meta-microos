SUMMARY = "Development files for the Qt 6 3DQuickRender library"
DESCRIPTION = "Development files for the Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickrender-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "519fc1b27cf6c2a41777d9721a1799032962431ddfba5bad0f6fb3d1a63dd6133c6ae9d2a6940a2ecb0101e014279b0fc2dc1b426bc3263ddd9a303e25d8bc1a"

RPROVIDES:${PN} += "cmake(Qt63DQuickRender) pkgconfig(Qt63DQuickRender) qt6-3dquickrender-devel qt6-3dquickrender-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DQuick) cmake(Qt63DRender) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickRender6 pkgconfig(Qt63DCore) pkgconfig(Qt63DQuick) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
