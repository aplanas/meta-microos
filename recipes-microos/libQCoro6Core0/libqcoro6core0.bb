SUMMARY = "Core library of qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides the core library."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libQCoro6Core0-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "526b64d1841ac8e443ffdd195ee1693c49976ccc41fc3af213fb09e55a00f1d1e9a02bfa69e545e13cb53b9ffa444c78c0a74af6698d155b37075e866d5ba7de"

RPROVIDES:${PN} += "libQCoro6Core.so.0()(64bit) libQCoro6Core0 libQCoro6Core0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
