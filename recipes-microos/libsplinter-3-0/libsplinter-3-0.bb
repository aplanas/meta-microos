SUMMARY = "A library for multivariate function approximation implemented in C++"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. Currently, \
the library contains the following implementations: \
 \
1. tensor product B-splines, \
2. radial basis functions, including the thin plate spline, and \
3. polynomial regression. \
 \
The coefficients in these models are computed using ordinary least \
squares (OLS). The name of the library, SPLINTER, originates from the \
tensor product B-spline implementation, which was the first of the \
methods to be implemented."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "libsplinter-3-0-3.0-2.22.aarch64.rpm"
RPM_HASH = "f8cea8b885e776a66ae1d4a1e3f8453fc64c89046c54e9a5f98cf884e98288f7f482740cd5585f822f26e9a8df05acef64dcb5e1d166dcdc0ef753c57e91e7d6"

RPROVIDES:${PN} += "libsplinter-3-0 \
libsplinter-3-0(aarch-64) \
libsplinter-3-0.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
