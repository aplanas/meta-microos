SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libQCoro6WebSockets0-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "a045ca88c8d10916c7a417f53244dc170e35b080f6a3a6c8cc0260e618257087b4e4da1fe59a9400c6c0a61f81d8c7a0a63f83dd8aea5965e509590df31a105a"

RPROVIDES:${PN} += "libQCoro6WebSockets.so.0()(64bit) libQCoro6WebSockets0 libQCoro6WebSockets0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6WebSockets.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
