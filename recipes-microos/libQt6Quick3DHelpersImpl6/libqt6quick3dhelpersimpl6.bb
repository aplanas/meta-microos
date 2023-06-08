SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0d2ec8cd0efc806ba0a3039f1bfd6eef6ddea024df2aa62f6a2899ed22bf0a07413604f206429357289439295f40df69afcabf33f5a1f6d971e4705a65d5efc7"

RPROVIDES:${PN} += "libQt6Quick3DHelpersImpl.so.6()(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.0)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.1)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.2)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.3)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.4)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.5)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DHelpersImpl6 libQt6Quick3DHelpersImpl6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
