SUMMARY = "Qt 6 Svg library"
DESCRIPTION = "The Qt 6 Svg library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Svg6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2bbfabcca3ca634a470d4e9b03929edd1463c7e81af6e5373339e173d96eeaa3683878ed9532e265c555ab260cdc9481e45f482779631fc8536f8061d68c9828"

RPROVIDES:${PN} += "libQt6Svg.so.6()(64bit) libQt6Svg.so.6(Qt_6)(64bit) libQt6Svg.so.6(Qt_6.0)(64bit) libQt6Svg.so.6(Qt_6.1)(64bit) libQt6Svg.so.6(Qt_6.2)(64bit) libQt6Svg.so.6(Qt_6.3)(64bit) libQt6Svg.so.6(Qt_6.4)(64bit) libQt6Svg.so.6(Qt_6.5)(64bit) libQt6Svg.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Svg6 libQt6Svg6(aarch-64) libqsvg.so()(64bit) libqsvg.so(Qt_6)(64bit) libqsvg.so(Qt_6.0)(64bit) libqsvg.so(Qt_6.1)(64bit) libqsvg.so(Qt_6.2)(64bit) libqsvg.so(Qt_6.3)(64bit) libqsvg.so(Qt_6.4)(64bit) libqsvg.so(Qt_6.5)(64bit) libqsvg.so(Qt_6.5.0_PRIVATE_API)(64bit) libqsvgicon.so()(64bit) libqsvgicon.so(Qt_6)(64bit) libqsvgicon.so(Qt_6.0)(64bit) libqsvgicon.so(Qt_6.1)(64bit) libqsvgicon.so(Qt_6.2)(64bit) libqsvgicon.so(Qt_6.3)(64bit) libqsvgicon.so(Qt_6.4)(64bit) libqsvgicon.so(Qt_6.5)(64bit) libqsvgicon.so(Qt_6.5.0_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit)"

inherit rpm
