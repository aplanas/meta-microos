SUMMARY = "Qt 6 Multimedia library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimedia-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "6bf895f5d0ab5e8aae4e0a82f896c73446e8a512699f809f4a78d39e1263ab0f8f3bff47778fcbcb897d072d83f9bfd838f1bb3722ace98cc626b1a5f5ee2b07"

RPROVIDES:${PN} += "cmake(Qt6Multimedia) pkgconfig(Qt6Multimedia) qt6-multimedia-devel qt6-multimedia-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) libQt6Multimedia6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Network)"

inherit rpm
