SUMMARY = "Qt 6 OpenGLWidgets library"
DESCRIPTION = "The Qt OpenGL Widgets module provides an OpenGLWidgets class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6OpenGLWidgets6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "f175b629fc42b9fd0500b1ca408a28af34d3f8a737b102de36dbc452ff0db5138f12f77c1070affc1f11a6132a3304c88dba68ad390ab7bb9c1da305e7f84182"

RPROVIDES:${PN} += "libQt6OpenGLWidgets.so.6()(64bit) libQt6OpenGLWidgets.so.6(Qt_6)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.0)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.1)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.2)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.3)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.4)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.5)(64bit) libQt6OpenGLWidgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6OpenGLWidgets6 libQt6OpenGLWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6OpenGL.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Widgets6 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
