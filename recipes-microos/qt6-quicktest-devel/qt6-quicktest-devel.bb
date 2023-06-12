SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktest-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a1dbb644f403a160fe9723f399c017eb5e85b92345ff082f28324c6298b53912414939972da12a43115cd4a4c5a39586dbd0e564d4ef013a8ec05791c0cc2439"

RPROVIDES:${PN} += "cmake(Qt6QuickTest) \
pkgconfig(Qt6QuickTest) \
qt6-quicktest-devel \
qt6-quicktest-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6Quick) \
cmake(Qt6Test) \
libQt6QuickTest6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Test) \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
