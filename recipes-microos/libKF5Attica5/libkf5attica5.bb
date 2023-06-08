SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Attica5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "2fde3d2dabf66b7090be9c3f730567f1204ad01c3b918f36dfcd51a7035eeab3012c4381de4d637ae1e45dae0515ff752cfc4f180d1fc62917ad68b79a594e72"

RPROVIDES:${PN} += "libKF5Attica.so.5()(64bit) libKF5Attica5 libKF5Attica5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig attica-qt5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Network5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
