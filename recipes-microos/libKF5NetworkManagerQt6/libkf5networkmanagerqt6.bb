SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5NetworkManagerQt6-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "08604f00599ce20ab1fc81bf34d0ff69972c9946ee0bbcd718a77e68e478bf2b61fb8839d4a08e754b0684b2b3461b8c1f919919f18d476a2324b64418a90368"

RPROVIDES:${PN} += "libKF5NetworkManagerQt.so.6()(64bit) libKF5NetworkManagerQt6 libKF5NetworkManagerQt6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
