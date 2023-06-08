SUMMARY = "Qt 6 Quick3DEffects library"
DESCRIPTION = "The Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DEffects6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b8fe888f1987cb0739c080557fd1d3b3993bb091889d7846f541e1f5b254c91528464cedf55e81310ffed11441745990ef487a079d3e1b511ae6483a13183c80"

RPROVIDES:${PN} += "libQt6Quick3DEffects.so.6()(64bit) libQt6Quick3DEffects6 libQt6Quick3DEffects6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
