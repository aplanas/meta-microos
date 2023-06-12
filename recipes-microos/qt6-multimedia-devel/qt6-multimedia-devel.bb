SUMMARY = "Qt 6 Multimedia library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "df98e2732e55b864501c8a4b35a89d4ad1e74bf1aee00c041453dc701c5e352b0439d4f2d8f81f4aba6e7a1e69956adcc9d021655a8c8cbd80f887fe4151a7d2"

RPROVIDES:${PN} += "cmake(Qt6Multimedia) pkgconfig(Qt6Multimedia) qt6-multimedia-devel qt6-multimedia-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) libQt6Multimedia6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Network)"

inherit rpm
