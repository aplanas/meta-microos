SUMMARY = "Development files for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickanimation-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "fd6dbd1e3ac65f9b7f026612cdb3e31b82230ba49f3616ef18b1bb3552d3dba992b80fc9eaac335b021430231aa0bcae990ad13cb8b8e8b3b89dbdbfa14707a6"

RPROVIDES:${PN} += "cmake(Qt63DQuickAnimation) pkgconfig(Qt63DQuickAnimation) qt6-3dquickanimation-devel qt6-3dquickanimation-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DAnimation) cmake(Qt63DCore) cmake(Qt63DQuick) cmake(Qt63DRender) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickAnimation6 pkgconfig(Qt63DAnimation) pkgconfig(Qt63DCore) pkgconfig(Qt63DQuick) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
