SUMMARY = "Devel files for libqtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libqt5xdg-devel-3.11.0-1.2.aarch64.rpm"
RPM_HASH = "e2a08a53932ef4e4554c7ffc622e091ad67981f6ba96f32fceda487f33d3c1fb0c30685074f6ebf2a007be684d57aff750cdd26a3696c004d6a9eaa9b346c8a7"

RPROVIDES:${PN} += "cmake(qt5xdg) libqt5xdg-devel libqt5xdg-devel(aarch-64) pkgconfig(Qt5Xdg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Xdg3 pkgconfig pkgconfig(Qt5Core) pkgconfig(Qt5DBus) pkgconfig(Qt5UiTools) pkgconfig(Qt5Widgets) pkgconfig(Qt5XdgIconLoader) pkgconfig(Qt5Xml)"

inherit rpm
