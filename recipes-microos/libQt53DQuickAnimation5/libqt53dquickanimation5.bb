SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickAnimation5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "0617942b83fd01efbc830a492c381b3dff6fc3c73b350e1bdaa48b2266d3f05213068d2e65428c78b7250a8a1aa43c3e05fd7d5419bfb2bd2ac6444a5cfd92d0"

RPROVIDES:${PN} += "libQt53DQuickAnimation.so.5()(64bit) \
libQt53DQuickAnimation.so.5(Qt_5)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.0)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.1)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.10)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.11)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.12)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.13)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.14)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.15)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.2)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.3)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.4)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.5)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.6)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.7)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.8)(64bit) \
libQt53DQuickAnimation.so.5(Qt_5.9)(64bit) \
libQt53DQuickAnimation5 \
libQt53DQuickAnimation5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt53DAnimation.so.5()(64bit) \
libQt53DAnimation.so.5(Qt_5)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
