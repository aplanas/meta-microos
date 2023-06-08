SUMMARY = "A library to check account numbers and bank codes of German banks"
DESCRIPTION = "KtoBLZCheck is a library to check account numbers and bank codes \
of German banks. Both a library for other programs as well as a \
short command-line tool is available. It is possible to check \
pairs of account numbers and bank codes (BLZ) of German banks, \
and to map bank codes (BLZ) to the clear-text name and location \
of the bank."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "ktoblzcheck-1.53-1.4.aarch64.rpm"
RPM_HASH = "82fbe386745baf29f2279f4a4eb273c3a2f5970d1ff5f26f4d53bc888ccbd1adeaafbea55fbdea69855cbd1ce5ffe736e0d24939d9c3a2950e0eb64c6eeea58e"

RPROVIDES:${PN} += "ktoblzcheck ktoblzcheck(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libktoblzcheck.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
