SUMMARY = "DBus support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for D-Bus support."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "libQCoro5DBus0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "27c1b293b5eb812a585c73bdf0df4bb60ce49021a091200d2f0e3c27d417b7b75b8836df203e6d343624c0bda702b1e33b7f609a14ee8694a2470d3650633d50"

RPROVIDES:${PN} += "libQCoro5DBus.so.0()(64bit) libQCoro5DBus0 libQCoro5DBus0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
