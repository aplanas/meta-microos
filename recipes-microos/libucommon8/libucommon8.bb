SUMMARY = "GNU uCommon Runtime library for portable C++ threading and sockets"
DESCRIPTION = "GNU uCommon C++ is a lightweight library to facilitate using C++ \
design patterns even for very deeply embedded applications, such as \
for systems using uClibc along with POSIX threading support. For this \
reason, uCommon disables language features that consume memory or \
introduce runtime overhead. uCommon introduces some design patterns \
from Objective-C, such as reference counted objects, memory pools, \
and smart pointers. uCommon introduces some new concepts for handling \
of thread locking and synchronization."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "libucommon8-7.0.1-1.9.aarch64.rpm"
RPM_HASH = "215de5f3925f06113b645923c662a312eaebd992d2bf682d46edd2aab07451117fd5ce68eb9deaed015294a70ce01c3a1c4734a88c1c7e911151261be0313fb9"

RPROVIDES:${PN} += "libcommoncpp.so.8()(64bit) libucommon.so.8()(64bit) libucommon8 libucommon8(aarch-64) libusecure.so.8()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
