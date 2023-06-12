SUMMARY = "Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "The Qt 6 Quick3DHelpersImpl library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpersImpl6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a8855ce9462b57a0655abe86bbdd223d0976e5a0e71011a8a02bec2854482e41b3e34a8b3120712d76e49219c878e9e28f64fd29b71f16a19ae27fe952402e9c"

RPROVIDES:${PN} += "libQt6Quick3DHelpersImpl.so.6()(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.0)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.1)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.2)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.3)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.4)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.5)(64bit) libQt6Quick3DHelpersImpl.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Quick3DHelpersImpl6 libQt6Quick3DHelpersImpl6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick3D.so.6()(64bit) libQt6Quick3D.so.6(Qt_6)(64bit) libQt6Quick3D.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
