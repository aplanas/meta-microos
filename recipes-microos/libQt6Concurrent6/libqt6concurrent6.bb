SUMMARY = "Qt 6 Concurrent library"
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
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Concurrent6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "8c839aaffa867b43d108eb5fba115f518c5383020514af23f7f3fc1b15704081adbe69a2d511b1199b6f52789c704048b5ad481bdcf5256fd11a007926f8210e"

RPROVIDES:${PN} += "libQt6Concurrent.so.6()(64bit) libQt6Concurrent.so.6(Qt_6)(64bit) libQt6Concurrent.so.6(Qt_6.0)(64bit) libQt6Concurrent.so.6(Qt_6.1)(64bit) libQt6Concurrent.so.6(Qt_6.2)(64bit) libQt6Concurrent.so.6(Qt_6.3)(64bit) libQt6Concurrent.so.6(Qt_6.4)(64bit) libQt6Concurrent.so.6(Qt_6.5)(64bit) libQt6Concurrent.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Concurrent6 libQt6Concurrent6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core6 libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
