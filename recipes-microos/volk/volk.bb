SUMMARY = "Vector-Optimized Library of Kernels"
DESCRIPTION = "VOLK provides a library of vector-optimized kernels. It is a subproject \
of GNU Radio, but can also be used standalone."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "volk-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "3f0d57a1fb136cdc1f87c43c9a8645ffa5da9c6723bad386c60a1b68a2136aa961b24a332d93f3f2ca720d136b66807e177ee147d6dd79dd47b7c978703f6bd5"

RPROVIDES:${PN} += "bundled(cpu_features) volk volk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvolk.so.3.0()(64bit)"

inherit rpm
