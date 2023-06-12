SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "solid-tools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "59b47e8eae648cacd02df670ddcc1f13b5fb3dbdc601769a86a6b297959901992437a13aca234eaf7bb0e463ed46743d6d2999e938cd0a0df44fe9718c6da0fe"

RPROVIDES:${PN} += "solid-tools solid-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
