SUMMARY = "Qt 6 SVGWidgets library"
DESCRIPTION = "The Qt 6 SvgWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6SvgWidgets6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "39804a381ed853b3ed2a83fe80348d981fb755f5e5cd5398633af872aab46deb8269f8f221c47b6b0b24e5ed78954733f6d9b7178e58629390878f4781aae8d9"

RPROVIDES:${PN} += "libQt6SvgWidgets.so.6()(64bit) libQt6SvgWidgets.so.6(Qt_6)(64bit) libQt6SvgWidgets.so.6(Qt_6.0)(64bit) libQt6SvgWidgets.so.6(Qt_6.1)(64bit) libQt6SvgWidgets.so.6(Qt_6.2)(64bit) libQt6SvgWidgets.so.6(Qt_6.3)(64bit) libQt6SvgWidgets.so.6(Qt_6.4)(64bit) libQt6SvgWidgets.so.6(Qt_6.5)(64bit) libQt6SvgWidgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6SvgWidgets6 libQt6SvgWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Svg.so.6()(64bit) libQt6Svg.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
