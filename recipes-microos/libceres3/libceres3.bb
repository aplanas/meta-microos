SUMMARY = "Ceres Solver shared library"
DESCRIPTION = "Ceres Solver is a C++ library for modeling and solving large, \
complicated optimization problems. It can be used to solve Non-linear Least \
Squares problems with bounds constraints and general unconstrained optimization \
problems. \
 \
This package is built with Eigen only."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "libceres3-2.1.0-1.4.aarch64.rpm"
RPM_HASH = "1653c068816e88152a331165d3320f10031429a48bd106ca3431efaa2e0ebf5a8d0e025fb29ffe855938adfc57fa802d7f1602878f215255d7e2ea736ff7c837"

RPROVIDES:${PN} += "libceres.so.3()(64bit) libceres3 libceres3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libcholmod.so.3()(64bit) libcxsparse.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglog.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas.so.0()(64bit) libspqr.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
