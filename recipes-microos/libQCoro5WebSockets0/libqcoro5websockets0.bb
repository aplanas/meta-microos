SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libQCoro5WebSockets0-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "a8927f5a77230db579883d1a85863b98bf9497a64066642459a8ac0ccb69b4eadfd1e133632cc8e1dc451b73dbc4b699e8c6de5f763f8ce6069df3673c8f82e6"

RPROVIDES:${PN} += "libQCoro5WebSockets.so.0()(64bit) libQCoro5WebSockets0 libQCoro5WebSockets0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebSockets.so.5()(64bit) libQt5WebSockets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
