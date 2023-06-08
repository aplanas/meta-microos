SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "solid-tools-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "dc799a782b47a2436a9b5e23d58ab3a0b2696cff279608f5b3aa91ee4080eba6b4e369afe864657dd8e7bbbab7f4cdab1d7090ce05485aaf126b13c951c3d6e3"

RPROVIDES:${PN} += "solid-tools solid-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
