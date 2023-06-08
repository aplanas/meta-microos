SUMMARY = "Library for computations with polyhedra"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification."
LICENSE = "GPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libpplite1-0.7-1.9.aarch64.rpm"
RPM_HASH = "7cee8c20e91e0ad6e893311bb6b2cb9f22ba11cb7122fb045bbe9ca0878f4b85f55a90b5747f000664ed8b20e6cd4cd162d5160d343cc096bb24c65af7af0991"

RPROVIDES:${PN} += "libpplite.so.1()(64bit) libpplite1 libpplite1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libflint.so.17()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgmp.so.10()(64bit) libgmpxx.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
