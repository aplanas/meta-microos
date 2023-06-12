SUMMARY = "Qt 6 QuickLayouts library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicklayouts-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d56742f1490acfa352ac802a5c7447b46e4e734d31642224c77c652f23dce93eafec90b33c3a0aef2253b4a767a4f25a6afbc15b672b62e00abde61fa628b4b5"

RPROVIDES:${PN} += "cmake(Qt6QuickLayouts) \
pkgconfig(Qt6QuickLayouts) \
qt6-quicklayouts-devel \
qt6-quicklayouts-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
libQt6QuickLayouts6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
