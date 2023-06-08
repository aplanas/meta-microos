SUMMARY = "Base package of kdepim"
DESCRIPTION = "This package contains the libkdepim library."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkdepim-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "73f8f8a3db1608b45e25ec7e5fc2f92b6cd47042bf59925a7b10ab706c6895f5f286a9a44dc190c3983bd5922cfc923c05f84a6a98d24b149f3b5aef6b5be717"

RPROVIDES:${PN} += "libkdepim libkdepim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPim5Libkdepim.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
