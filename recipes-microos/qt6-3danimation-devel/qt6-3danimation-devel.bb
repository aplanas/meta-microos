SUMMARY = "Development files for the Qt 6 3DAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3danimation-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "419abe9eb0f521a47c365cb1fb0387dfd7d59029b73efd86836f612d21a6ebda5522f342096dc5dff6e6f298a3d4a8bdfa1966e1d9d3368e899a8296d0c48a00"

RPROVIDES:${PN} += "cmake(Qt63DAnimation) pkgconfig(Qt63DAnimation) qt6-3danimation-devel qt6-3danimation-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DRender) cmake(Qt6Gui) libQt63DAnimation6 pkgconfig(Qt63DCore) pkgconfig(Qt63DRender) pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
