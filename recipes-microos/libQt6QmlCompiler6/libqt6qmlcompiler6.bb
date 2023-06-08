SUMMARY = "Qt6 QmlCompiler library"
DESCRIPTION = "The Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QmlCompiler6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "15acb2b184de6ddc9887a75fb475e8cf74aadebd25b478bdbbfbf7e6639739812844b93114b09515f685e10870934ead44013167ebc28edf6c8937ae288fc617"

RPROVIDES:${PN} += "libQt6QmlCompiler.so.6()(64bit) libQt6QmlCompiler.so.6(Qt_6)(64bit) libQt6QmlCompiler.so.6(Qt_6.0)(64bit) libQt6QmlCompiler.so.6(Qt_6.1)(64bit) libQt6QmlCompiler.so.6(Qt_6.2)(64bit) libQt6QmlCompiler.so.6(Qt_6.3)(64bit) libQt6QmlCompiler.so.6(Qt_6.4)(64bit) libQt6QmlCompiler.so.6(Qt_6.5)(64bit) libQt6QmlCompiler.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlCompiler6 libQt6QmlCompiler6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
