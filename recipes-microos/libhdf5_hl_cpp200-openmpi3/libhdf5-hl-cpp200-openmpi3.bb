SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "529f117e740014c767d58e0e763f3e60343c353d7715fa276a33cd484e0307b21c8cd95ce43ec1a54dbda6d3d45a9c1237ee61e243a691b4d8a027c465017607"

RPROVIDES:${PN} += "libhdf5_hl_cpp-openmpi3 \
libhdf5_hl_cpp.so.200()(64bit) \
libhdf5_hl_cpp200-openmpi3 \
libhdf5_hl_cpp200-openmpi3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhdf5_hl.so.200()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
