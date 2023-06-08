SUMMARY = "Qt 5 RemoteObjects Library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5RemoteObjects5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "692808e9d57ae2b25096845ad1aab2503f2e5e96ecb135c674dcb28e7458e9be7a5b9180e404749ee55e9c3c326a62c4d65468e090b5e2d5a75255c6096bc4bb"

RPROVIDES:${PN} += "libQt5RemoteObjects.so.5()(64bit) libQt5RemoteObjects.so.5(Qt_5)(64bit) libQt5RemoteObjects.so.5(Qt_5.0)(64bit) libQt5RemoteObjects.so.5(Qt_5.1)(64bit) libQt5RemoteObjects.so.5(Qt_5.10)(64bit) libQt5RemoteObjects.so.5(Qt_5.11)(64bit) libQt5RemoteObjects.so.5(Qt_5.12)(64bit) libQt5RemoteObjects.so.5(Qt_5.13)(64bit) libQt5RemoteObjects.so.5(Qt_5.14)(64bit) libQt5RemoteObjects.so.5(Qt_5.15)(64bit) libQt5RemoteObjects.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5RemoteObjects.so.5(Qt_5.2)(64bit) libQt5RemoteObjects.so.5(Qt_5.3)(64bit) libQt5RemoteObjects.so.5(Qt_5.4)(64bit) libQt5RemoteObjects.so.5(Qt_5.5)(64bit) libQt5RemoteObjects.so.5(Qt_5.6)(64bit) libQt5RemoteObjects.so.5(Qt_5.7)(64bit) libQt5RemoteObjects.so.5(Qt_5.8)(64bit) libQt5RemoteObjects.so.5(Qt_5.9)(64bit) libQt5RemoteObjects5 libQt5RemoteObjects5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core5 libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
