SUMMARY = "LeechCraft Simple storage Module"
DESCRIPTION = "This package provides a simple unencrypted storage backend for LeechCraft SecMan."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-secman-simplestorage-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "fa7a46b01e375b39adb48f189f94831ac02019d3d35cca9d958539dca8e2543ada6c76c19236ff544e473ccfb1d59ad427bf92c0a5db606e38e61a4193ada428"

RPROVIDES:${PN} += "leechcraft-secman-simplestorage leechcraft-secman-simplestorage(aarch-64) libleechcraft_secman_simplestorage.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-secman libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
