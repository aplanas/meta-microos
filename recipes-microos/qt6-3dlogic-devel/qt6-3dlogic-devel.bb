SUMMARY = "Development files for the Qt 6 3DLogic library"
DESCRIPTION = "Development files for the Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dlogic-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f467d8d953c4a04c7ae2ae74bddd0595dd59e16af17bdf0e9ce0f663a06bb6d136dde034c7c11ea155db6e9b3446e68689046d857e667e8a349abbb314f041b7"

RPROVIDES:${PN} += "cmake(Qt63DLogic) pkgconfig(Qt63DLogic) qt6-3dlogic-devel qt6-3dlogic-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) libQt63DLogic6 pkgconfig(Qt63DCore) pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
