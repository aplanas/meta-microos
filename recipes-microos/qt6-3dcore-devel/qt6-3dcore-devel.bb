SUMMARY = "Development files for the Qt 6 3DCore library"
DESCRIPTION = "Development files for the Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dcore-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "fd83b270773dd64d4a288b1b2c1c72374871e467336af5d06f71e435d7f74a89f71ab872c4ad65057c9a6e98327afc525fbb98dd1792bb73b1bacf2c676069fd"

RPROVIDES:${PN} += "cmake(Qt63DCore) pkgconfig(Qt63DCore) qt6-3dcore-devel qt6-3dcore-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Concurrent) cmake(Qt6Gui) cmake(Qt6Network) libQt63DCore6 pkgconfig(Qt6Concurrent) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Network)"

inherit rpm
