SUMMARY = "Shared Libraries for ktoblzcheck"
DESCRIPTION = "This package contains shared Libraries for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "libktoblzcheck1-1.53-1.4.aarch64.rpm"
RPM_HASH = "9049494ea8e8efb6be373a5da6997a79fa5977a8f1b005cf525153b343642eaf00d149a80f4c19c84c03c4a7e7c41200052b2dd07712057bb7697d043b009313"

RPROVIDES:${PN} += "libktoblzcheck.so.1()(64bit) libktoblzcheck1 libktoblzcheck1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
