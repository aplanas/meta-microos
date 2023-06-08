SUMMARY = "Development files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "9d1e61c977454f852a5814feff95d8ce5c952c699889043256b1ff27a253c63ad83db6248d9200041f3a07d6ce73982f78eee277b90c91379dca8b724e872ee7"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-hpc-devel hdf5_1_12_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc-devel hdf5_1_12_2-gnu-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libhdf5_1_12_2-gnu-hpc libhdf5_cpp_1_12_2-gnu-hpc libhdf5_fortran_1_12_2-gnu-hpc libhdf5_hl_1_12_2-gnu-hpc libhdf5_hl_cpp_1_12_2-gnu-hpc libhdf5hl_fortran_1_12_2-gnu-hpc libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) zlib-devel"

inherit rpm
