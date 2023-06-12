SUMMARY = "Qt 5 SVG Library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde8"

RPM_NAME = "libQt5Svg5-5.15.9+kde8-1.1.aarch64.rpm"
RPM_HASH = "7a54311c0a68006e9b43ad0cdf92c4abd85e6ee6f4d85c75a8b6cefd600d6443a4264f8c023cd50224212670f900e73a9b92ca8f8fa1645ba8dd7cc6a8daea6f"

RPROVIDES:${PN} += "libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Svg.so.5(Qt_5.0)(64bit) \
libQt5Svg.so.5(Qt_5.1)(64bit) \
libQt5Svg.so.5(Qt_5.10)(64bit) \
libQt5Svg.so.5(Qt_5.11)(64bit) \
libQt5Svg.so.5(Qt_5.12)(64bit) \
libQt5Svg.so.5(Qt_5.13)(64bit) \
libQt5Svg.so.5(Qt_5.14)(64bit) \
libQt5Svg.so.5(Qt_5.15)(64bit) \
libQt5Svg.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Svg.so.5(Qt_5.2)(64bit) \
libQt5Svg.so.5(Qt_5.3)(64bit) \
libQt5Svg.so.5(Qt_5.4)(64bit) \
libQt5Svg.so.5(Qt_5.5)(64bit) \
libQt5Svg.so.5(Qt_5.6)(64bit) \
libQt5Svg.so.5(Qt_5.7)(64bit) \
libQt5Svg.so.5(Qt_5.8)(64bit) \
libQt5Svg.so.5(Qt_5.9)(64bit) \
libQt5Svg5 \
libQt5Svg5(aarch-64) \
libqsvg.so()(64bit) \
libqsvgicon.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Widgets5 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
