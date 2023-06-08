SUMMARY = "Qt 6 3DQuick library"
DESCRIPTION = "The Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DQuick6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "98291c9187a55a5d56998cc247e11a389849b2b8602abbd5635cdce1217561de9b9a5fc514988de97a5291140d398838f8f4fe47e39dc7526d40507a2e4cc489"

RPROVIDES:${PN} += "libQt63DQuick.so.6()(64bit) libQt63DQuick.so.6(Qt_6)(64bit) libQt63DQuick.so.6(Qt_6.0)(64bit) libQt63DQuick.so.6(Qt_6.1)(64bit) libQt63DQuick.so.6(Qt_6.2)(64bit) libQt63DQuick.so.6(Qt_6.3)(64bit) libQt63DQuick.so.6(Qt_6.4)(64bit) libQt63DQuick.so.6(Qt_6.5)(64bit) libQt63DQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DQuick6 libQt63DQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlModels.so.6()(64bit) libQt6QmlModels.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
