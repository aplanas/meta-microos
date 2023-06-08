SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Development package to build Qt-based compositors."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libqt5-qtwayland-devel-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "3b30dbec058510e372321b3069078442d22ccd3618ea0c5af734e3897ac78025fd44be5db4f4470bb172090bcec9a044aa7a9d4fe53f58f49a362873513cf3df"

RPROVIDES:${PN} += "cmake(Qt5WaylandClient) cmake(Qt5WaylandCompositor) libqt5-qtwayland-devel libqt5-qtwayland-devel(aarch-64) pkgconfig(Qt5WaylandClient) pkgconfig(Qt5WaylandCompositor)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5WaylandClient5 libQt5WaylandCompositor5 libqt5-qtwayland pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Qml) pkgconfig(Qt5Quick)"

inherit rpm
