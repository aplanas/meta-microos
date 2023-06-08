SUMMARY = "Development files for the Qt 6 3DRender library"
DESCRIPTION = "Development files for the Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3drender-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ad939f40ccb8bdb336afe6a7693ec981116d39916eb669eabf1134eaaf7f93e643a02bf521e2d359098db70f423b380c185b44654c2defa2f22c43d58a90e071"

RPROVIDES:${PN} += "cmake(Qt63DRender) pkgconfig(Qt63DRender) qt6-3drender-devel qt6-3drender-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt6Concurrent) cmake(Qt6OpenGL) libQt63DRender6 pkgconfig(Qt63DCore) pkgconfig(Qt6Core) pkgconfig(Qt6OpenGL)"

inherit rpm
