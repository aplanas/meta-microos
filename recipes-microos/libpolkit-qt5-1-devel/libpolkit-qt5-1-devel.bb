SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.114.0"

RPM_NAME = "libpolkit-qt5-1-devel-0.114.0-2.9.aarch64.rpm"
RPM_HASH = "8d6b4e50b8800d8839569526919bd3f3307b99ff3a00d4bfaf321d295fc3402fa76ea13a3680050cf0c2b89b0871dc4990af16c1eb108aea2f4d80621ca661e5"

RPROVIDES:${PN} += "cmake(PolkitQt5-1) \
libpolkit-qt5-1-devel \
libpolkit-qt5-1-devel(aarch-64) \
pkgconfig(polkit-qt5-1) \
pkgconfig(polkit-qt5-agent-1) \
pkgconfig(polkit-qt5-core-1) \
pkgconfig(polkit-qt5-gui-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolkit-qt5-1-1 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Widgets) \
pkgconfig(polkit-qt5-agent-1) \
pkgconfig(polkit-qt5-core-1) \
pkgconfig(polkit-qt5-gui-1) \
polkit-devel"

inherit rpm
