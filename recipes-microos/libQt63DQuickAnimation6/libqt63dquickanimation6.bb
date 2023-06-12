SUMMARY = "Qt 6 3DQuickAnimation library"
DESCRIPTION = "The Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickAnimation6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8ddd7881b0c3e307fcb09c360f9964f1d890ee433f122e72cd231e02066d5d9124b50c858c0356b16ebf10b784e94693091a1480ca7a6e54879d620e3844de17"

RPROVIDES:${PN} += "libQt63DQuickAnimation.so.6()(64bit) libQt63DQuickAnimation.so.6(Qt_6)(64bit) libQt63DQuickAnimation.so.6(Qt_6.0)(64bit) libQt63DQuickAnimation.so.6(Qt_6.1)(64bit) libQt63DQuickAnimation.so.6(Qt_6.2)(64bit) libQt63DQuickAnimation.so.6(Qt_6.3)(64bit) libQt63DQuickAnimation.so.6(Qt_6.4)(64bit) libQt63DQuickAnimation.so.6(Qt_6.5)(64bit) libQt63DQuickAnimation.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt63DQuickAnimation6 libQt63DQuickAnimation6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DAnimation.so.6()(64bit) libQt63DAnimation.so.6(Qt_6)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
