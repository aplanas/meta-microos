SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations. This package contains the \
library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5PkPass5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f8a52e52b4edc37f794c0ab731cbe517aec3b2875d76de9838c0cb60d6f790e6030ce9b0d14e306ccd34bac00c45d5e0cca1a9455f74f7324c0f4f5f0ecb72b1"

RPROVIDES:${PN} += "libKPim5PkPass.so.5()(64bit) libKPim5PkPass5 libKPim5PkPass5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
