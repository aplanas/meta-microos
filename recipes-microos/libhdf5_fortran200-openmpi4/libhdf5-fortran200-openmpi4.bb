SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "c8eb8102966786f7161e00acc06b2fd1b617505a58bf854a572b82f856d6bd56f4481db9a1b2e3aa90f859721f767e3f84accea404bd488d7b94d88047e72c92"

RPROVIDES:${PN} += "libhdf5_fortran-openmpi4 \
libhdf5_fortran.so.200()(64bit) \
libhdf5_fortran200-openmpi4 \
libhdf5_fortran200-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libmpi.so.40()(64bit)"

inherit rpm
