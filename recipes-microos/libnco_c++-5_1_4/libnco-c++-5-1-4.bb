SUMMARY = "Libraries for accessing nco"
DESCRIPTION = "The netCDF Operators, NCO, are a suite of command line programs to \
facilitate manipulation and analysis of self-describing data stored \
in the netCDF and HDF formats. \
 \
This package contains a C++ shared library for accessing HDF and \
netCDF files."
LICENSE = "BSD-3-Clause"

PV = "5.1.4"

RPM_NAME = "libnco_c++-5_1_4-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "c2c75d2c8ee63d099127d1c50141c18be66a8bb059703ce254d1d334c26a6a7b34d5d9eb6f69abe703e78616a78807bfc6e115634b13047b260b090cbc107a4a"

RPROVIDES:${PN} += "libnco_c++ \
libnco_c++-5 \
libnco_c++-5.1.4.so()(64bit) \
libnco_c++-5_1_4 \
libnco_c++-5_1_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnetcdf.so.19()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
