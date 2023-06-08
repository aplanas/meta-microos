SUMMARY = "Development files for the Qt 6 3DQuick library"
DESCRIPTION = "Development files for the Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquick-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0d1e1da668e8064f59992afa78db3d6279be6b828deab98d10e65a1ab44d6b8a8b2eb4185566d21bf04490680f751804df5e6bc89f1803d42437a42ac846479d"

RPROVIDES:${PN} += "cmake(Qt63DQuick) pkgconfig(Qt63DQuick) qt6-3dquick-devel qt6-3dquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt6Qml) cmake(Qt6Quick) libQt63DQuick6 pkgconfig(Qt63DCore) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
