SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations. This package contains the \
library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5PkPass5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2cc6ac6177daef1e054f7b3fdb4e0fa3ed3d91a4cb9f43a437cf50b4dce443e67cd99233e6cf276d08c08381f078dd7a1081aecf526cc201d7533d28b4b105f2"

RPROVIDES:${PN} += "libKPim5PkPass.so.5()(64bit) libKPim5PkPass5 libKPim5PkPass5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
