SUMMARY = "Qt 5 Concurrent Library"
DESCRIPTION = "The QtConcurrent namespace provides high-level APIs that help write \
multi-threaded programs without using low-level threading primitives \
such as mutexes, read-write locks, wait conditions, or semaphores. \
Programs written with QtConcurrent automatically adjust the number of \
threads used according to the number of processor cores available. \
 \
QtConcurrent includes functional programming style APIs for parallel \
list processing, including a MapReduce and FilterReduce \
implementation for shared-memory (non-distributed) systems, and \
classes for managing asynchronous computations in GUI applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Concurrent5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "eb39a2c0e1ea03f4bf7c029d51ec5dfefc5dceb42a5a66c81723110f983adfa24e0c26eef230ce61846b66bd3b32c8852d5cc430721a43eeaf4b8d5637d2246b"

RPROVIDES:${PN} += "libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Concurrent.so.5(Qt_5.0)(64bit) libQt5Concurrent.so.5(Qt_5.1)(64bit) libQt5Concurrent.so.5(Qt_5.10)(64bit) libQt5Concurrent.so.5(Qt_5.11)(64bit) libQt5Concurrent.so.5(Qt_5.12)(64bit) libQt5Concurrent.so.5(Qt_5.13)(64bit) libQt5Concurrent.so.5(Qt_5.14)(64bit) libQt5Concurrent.so.5(Qt_5.15)(64bit) libQt5Concurrent.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Concurrent.so.5(Qt_5.2)(64bit) libQt5Concurrent.so.5(Qt_5.3)(64bit) libQt5Concurrent.so.5(Qt_5.4)(64bit) libQt5Concurrent.so.5(Qt_5.5)(64bit) libQt5Concurrent.so.5(Qt_5.6)(64bit) libQt5Concurrent.so.5(Qt_5.7)(64bit) libQt5Concurrent.so.5(Qt_5.8)(64bit) libQt5Concurrent.so.5(Qt_5.9)(64bit) libQt5Concurrent5 libQt5Concurrent5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
