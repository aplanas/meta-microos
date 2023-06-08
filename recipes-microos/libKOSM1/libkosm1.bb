SUMMARY = "OSM primitives for kosmindoormap"
DESCRIPTION = "OSM primitives for kosmindoormap."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.0"

RPM_NAME = "libKOSM1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "11fffd7273f834acac71f6a91b55d7517d083b7da51de28025f9c1e5aa1852c47270045cecb46ed72e0a8cc198b996c5f3bf7d2e033cf069349a776ca12a38a2"

RPROVIDES:${PN} += "libKOSM.so.1()(64bit) libKOSM1 libKOSM1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
