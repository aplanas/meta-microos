SUMMARY = "C++ interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl14-1.2-3.1.aarch64.rpm"
RPM_HASH = "f2cdcf6d7f7a55984eccfad33f73fdaf738e26e13ff9aedabd0f74aefd07effde9bde6cf79b55518b8897c768f0bb2f07306eec1d5ee6574ce64c5d5cf37e65a"

RPROVIDES:${PN} += "libppl.so.14()(64bit) libppl14 libppl14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libgmpxx.so.4()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
