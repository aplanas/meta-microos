SUMMARY = "DBus support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for D-Bus support."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libQCoro6DBus0-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "b6f9719e6111c60fdfe40b3c369ac2068adc9407c864237ee18a785c13e9ae210db4646ef8a7c2308fed4eb95e81579d616947190e114e4c0c1793725f17fee3"

RPROVIDES:${PN} += "libQCoro6DBus.so.0()(64bit) libQCoro6DBus0 libQCoro6DBus0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
