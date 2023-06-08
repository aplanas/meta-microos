SUMMARY = "Efficient evaluation of integrals over ab initio effective core potentials"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libecpint1-1.0.7-2.10.aarch64.rpm"
RPM_HASH = "51040cf73e1834f795b8af4fec70d8f420dcc0fbfa215fd7d878642ba2ff3e1d32ce53aa74add7f87698a4d40acb455a4c72b0aeb95f0ef116cc75e3f297b739"

RPROVIDES:${PN} += "libecpint.so.1()(64bit) libecpint1 libecpint1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libcerf.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpugixml.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
