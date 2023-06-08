SUMMARY = "Development files for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "Development files for the Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickscene2d-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a475debcaf51910a9f2b3398f9c45b9b4335a9d832b39dd13a578f9523a5778c8c8363d46d202761385c13eb4ef66810645ab74c18320754af76fa567e852467"

RPROVIDES:${PN} += "cmake(Qt63DQuickScene2D) pkgconfig(Qt63DQuickScene2D) qt6-3dquickscene2d-devel qt6-3dquickscene2d-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DQuick) cmake(Qt63DRender) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickScene2D6 pkgconfig(Qt63DCore) pkgconfig(Qt63DQuick) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
