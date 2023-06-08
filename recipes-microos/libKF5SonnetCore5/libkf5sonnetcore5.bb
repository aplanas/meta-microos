SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5SonnetCore5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "175549b3ccca08dfe30ff5a5344b33d6823c6f42ed5fcf7949f8c97a2a5c4d753836e188511d66edf881ee88d6fbb8cfcd8b5da1deedeaff4f7d0e6590452c49"

RPROVIDES:${PN} += "libKF5SonnetCore.so.5()(64bit) libKF5SonnetCore5 libKF5SonnetCore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) sonnet"

inherit rpm
