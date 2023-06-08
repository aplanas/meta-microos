SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Codecs5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "aca4fbffd6c8d8e953b929ef185fc61b5ae417d5cd1a33ecb3645092b8c63b5fe0970e38410a0049e0d80968c0eb8e9c144ee333dafb2612b866e2cc82b318a5"

RPROVIDES:${PN} += "libKF5Codecs.so.5()(64bit) libKF5Codecs5 libKF5Codecs5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
