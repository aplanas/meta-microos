SUMMARY = "Qt 6 OpenGLWidgets library"
DESCRIPTION = "The Qt OpenGL Widgets module provides an OpenGLWidgets class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6OpenGLWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6232927676c063daac1128c174ab16b4ba37ae7be83d3875d33fdf88e312016074bcaa41500a3da05a26128dc64537c8ef48f8b2496c95186c12ff0eb1b88ace"

RPROVIDES:${PN} += "libQt6OpenGLWidgets.so.6()(64bit) libQt6OpenGLWidgets.so.6(Qt_6)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.0)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.1)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.2)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.3)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.4)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.5)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6OpenGLWidgets6 libQt6OpenGLWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6OpenGL.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Widgets6 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
