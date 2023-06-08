SUMMARY = "Qt 6 3DAnimation library"
DESCRIPTION = "The Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DAnimation6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "28483349927d1bb69579904d57729c549abf1f0c0ccac46f3dfa49e57ac4269390cfee1a48d6fb3fb9b83aa535a51d67f0da53f9df5d35f00b33b26455b8b6b9"

RPROVIDES:${PN} += "libQt63DAnimation.so.6()(64bit) libQt63DAnimation.so.6(Qt_6)(64bit) libQt63DAnimation.so.6(Qt_6.0)(64bit) libQt63DAnimation.so.6(Qt_6.1)(64bit) libQt63DAnimation.so.6(Qt_6.2)(64bit) libQt63DAnimation.so.6(Qt_6.3)(64bit) libQt63DAnimation.so.6(Qt_6.4)(64bit) libQt63DAnimation.so.6(Qt_6.5)(64bit) libQt63DAnimation.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DAnimation6 libQt63DAnimation6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
