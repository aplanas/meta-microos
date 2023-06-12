SUMMARY = "Qt 6 3DCore library"
DESCRIPTION = "The Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DCore6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "90101a2ed830ec0620e18d5a082ac44ed9e0f42a3df0c84edbfc845f6679bd49f104178eec9454126bf3780436a224b2d163366bb16e643d3d1417ad27e31927"

RPROVIDES:${PN} += "libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.0)(64bit) libQt63DCore.so.6(Qt_6.1)(64bit) libQt63DCore.so.6(Qt_6.2)(64bit) libQt63DCore.so.6(Qt_6.3)(64bit) libQt63DCore.so.6(Qt_6.4)(64bit) libQt63DCore.so.6(Qt_6.5)(64bit) libQt63DCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt63DCore6 libQt63DCore6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Concurrent.so.6()(64bit) libQt6Concurrent.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
