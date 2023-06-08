SUMMARY = "wlr-layer-shell integration for Qt 5 - development files"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "layer-shell-qt5-devel-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "2a452e84ee3ce3df31a494f7c55f06fbfd5786e799e1de877c1a7d865c4eb13e7c77476172c37a3f8905e968ccb4d18a35006281403a132e71b62ac134918fb4"

RPROVIDES:${PN} += "cmake(LayerShellQt) layer-shell-qt5-devel layer-shell-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Qml) layer-shell-qt5 libqt5-qtwayland-private-headers-devel pkgconfig(wayland-client)"

inherit rpm
