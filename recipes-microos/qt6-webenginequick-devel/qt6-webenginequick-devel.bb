SUMMARY = "Development files for the Qt 6 WebEngineQuick library"
DESCRIPTION = "Development files for the Qt 6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webenginequick-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "ca4335ffea097c97e72f79eb835340968cd8a8c941bff015cdb3a04c0f313246bf6499b00017e2711a566ea42b06de23b5883bdf9c969bfffe8c509cfec8e1c9"

RPROVIDES:${PN} += "cmake(Qt6WebEngineQuick) cmake(Qt6WebEngineQuickDelegatesQml) pkgconfig(Qt6WebEngineQuick) pkgconfig(Qt6WebEngineQuickDelegatesQml) qt6-webenginequick-devel qt6-webenginequick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6WebEngineCore) libQt6WebEngineQuick6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6WebEngineCore)"

inherit rpm
