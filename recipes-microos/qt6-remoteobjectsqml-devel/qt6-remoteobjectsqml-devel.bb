SUMMARY = "Qt 6 RemoteObjectsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjectsQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjectsqml-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "24c4c55e02e94716b75559b32ce180d4f064fe7e1edf907908b56da2b1b8053eb06db568904b89da58f17131874fb42b17ed60d80470ab7627c93449638e7fa8"

RPROVIDES:${PN} += "cmake(Qt6RemoteObjectsQml) pkgconfig(Qt6RemoteObjectsQml) qt6-remoteobjectsqml-devel qt6-remoteobjectsqml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) cmake(Qt6RemoteObjects) libQt6RemoteObjectsQml6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml) pkgconfig(Qt6RemoteObjects)"

inherit rpm
