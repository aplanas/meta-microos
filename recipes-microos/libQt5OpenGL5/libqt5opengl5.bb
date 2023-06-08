SUMMARY = "Qt 5 OpenGL Library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5OpenGL5-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "47140ac9f906dce3147f4a39835056f5249cf8d76c60bf65454f700f19a3140afdd755a760267fb3dd1c3b481268a32d6244605a7f76111eebe04266829c91fa"

RPROVIDES:${PN} += "libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5OpenGL.so.5(Qt_5.0)(64bit) libQt5OpenGL.so.5(Qt_5.1)(64bit) libQt5OpenGL.so.5(Qt_5.10)(64bit) libQt5OpenGL.so.5(Qt_5.11)(64bit) libQt5OpenGL.so.5(Qt_5.12)(64bit) libQt5OpenGL.so.5(Qt_5.13)(64bit) libQt5OpenGL.so.5(Qt_5.14)(64bit) libQt5OpenGL.so.5(Qt_5.15)(64bit) libQt5OpenGL.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5OpenGL.so.5(Qt_5.2)(64bit) libQt5OpenGL.so.5(Qt_5.3)(64bit) libQt5OpenGL.so.5(Qt_5.4)(64bit) libQt5OpenGL.so.5(Qt_5.5)(64bit) libQt5OpenGL.so.5(Qt_5.6)(64bit) libQt5OpenGL.so.5(Qt_5.7)(64bit) libQt5OpenGL.so.5(Qt_5.8)(64bit) libQt5OpenGL.so.5(Qt_5.9)(64bit) libQt5OpenGL5 libQt5OpenGL5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
