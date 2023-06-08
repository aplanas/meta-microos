SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D Logic module enables synchronizing frames with the Qt 3D \
backend."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DLogic5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "f2c4201c24ac39d1f572dfcf08e26533ad5e4fa5f63202615b8913f89ec952e3effd10e5c0037798685c23ce8c7343e882332d00828ec65d381f998e5c5c9ca8"

RPROVIDES:${PN} += "libQt53DLogic.so.5()(64bit) libQt53DLogic.so.5(Qt_5)(64bit) libQt53DLogic.so.5(Qt_5.0)(64bit) libQt53DLogic.so.5(Qt_5.1)(64bit) libQt53DLogic.so.5(Qt_5.10)(64bit) libQt53DLogic.so.5(Qt_5.11)(64bit) libQt53DLogic.so.5(Qt_5.12)(64bit) libQt53DLogic.so.5(Qt_5.13)(64bit) libQt53DLogic.so.5(Qt_5.14)(64bit) libQt53DLogic.so.5(Qt_5.15)(64bit) libQt53DLogic.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt53DLogic.so.5(Qt_5.2)(64bit) libQt53DLogic.so.5(Qt_5.3)(64bit) libQt53DLogic.so.5(Qt_5.4)(64bit) libQt53DLogic.so.5(Qt_5.5)(64bit) libQt53DLogic.so.5(Qt_5.6)(64bit) libQt53DLogic.so.5(Qt_5.7)(64bit) libQt53DLogic.so.5(Qt_5.8)(64bit) libQt53DLogic.so.5(Qt_5.9)(64bit) libQt53DLogic5 libQt53DLogic5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt53DCore.so.5()(64bit) libQt53DCore.so.5(Qt_5)(64bit) libQt53DCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
