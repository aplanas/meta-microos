SUMMARY = "Development files for the Qt 6 3DQuick library"
DESCRIPTION = "Development files for the Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquick-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3b2bb45f12b0b10016fbd8b18db760f2239e834cf5cb1ff91b720773bdfaabfca3e0f35a59d30ab015c12b2780d269bdb209a25b10f966a9c8f324d587f00544"

RPROVIDES:${PN} += "cmake(Qt63DQuick) \
pkgconfig(Qt63DQuick) \
qt6-3dquick-devel \
qt6-3dquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
libQt63DQuick6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick)"

inherit rpm
