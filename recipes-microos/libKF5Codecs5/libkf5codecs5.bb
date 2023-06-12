SUMMARY = "Method collection to manipulate strings using various encodings"
DESCRIPTION = "KCodecs provides a collection of methods to manipulate strings using various \
encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Codecs5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "83b8d15bfc82bea436e59e2c2ecd1495989658b626d8e2c2424e122f2c4ca06a1b0270f3b182e73dbd49a57924683ac4b2ee453b857eb9599727b786ba116cd4"

RPROVIDES:${PN} += "libKF5Codecs.so.5()(64bit) libKF5Codecs5 libKF5Codecs5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
