SUMMARY = "Development files for the Qt5 Multimedia library"
DESCRIPTION = "You need this package if you want to compile programs with qtmultimedia."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde3"

RPM_NAME = "libqt5-qtmultimedia-devel-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "1a72341145a7ec7b8b240da3e796feb41d0ae10beed6a0d6a163371c200f92a3509e6a3ae2576873f72ad6203c9f925aeae60ea7e540ded71903914db58b6076"

RPROVIDES:${PN} += "cmake(Qt5Multimedia) cmake(Qt5MultimediaGstTools) cmake(Qt5MultimediaQuick) cmake(Qt5MultimediaWidgets) libQt5Multimedia-devel libqt5-qtmultimedia-devel libqt5-qtmultimedia-devel(aarch-64) pkgconfig(Qt5Multimedia) pkgconfig(Qt5MultimediaWidgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Multimedia5 libpulse-devel libqt5-qtdeclarative-devel pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Multimedia) pkgconfig(Qt5Network) pkgconfig(Qt5Widgets)"

inherit rpm
