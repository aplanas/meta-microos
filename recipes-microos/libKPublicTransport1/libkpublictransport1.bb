SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKPublicTransport1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2f111281ac5624f913b1ce06ca818fe2e03a7308605f5dfdf7a1898a9bc73ffd9c998db38c04149d1d6ebf73f8f3f193303ed164161f8d684a98f45b283d4a6c"

RPROVIDES:${PN} += "libKPublicTransport.so.1()(64bit) libKPublicTransport1 libKPublicTransport1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
