SUMMARY = "Development files for the Qt 6 3DQuickExtras library"
DESCRIPTION = "Development files for the Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickextras-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "517d50ea5435db26f70213d429c3c14be360f822836d0cad257b95238e4a8faca43916eba831df2b82bc3823e60ffc485af71b52d858de8b8281083f7a55fc70"

RPROVIDES:${PN} += "cmake(Qt63DQuickExtras) pkgconfig(Qt63DQuickExtras) qt6-3dquickextras-devel qt6-3dquickextras-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DExtras) cmake(Qt63DInput) cmake(Qt63DQuick) cmake(Qt63DRender) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickExtras6 pkgconfig(Qt63DCore) pkgconfig(Qt63DExtras) pkgconfig(Qt63DInput) pkgconfig(Qt63DQuick) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
