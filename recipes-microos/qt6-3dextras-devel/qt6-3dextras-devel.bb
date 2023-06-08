SUMMARY = "Development files for the Qt 6 3DExtras library"
DESCRIPTION = "Development files for the Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dextras-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "cd61a645363d9be4acfe10778e1c4046524ff51500efcb46733103180b3ebe816012ced185d6aac07bb78734409fae2a98fa3f5845e505d28745adb8cb602672"

RPROVIDES:${PN} += "cmake(Qt63DExtras) pkgconfig(Qt63DExtras) qt6-3dextras-devel qt6-3dextras-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DInput) cmake(Qt63DLogic) cmake(Qt63DRender) libQt63DExtras6 pkgconfig(Qt63DCore) pkgconfig(Qt63DInput) pkgconfig(Qt63DLogic) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
