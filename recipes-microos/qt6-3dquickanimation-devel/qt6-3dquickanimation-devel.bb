SUMMARY = "Development files for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickanimation-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "81a4cd898aa0e37789d275c4756265a88453de13b550f04e9b1aadd4c7fa762e20a589bbe7bba9fb5c65eed2e8761d2cfc93e6f9a7b650ceb9d0071eaee7a84b"

RPROVIDES:${PN} += "cmake(Qt63DQuickAnimation) pkgconfig(Qt63DQuickAnimation) qt6-3dquickanimation-devel qt6-3dquickanimation-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DAnimation) cmake(Qt63DCore) cmake(Qt63DQuick) cmake(Qt63DRender) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickAnimation6 pkgconfig(Qt63DAnimation) pkgconfig(Qt63DCore) pkgconfig(Qt63DQuick) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
