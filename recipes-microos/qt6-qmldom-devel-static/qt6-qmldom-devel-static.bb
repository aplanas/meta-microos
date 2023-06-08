SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmldom-devel-static-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "63e34a9925939ad1ca178cee469b3c56313330f2053e96f72d0e7e01f5a4d29a001992cce5887d693d1ba16da681863544060b59c1c89f37580d9372659ad0f3"

RPROVIDES:${PN} += "cmake(Qt6QmlDomPrivate) qt6-qmldom-devel-static qt6-qmldom-devel-static(aarch-64) qt6-qmldom-private-devel"
RDEPENDS:${PN} += "cmake(Qt6QmlCompilerPrivate) qt6-qml-private-devel"

inherit rpm
