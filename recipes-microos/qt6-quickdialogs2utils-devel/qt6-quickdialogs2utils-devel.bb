SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickdialogs2utils-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "81d0e32d17a9bf94a649537010a2b542de6620bf195df40457a15425862d58871c9afc5da94e5d42e7cb4675d9d8665821ea8b659e0ef8087acd688e75c43303"

RPROVIDES:${PN} += "cmake(Qt6QuickDialogs2Utils) pkgconfig(Qt6QuickDialogs2Utils) qt6-quickdialogs2utils-devel qt6-quickdialogs2utils-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6QuickDialogs2Utils6 pkgconfig(Qt6Core) qt6-gui-private-devel"

inherit rpm
