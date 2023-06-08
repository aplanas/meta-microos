SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libdolphinvcs5-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "3255942c1b6dced5bfa32b60500844e31b5a382750aa9fe30207c1b6b5ce4e8fe323439b9b55380e8fad97b636a00a89b744cbb7c378fb17cbce89add2a2c68a"

RPROVIDES:${PN} += "libdolphinvcs.so.5()(64bit) libdolphinvcs5 libdolphinvcs5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
