SUMMARY = "Qt 6 LabsSharedImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labssharedimage-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "ddb2825191933bfacaa66b86fa4bf708d5cf09c89c9d7f4e5d0dbb154ed9b5abe87486186846c9ed48fd88f3d741eea358a58dbaa154c3cb1c729775d54e315e"

RPROVIDES:${PN} += "cmake(Qt6LabsSharedImage) pkgconfig(Qt6LabsSharedImage) qt6-labssharedimage-devel qt6-labssharedimage-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsSharedImage6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-gui-private-devel qt6-quick-private-devel"

inherit rpm
