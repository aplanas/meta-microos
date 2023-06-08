SUMMARY = "Qt 6 3DCore library"
DESCRIPTION = "The Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DCore6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "65b2fc889aeb174d1e8a5897a992feedbc0d6fe0dc18bd6b53e29668aea2c855fd733cf1a79310140213f1964c3a9cee71e6bfc40b233a4e6f72fc8cb5ae7c7f"

RPROVIDES:${PN} += "libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.0)(64bit) libQt63DCore.so.6(Qt_6.1)(64bit) libQt63DCore.so.6(Qt_6.2)(64bit) libQt63DCore.so.6(Qt_6.3)(64bit) libQt63DCore.so.6(Qt_6.4)(64bit) libQt63DCore.so.6(Qt_6.5)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DCore6 libQt63DCore6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Concurrent.so.6()(64bit) libQt6Concurrent.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
