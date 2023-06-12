SUMMARY = "Qt 5 OpenGL Library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5OpenGL5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "1eb7433f309437f6f6b5066ed21b629c3ee6ce42730a51165b18337cfe6d782375482bcaa4273a822e1a2114e8e7780f93a15020ad9bbdd8f17b859901fce5b8"

RPROVIDES:${PN} += "libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5OpenGL.so.5(Qt_5.0)(64bit) libQt5OpenGL.so.5(Qt_5.1)(64bit) libQt5OpenGL.so.5(Qt_5.10)(64bit) libQt5OpenGL.so.5(Qt_5.11)(64bit) libQt5OpenGL.so.5(Qt_5.12)(64bit) libQt5OpenGL.so.5(Qt_5.13)(64bit) libQt5OpenGL.so.5(Qt_5.14)(64bit) libQt5OpenGL.so.5(Qt_5.15)(64bit) libQt5OpenGL.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5OpenGL.so.5(Qt_5.2)(64bit) libQt5OpenGL.so.5(Qt_5.3)(64bit) libQt5OpenGL.so.5(Qt_5.4)(64bit) libQt5OpenGL.so.5(Qt_5.5)(64bit) libQt5OpenGL.so.5(Qt_5.6)(64bit) libQt5OpenGL.so.5(Qt_5.7)(64bit) libQt5OpenGL.so.5(Qt_5.8)(64bit) libQt5OpenGL.so.5(Qt_5.9)(64bit) libQt5OpenGL5 libQt5OpenGL5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
