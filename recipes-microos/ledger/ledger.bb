SUMMARY = "Double-entry accounting system with a command-line reporting interface"
DESCRIPTION = "Ledger is a powerful, double-entry accounting system that is accessed from \
the UNIX command-line. This may put off some users, since there is no \
flashy UI, but for those who want unparalleled reporting access to their \
data there are few alternatives."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "ledger-3.2.1-3.16.aarch64.rpm"
RPM_HASH = "8bfd3de50dd1c7b19035196a92024bbdcbec2f5d25819ac6821d211ae331dec02d055076f31d883fe81ea8095a104f34d47ce7cbbfa65fbd8684de3bbc551b39"

RPROVIDES:${PN} += "ledger ledger(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_filesystem.so.1.82.0()(64bit) libboost_iostreams.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpfr.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
