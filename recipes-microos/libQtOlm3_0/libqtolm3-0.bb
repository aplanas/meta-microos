SUMMARY = "Qt wrapper for libolm"
DESCRIPTION = "This is a Qt wrapper for libolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libQtOlm3_0-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "0a32d85451c3a5adcdfdf582589c7b3138bb4cd42aceb9daf538714f7d5549a4eb3c8651418081a8b118335a1078500ff3796a13fd05c74fb299bf0c90668a2f"

RPROVIDES:${PN} += "libQtOlm.so.3.0()(64bit) libQtOlm3_0 libQtOlm3_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libolm.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
